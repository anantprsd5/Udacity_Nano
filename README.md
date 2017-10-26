# App Launch Tray

Date - 2.9.17

## Command Line instructions on how to install

* _chmod +x gradlew_ - This command only needs to be run once and is used to give gradlew the correct execute permissions.
* _./gradlew assembleDebug_ - This command will compile the code.
* _adb install -r app/build/outputs/apk/app-debug-unaligned.apk_ - This command will install the APK. With the -r flag it will overwrite any prior installed versions. Note if you have more than one device, you will need to use the -s flag right after adb to specify the serial number of the intended device.
* _adb shell am start -n com.example.android.sunshine.app/com.example.android.sunshine.app.MainActivity_ - This command will actually run the app.
# Languages -Java


# Developer - Anant Prasad
https://github.com/anantprsd5


