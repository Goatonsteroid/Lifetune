package com.example.miniproj;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class ProfileFragment extends Fragment {

    // Initialisation
    private TextView logOut;
    private FirebaseAuth firebaseAuth;
    private Context context;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_profile, container, false);

        firebaseAuth = FirebaseAuth.getInstance();
        context = view.getContext();

        logOut = view.findViewById(R.id.logOut);

        logOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showLogoutDialog();
            }
        });
        return view;
    }

    private void showLogoutDialog() {
        // Create the alert dialog
        new AlertDialog.Builder(getActivity())
                .setTitle("Log Out")
                .setMessage("Are you sure you want to log out?")
                .setPositiveButton("Yes", (dialog, which) -> {
                    // Perform logout action
                    firebaseAuth.signOut();
                    Intent intent = new Intent(getActivity(), MainActivity.class);
                    startActivity(intent);
                    getActivity().getSupportFragmentManager()
                            .beginTransaction()
                            .remove(ProfileFragment.this)
                            .commit();
                })
                .setNegativeButton("No", (dialog, which) -> {
                    // Dismiss the dialog
                    dialog.dismiss();
                })
                .show();
    }
}