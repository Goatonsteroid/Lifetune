package com.example.miniproj;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class SignUpActivity extends AppCompatActivity {
    //Widgets
    TextInputEditText username_create, email_create, pwd_create;
    Button signUpBtn;

    //Firebase user
    private FirebaseUser currentUser;

    //Firebase Authentication
    private FirebaseAuth firebaseAuth;
    private FirebaseAuth.AuthStateListener authStateListener;

    //FireStore
    private FirebaseFirestore db = FirebaseFirestore.getInstance();
    private CollectionReference collectionReference = db.collection("Users");

    // SharedPreference
    private SharedPreferences sharedPreferences;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //Importing views and widgets
        username_create = findViewById(R.id.usernameBox);
        email_create = findViewById(R.id.contactBox);
        pwd_create = findViewById(R.id.passwordBox);
        signUpBtn = findViewById(R.id.signUp);

        //Firebase
        firebaseAuth = FirebaseAuth.getInstance();
/*
        //AuthStateListener listening for changes in authentication state
        //and responding accordingly
        authStateListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                currentUser = firebaseAuth.getCurrentUser();
                if(currentUser != null){
                    //user is logged in

                }else{
                    //user logged out

                }
            }
        };
*/

        String email = getIntent().getStringExtra("email");
        if(email != null){
            email_create.setText(email);
        }

        //Sign up button event
        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!TextUtils.isEmpty(email_create.getText().toString()) && !TextUtils.isEmpty(pwd_create.getText().toString()) && !TextUtils.isEmpty(username_create.getText().toString())){
                    String email = email_create.getText().toString().trim();
                    String pwd = pwd_create.getText().toString().trim();
                    String username = username_create.getText().toString().trim();

                    createUserEmailPwd(email,pwd,username);
                }else{
                    Toast.makeText(SignUpActivity.this, "No fields are allowed to be empty", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void createUserEmailPwd(String email,String pwd, String username){
        if(!TextUtils.isEmpty(email) && !TextUtils.isEmpty(pwd) && !TextUtils.isEmpty(username)){
            firebaseAuth.createUserWithEmailAndPassword(email,pwd).addOnCompleteListener(SignUpActivity.this, new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if(task.isSuccessful()){
                        Toast.makeText(SignUpActivity.this, "New User created", Toast.LENGTH_SHORT).show();
                        sharedPreferences = getSharedPreferences("my_pref",MODE_PRIVATE);
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putString("username",username_create.getText().toString());
                        editor.commit();
                        Intent intent = new Intent(SignUpActivity.this, MainScreen.class);
                        startActivity(intent);
                        finishAffinity();
                    }else{
                        Toast.makeText(SignUpActivity.this, "Problem Signing In", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }else{
            Toast.makeText(SignUpActivity.this, "Fill all the fields", Toast.LENGTH_SHORT).show();
        }
    }
}