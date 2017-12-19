# samsung-resolution

Sample project to demonstrate invalid resolution reported by Android on selected Samsung devices.

### Steps to reproduce

Install the sample app with the package id set to either `com.digitalstrawberry.jigsawbug` or `com.digitalstrawberry.jigsawdaily`.

1. Launch the sample app on a Samsung device with WiFi enabled
2. Note the screen resolution values as shown on the screen (should match the actual device resolution)
3. Terminate the app and then launch it again
4. The screen resolution values will no longer match the actual device resolution

The issue has been successfully reproduced on Samsung Galaxy Tab A 10.1, but it may occur on other Samsung devices, as [reported here](https://github.com/if1live/galaxy-resolution-bug).