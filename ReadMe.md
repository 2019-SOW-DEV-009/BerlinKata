# Aim of this application:
Demostrate the Berlin Time representation of equivalent Digital Time.

# BerlinClock(Berlin Time) - Rules

The Berlin Clock (Mengenlehreclock or Berlin Uhr) is a clock that tells the time using a series of illuminated coloured blocks, as you can see in the picture for this project.

The top lamp blinks to show seconds- it is illuminated on even seconds and off on odd seconds.

The next two rows represent hours. The upper row represents 5 hour blocks and is made up of 4 red lamps. The lower row represents 1 hour blocks and is also made up of 4 red lamps.

The final two rows represent the minutes. The upper row represents 5 minute blocks, and is made up of 11 lamps- every third lamp is red, the rest are yellow. The bottom row represents 1 minute blocks, and is made up of 4 yellow lamps.

# Available Feature
### Converting Digital Time to Berlin Time :
User can input time in the format of hh:mm:ss (Digital Time) and convert it to Berlin Time Format

# How to run the app on device (From Windows machine)
```sh
$ gradlew installDebug
```
# How to run the app on device (From mac machine)
```sh
$ sh ./gradlew installDebug
```

# Run unit tests (From Windows machine)
```sh
$ gradlew testDebugUnitTest
```
# Run unit tests (From mac machine)
```sh
$ sh ./gradlew testDebugUnitTest
```
