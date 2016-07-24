package demolibrary.labs.it.pronto.mylibrary.contentmodels;

/**
 * Created by pronto on 22/7/16.
 */
public class MyLibraryManager {

    private SdkDataValues sdkDataValues = SdkDataValues.getInstance();

    private PreloadedAppDataValues preloadedAppDataValues = PreloadedAppDataValues.getInstance();

    private EncryptedDataValues encryptedDataValues = EncryptedDataValues.getInstance();

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

    public EncryptedDataValues getEncryptedDataValues() {
        return encryptedDataValues;
    }

    public void setEncryptedDataValues(EncryptedDataValues encryptedDataValues) {
        this.encryptedDataValues = encryptedDataValues;
    }
}
