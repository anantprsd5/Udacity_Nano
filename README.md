# App Launch Tray

## Command Line instructions on how to install

* chmod +x gradlew - This command only needs to be run once and is used to give gradlew the correct execute permissions.
* ./gradlew assembleDebug - This command will compile the code.
* adb install -r app/build/outputs/apk/app-debug-unaligned.apk - This command will install the APK. With the -r flag it will overwrite any prior installed versions. Note if you have more than one device, you will need to use the -s flag right after adb to specify the serial number of the intended device.
* adb shell am start -n com.example.android.sunshine.app/com.example.android.sunshine.app.MainActivity - This command will actually run the app.

