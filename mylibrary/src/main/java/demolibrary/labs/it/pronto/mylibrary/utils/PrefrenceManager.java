package demolibrary.labs.it.pronto.mylibrary.utils;

import android.content.Context;
import android.content.SharedPreferences;

import demolibrary.labs.it.pronto.mylibrary.R;

/**
 * Created by pronto on 23/7/16.
 */
public class PrefrenceManager {

    private static PrefrenceManager instance;

    private SharedPreferences sharedPreferences;

    private SharedPreferences.Editor editor;

    private PrefrenceManager() {}

    private PrefrenceManager(Context context) {
        sharedPreferences = context.getSharedPreferences(context.getString(R.string.app_name), Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }

    public static PrefrenceManager getInstance(Context context) {
        if(instance == null) {
            instance = new PrefrenceManager(context);
        }

        return instance;
    }

    public String getString(String key, String defaultValue) {
        return sharedPreferences.getString(key, defaultValue);
    }

    public Boolean setString(String key, String value) {
        return editor.putString(key, value).commit();
    }

}
