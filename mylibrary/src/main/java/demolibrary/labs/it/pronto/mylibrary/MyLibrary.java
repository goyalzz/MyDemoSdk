package demolibrary.labs.it.pronto.mylibrary;

import android.Manifest;
import android.content.Context;

import demolibrary.labs.it.pronto.mylibrary.contentmodels.MyLibraryManager;
import demolibrary.labs.it.pronto.mylibrary.utils.MyLibraryUtils;

/**
 * Created by pronto on 22/7/16.
 */
public class MyLibrary {

    private static MyLibrary instance;

    private MyLibraryManager mylibraryManager;

    private Context context;

    private MyLibrary() {

    }

    private MyLibrary(Context context) {
        this.context = context;
    }

    public static MyLibrary getInstance(Context context) {
        if (instance == null) {
            instance = new MyLibrary(context);
        }

        return instance;
    }

    public static void init(Context context, String advertiserId, String publisherId) throws Exception {

        if (instance == null)
            instance = new MyLibrary(context);

        if (!MyLibraryUtils.hasPermission(context.getApplicationContext(), Manifest.permission.INTERNET))
            throw new Exception("Internet Permission Required In Manifest File");

    }

}