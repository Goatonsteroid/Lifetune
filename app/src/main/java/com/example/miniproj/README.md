**Sleep Apnea Detection App**
Overview
The Sleep Apnea Detection App is an Android application designed to help users monitor their sleep health by detecting potential sleep apnea symptoms. It integrates Bluetooth Low Energy (BLE) to connect with an ESP32-based embedded system that collects SpO2 and BPM data. The app provides real-time monitoring, authentication, and local storage for seamless user experience.

**Features**
🔹 User Authentication
    Secure login and signup using Firebase Authentication.
    Ensures that user data is protected and accessible across devices.
🔹 BLE Connectivity with ESP32
    Connects with an ESP32-based embedded system via Bluetooth Low Energy (BLE).
    Retrieves real-time SpO2 (oxygen saturation) and BPM (heart rate) data.
🔹 Real-time Sleep Monitoring
    Displays live health vitals on the screen.
    Provides insights into potential sleep apnea symptoms based on oxygen levels and heart rate fluctuations.
🔹 Local Storage with SQLite
    Stores collected data locally using SQLite, allowing users to access their history offline.
    Enables efficient data retrieval and analysis.
🔹 Graphical Representation of Health Data
    Displays SpO2 and BPM trends over time using visual graphs.
    Helps users track their health progress.
🔹 User-friendly Interface
    Simple and intuitive UI with Material Design for a seamless user experience.
    Easy BLE device scanning and connection for quick setup.

**Tech Stack Used**
1.     Android (Kotlin/Java) – App development
2.     Firebase Authentication – Secure login and signup
3.     BLE (Bluetooth Low Energy) – Communication with ESP32
4.     SQLite – Local storage and offline access
5.     ESP32 – Embedded system for data collection

**Future Improvements**
1.     Implement cloud storage for long-term health tracking.
2.     Enhance AI-driven analysis for better sleep apnea detection.
3.     Add notifications and alerts for abnormal readings.