# README #
This is my demo library.

### How to Use? ###

 * Import Library as a Module.
 * Set MetaData in Manifest file e.g

    <meta-data android:name="MyLibraryTracker" android:value="@string/trackingId" />
    
 * Requires Dependency:
 
    - compile 'com.google.android.gms:play-services-location:9.2.1' (OPTIONAL)

 * Requires following permissions:
    - Internet Permission
    - ACCESS_FINE_LOCATION Permission
    - Read Phone State
    - Access Wifi State

 * Initialize in Application Class as

    - try {
            MyLibrary.init(this, "MyAdvertiserId", "MyPublisherId");
      } catch (Exception e) {
            e.printStackTrace();
      }