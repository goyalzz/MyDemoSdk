package demolibrary.labs.it.pronto.mylibrary;

/**
 * Created by pronto on 22/7/16.
 */
public class MyLibraryManager {

    private SdkDataValues sdkDataValues = SdkDataValues.getInstance();

    private PreloadedAppDataValues preloadedAppDataValues = PreloadedAppDataValues.getInstance();

    private static MyLibraryManager instance;

    private MyLibraryManager() { }

    public static MyLibraryManager getInstance() {
        if(instance == null) {
            instance = new MyLibraryManager();
        }

        return instance;
    }

    public SdkDataValues getSdkDataValues() {
        return sdkDataValues;
    }

    public void setSdkDataValues(SdkDataValues sdkDataValues) {
        this.sdkDataValues = sdkDataValues;
    }

    public PreloadedAppDataValues getPreloadedAppDataValues() {
        return preloadedAppDataValues;
    }

    public void setPreloadedAppDataValues(PreloadedAppDataValues preloadedAppDataValues) {
        this.preloadedAppDataValues = preloadedAppDataValues;
    }
}
