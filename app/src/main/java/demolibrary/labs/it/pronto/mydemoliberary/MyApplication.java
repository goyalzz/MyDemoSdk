package demolibrary.labs.it.pronto.mydemoliberary;

import android.app.Application;

import demolibrary.labs.it.pronto.mylibrary.MyLibrary;

/**
 * Created by pronto on 22/7/16.
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        try {
            MyLibrary.init(this, "MyAdvertiserId", "MyPublisherId");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
