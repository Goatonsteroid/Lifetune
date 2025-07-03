# 🛌 Sleep Apnea Detection App  

## 📌 Overview  
The **Sleep Apnea Detection App** is an Android application designed to monitor sleep health by detecting potential sleep apnea symptoms. It integrates **Bluetooth Low Energy (BLE)** to connect with an **ESP32-based embedded system** that collects **SpO2 and BPM** data. The app provides **real-time monitoring, authentication, and local storage** for a seamless user experience.  

---

## 🚀 Features  

### 🔹 **User Authentication**  
- Secure **login and signup** using **Firebase Authentication**.  
- Ensures user data is protected and accessible across devices.  

### 🔹 **BLE Connectivity with ESP32**  
- Connects with an **ESP32-based embedded system** via **Bluetooth Low Energy (BLE)**.  
- Retrieves real-time **SpO2 (oxygen saturation) and BPM (heart rate)** data.  

### 🔹 **Real-time Sleep Monitoring**  
- Displays **live health vitals** on the screen.    

### 🔹 **Local Storage with SQLite**  
- Stores collected data locally using **SQLite**, allowing users to access their history offline.  
- Enables **efficient data retrieval and analysis**.  

### 🔹 **Graphical Representation of Health Data**  
- Displays **SpO2 and BPM trends over time** using visual graphs.  
- Helps users track their health progress.  

### 🔹 **User-friendly Interface**  
- Simple and intuitive UI with **Material Design** for a seamless user experience.  
- Easy **BLE device scanning and connection** for quick setup.  

---

## 🛠 Tech Stack Used  
- **Android (Java)** – App development  
- **Firebase Authentication** – Secure login and signup  
- **BLE (Bluetooth Low Energy)** – Communication with ESP32  
- **SQLite** – Local storage and offline access  
- **ESP32** – Embedded system for data collection  

---

## Screenshots
![image](https://github.com/user-attachments/assets/ef838110-5cbb-4bec-986b-17effbf56b7a)  ![image](https://github.com/user-attachments/assets/2242f922-251a-4c8d-8b58-82cd9ed5f71b)

![image](https://github.com/user-attachments/assets/07ce3c7e-67f0-4725-a5a6-a9ef64a1f6bc)  ![image](https://github.com/user-attachments/assets/3cc1d9de-74a2-43a2-bad9-4ffa94af84b2)

![image](https://github.com/user-attachments/assets/e802253b-4f89-4a17-9f74-064618a6b2c8)  ![image](https://github.com/user-attachments/assets/92864d2d-b8f3-4fcc-be20-e7eaae4918b5)

![image](https://github.com/user-attachments/assets/1a93f46a-dc03-4c5f-a883-672b7e981a02)

---

## 📥 Setup Instructions  

1. **Clone the repository:**  
   ```bash
   git clone https://github.com/Goatonsteroid/Lifetune
2. **Open the project** in **Android Studio**.  
3. **Configure Firebase Authentication** in the project.  
4. **Flash the ESP32 firmware** for BLE communication.  
5. **Build and run the app** on an **Android device** with BLE support.  

---

## 🔮 Future Improvements  
- Implement **cloud storage** for long-term health tracking.  
- Enhance **AI-driven analysis** for better sleep apnea detection.  
- Add **notifications and alerts** for abnormal readings.  

