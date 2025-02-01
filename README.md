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

