package demolibrary.labs.it.pronto.mylibrary.contentmodels;

import java.util.HashMap;

import demolibrary.labs.it.pronto.mylibrary.utils.MyApiUrlKeys;

/**
 * Created by pronto on 22/7/16.
 */
public class EncryptedDataValues {

    private static EncryptedDataValues instance;

    private HashMap<String, String> dataSet = new HashMap<>();

    private EncryptedDataValues() { }

    public static EncryptedDataValues getInstance() {
        if(instance == null) {
            instance = new EncryptedDataValues();
        }

        return instance;
    }

    public HashMap<String, String> getDataSet() {
        return dataSet;
    }

    public void setALatitude(String action) {
        dataSet.put(MyApiUrlKeys.ALTITUDE, action);
    }

    public String getALatitude() {
        if(dataSet.containsKey(MyApiUrlKeys.ALTITUDE)) {
            return dataSet.get(MyApiUrlKeys.ALTITUDE);
        }

        return null;
    }

    public String getAndroidId() {
        if(dataSet.containsKey(MyApiUrlKeys.ANDROID_ID)) {
            return dataSet.get(MyApiUrlKeys.ANDROID_ID);
        }

        return null;
    }

    public void setAndroidId(String value) {
        dataSet.put(MyApiUrlKeys.ANDROID_ID, value);
    }

    public String getAndroidIdMd5() {
        if(dataSet.containsKey(MyApiUrlKeys.ANDROID_ID_MD5)) {
            return dataSet.get(MyApiUrlKeys.ANDROID_ID_MD5);
        }

        return null;
    }

    public void setAndroidIdMd5(String value) {
        dataSet.put(MyApiUrlKeys.ANDROID_ID_MD5, value);
    }

    public String getAndroidIdSha1() {
        if(dataSet.containsKey(MyApiUrlKeys.ANDROID_ID_SHA1)) {
            return dataSet.get(MyApiUrlKeys.ANDROID_ID_SHA1);
        }

        return null;
    }

    public void setAndroidIdSha1(String value) {
        dataSet.put(MyApiUrlKeys.ANDROID_ID_SHA1, value);
    }

    public String getAndroidIdSha256() {
        if(dataSet.containsKey(MyApiUrlKeys.ANDROID_ID_SHA256)) {
            return dataSet.get(MyApiUrlKeys.ANDROID_ID_SHA256);
        }

        return null;
    }

    public void setAndroidIdSha256(String value) {
        dataSet.put(MyApiUrlKeys.ANDROID_ID_SHA256, value);
    }

    public String getAppAdTracking() {
        if(dataSet.containsKey(MyApiUrlKeys.APP_AD_TRACKING)) {
            return dataSet.get(MyApiUrlKeys.APP_AD_TRACKING);
        }

        return null;
    }

    public void setAppAdTracking(String value) {
        dataSet.put(MyApiUrlKeys.APP_AD_TRACKING, value);
    }

    public String getAppName() {
        if(dataSet.containsKey(MyApiUrlKeys.APP_NAME)) {
            return dataSet.get(MyApiUrlKeys.APP_NAME);
        }

        return null;
    }

    public void setAppName(String value) {
        dataSet.put(MyApiUrlKeys.APP_NAME, value);
    }

    public String getAppVersion() {
        if(dataSet.containsKey(MyApiUrlKeys.APP_VERSION)) {
            return dataSet.get(MyApiUrlKeys.APP_VERSION);
        }

        return null;
    }

    public void setAppVersion(String value) {
        dataSet.put(MyApiUrlKeys.APP_VERSION, value);
    }

    public String getAppVersionName() {
        if(dataSet.containsKey(MyApiUrlKeys.APP_VERSION_NAME)) {
            return dataSet.get(MyApiUrlKeys.APP_VERSION_NAME);
        }

        return null;
    }

    public void setAppVersionName(String value) {
        dataSet.put(MyApiUrlKeys.APP_VERSION_NAME, value);
    }

    public String getConnectionType() {
        if(dataSet.containsKey(MyApiUrlKeys.CONNECTION_TYPE)) {
            return dataSet.get(MyApiUrlKeys.CONNECTION_TYPE);
        }

        return null;
    }

    public void setConnectionType(String value) {
        dataSet.put(MyApiUrlKeys.CONNECTION_TYPE, value);
    }

    public String getCountryCode() {
        if(dataSet.containsKey(MyApiUrlKeys.COUNTRY_CODE)) {
            return dataSet.get(MyApiUrlKeys.COUNTRY_CODE);
        }

        return null;
    }

    public void setCountryCode(String value) {
        dataSet.put(MyApiUrlKeys.COUNTRY_CODE, value);
    }

    public String getDeviceBrand() {
        if(dataSet.containsKey(MyApiUrlKeys.DEVICE_BRAND)) {
            return dataSet.get(MyApiUrlKeys.DEVICE_BRAND);
        }

        return null;
    }

    public void setDeviceBrand(String value) {
        dataSet.put(MyApiUrlKeys.DEVICE_BRAND, value);
    }

    public String getDeviceCarrier() {
        if(dataSet.containsKey(MyApiUrlKeys.DEVICE_CARRIER)) {
            return dataSet.get(MyApiUrlKeys.DEVICE_CARRIER);
        }

        return null;
    }

    public void setDeviceCarrier(String value) {
        dataSet.put(MyApiUrlKeys.DEVICE_CARRIER, value);
    }

    public String getDeviceCpuType() {
        if(dataSet.containsKey(MyApiUrlKeys.DEVICE_CPU_TYPE)) {
            return dataSet.get(MyApiUrlKeys.DEVICE_CPU_TYPE);
        }

        return null;
    }

    public void setDeviceCpuType(String value) {
        dataSet.put(MyApiUrlKeys.DEVICE_CPU_TYPE, value);
    }

    public String getDeviceCpuSubtype() {
        if(dataSet.containsKey(MyApiUrlKeys.DEVICE_CPU_SUBTYPE)) {
            return dataSet.get(MyApiUrlKeys.DEVICE_CPU_SUBTYPE);
        }

        return null;
    }

    public void setDeviceCpuSubtype(String value) {
        dataSet.put(MyApiUrlKeys.DEVICE_CPU_SUBTYPE, value);
    }

    public String getDeviceId() {
        if(dataSet.containsKey(MyApiUrlKeys.DEVICE_ID)) {
            return dataSet.get(MyApiUrlKeys.DEVICE_ID);
        }

        return null;
    }

    public void setDeviceId(String value) {
        dataSet.put(MyApiUrlKeys.DEVICE_ID, value);
    }

    public String getDeviceModel() {
        if(dataSet.containsKey(MyApiUrlKeys.DEVICE_MODEL)) {
            return dataSet.get(MyApiUrlKeys.DEVICE_MODEL);
        }

        return null;
    }

    public void setDeviceModel(String value) {
        dataSet.put(MyApiUrlKeys.DEVICE_MODEL, value);
    }

    public String getGoogleAdTracking() {
        if(dataSet.containsKey(MyApiUrlKeys.GOOGLE_AD_TRACKING)) {
            return dataSet.get(MyApiUrlKeys.GOOGLE_AD_TRACKING);
        }

        return null;
    }

    public void setGoogleAdTracking(String value) {
        dataSet.put(MyApiUrlKeys.GOOGLE_AD_TRACKING, value);
    }

    public String getGoogleAid() {
        if(dataSet.containsKey(MyApiUrlKeys.GOOGLE_AID)) {
            return dataSet.get(MyApiUrlKeys.GOOGLE_AID);
        }

        return null;
    }

    public void setGoogleAid(String value) {
        dataSet.put(MyApiUrlKeys.GOOGLE_AID, value);
    }

    public String getInstallDate() {
        if(dataSet.containsKey(MyApiUrlKeys.INSTALL_DATE)) {
            return dataSet.get(MyApiUrlKeys.INSTALL_DATE);
        }

        return null;
    }

    public void setInstallDate(String value) {
        dataSet.put(MyApiUrlKeys.INSTALL_DATE, value);
    }

    public String getInstallReferrer() {
        if(dataSet.containsKey(MyApiUrlKeys.INSTALL_REFERRER)) {
            return dataSet.get(MyApiUrlKeys.INSTALL_REFERRER);
        }

        return null;
    }

    public void setInstallReferrer(String value) {
        dataSet.put(MyApiUrlKeys.INSTALL_REFERRER, value);
    }

    public String getINSTALLER() {
        if(dataSet.containsKey(MyApiUrlKeys.INSTALLER)) {
            return dataSet.get(MyApiUrlKeys.INSTALLER);
        }

        return null;
    }

    public void setINSTALLER(String value) {
        dataSet.put(MyApiUrlKeys.INSTALLER, value);
    }

    public String getLANGUAGE() {
        if(dataSet.containsKey(MyApiUrlKeys.LANGUAGE)) {
            return dataSet.get(MyApiUrlKeys.LANGUAGE);
        }

        return null;
    }

    public void setLANGUAGE(String value) {
        dataSet.put(MyApiUrlKeys.LANGUAGE, value);
    }

    public String getLastOpenLogId() {
        if(dataSet.containsKey(MyApiUrlKeys.LAST_OPEN_LOG_ID)) {
            return dataSet.get(MyApiUrlKeys.LAST_OPEN_LOG_ID);
        }

        return null;
    }

    public void setLastOpenLogId(String value) {
        dataSet.put(MyApiUrlKeys.LAST_OPEN_LOG_ID, value);
    }


    public String getLATITUDE() {
        if(dataSet.containsKey(MyApiUrlKeys.LATITUDE)) {
            return dataSet.get(MyApiUrlKeys.LATITUDE);
        }

        return null;
    }

    public void setLATITUDE(String value) {
        dataSet.put(MyApiUrlKeys.LATITUDE, value);
    }

    public String getLONGITUDE() {
        if(dataSet.containsKey(MyApiUrlKeys.LONGITUDE)) {
            return dataSet.get(MyApiUrlKeys.LONGITUDE);
        }

        return null;
    }

    public void setLONGITUDE(String value) {
        dataSet.put(MyApiUrlKeys.LONGITUDE, value);
    }

    public String getMacAddress() {
        if(dataSet.containsKey(MyApiUrlKeys.MAC_ADDRESS)) {
            return dataSet.get(MyApiUrlKeys.MAC_ADDRESS);
        }

        return null;
    }

    public void setMacAddress(String value) {
        dataSet.put(MyApiUrlKeys.MAC_ADDRESS, value);
    }

    public String getMatId() {
        if(dataSet.containsKey(MyApiUrlKeys.MAT_ID)) {
            return dataSet.get(MyApiUrlKeys.MAT_ID);
        }

        return null;
    }

    public void setMatId(String value) {
        dataSet.put(MyApiUrlKeys.MAT_ID, value);
    }

    public String getMobileCountryCode() {
        if(dataSet.containsKey(MyApiUrlKeys.MOBILE_COUNTRY_CODE)) {
            return dataSet.get(MyApiUrlKeys.MOBILE_COUNTRY_CODE);
        }

        return null;
    }

    public void setMobileCountryCode(String value) {
        dataSet.put(MyApiUrlKeys.MOBILE_COUNTRY_CODE, value);
    }

    public String getMobileNetworkCode() {
        if(dataSet.containsKey(MyApiUrlKeys.MOBILE_NETWORK_CODE)) {
            return dataSet.get(MyApiUrlKeys.MOBILE_NETWORK_CODE);
        }

        return null;
    }

    public void setMobileNetworkCode(String value) {
        dataSet.put(MyApiUrlKeys.MOBILE_NETWORK_CODE, value);
    }

    public String getOpenLogId() {
        if(dataSet.containsKey(MyApiUrlKeys.OPEN_LOG_ID)) {
            return dataSet.get(MyApiUrlKeys.OPEN_LOG_ID);
        }

        return null;
    }

    public void setOpenLogId(String value) {
        dataSet.put(MyApiUrlKeys.OPEN_LOG_ID, value);
    }

    public String getOsVersion() {
        if(dataSet.containsKey(MyApiUrlKeys.OS_VERSION)) {
            return dataSet.get(MyApiUrlKeys.OS_VERSION);
        }

        return null;
    }

    public void setOsVersion(String value) {
        dataSet.put(MyApiUrlKeys.OS_VERSION, value);
    }

    public String getPurchaseStatus() {
        if(dataSet.containsKey(MyApiUrlKeys.PURCHASE_STATUS)) {
            return dataSet.get(MyApiUrlKeys.PURCHASE_STATUS);
        }

        return null;
    }

    public void setPurchaseStatus(String value) {
        dataSet.put(MyApiUrlKeys.PURCHASE_STATUS, value);
    }

    public String getReferrerDelay() {
        if(dataSet.containsKey(MyApiUrlKeys.REFERRER_DELAY)) {
            return dataSet.get(MyApiUrlKeys.REFERRER_DELAY);
        }

        return null;
    }

    public void setReferrerDelay(String value) {
        dataSet.put(MyApiUrlKeys.REFERRER_DELAY, value);
    }

    public String getScreenDensity() {
        if(dataSet.containsKey(MyApiUrlKeys.SCREEN_DENSITY)) {
            return dataSet.get(MyApiUrlKeys.SCREEN_DENSITY);
        }

        return null;
    }

    public void setScreenDensity(String value) {
        dataSet.put(MyApiUrlKeys.SCREEN_DENSITY, value);
    }

    public String getScreenSize() {
        if(dataSet.containsKey(MyApiUrlKeys.SCREEN_SIZE)) {
            return dataSet.get(MyApiUrlKeys.SCREEN_SIZE);
        }

        return null;
    }

    public void setScreenSize(String value) {
        dataSet.put(MyApiUrlKeys.SCREEN_SIZE, value);
    }

    public String getSdkPlugin() {
        if(dataSet.containsKey(MyApiUrlKeys.SDK_PLUGIN)) {
            return dataSet.get(MyApiUrlKeys.SDK_PLUGIN);
        }

        return null;
    }

    public void setSdkPlugin(String value) {
        dataSet.put(MyApiUrlKeys.SDK_PLUGIN, value);
    }

    public String getSdkVersion() {
        if(dataSet.containsKey(MyApiUrlKeys.SDK_VERSION)) {
            return dataSet.get(MyApiUrlKeys.SDK_VERSION);
        }

        return null;
    }

    public void setSdkVersion(String value) {
        dataSet.put(MyApiUrlKeys.SDK_VERSION, value);
    }

    public String getTrusteId() {
        if(dataSet.containsKey(MyApiUrlKeys.TRUSTE_ID)) {
            return dataSet.get(MyApiUrlKeys.TRUSTE_ID);
        }

        return null;
    }

    public void setTrusteId(String value) {
        dataSet.put(MyApiUrlKeys.TRUSTE_ID, value);
    }

    public String getUserAgent() {
        if(dataSet.containsKey(MyApiUrlKeys.USER_AGENT)) {
            return dataSet.get(MyApiUrlKeys.USER_AGENT);
        }

        return null;
    }

    public void setUserAgent(String value) {
        dataSet.put(MyApiUrlKeys.USER_AGENT, value);
    }

    public String getScreenWidth() {
        if(dataSet.containsKey(MyApiUrlKeys.SCREEN_WIDTH)) {
            return dataSet.get(MyApiUrlKeys.SCREEN_WIDTH);
        }

        return null;
    }

    public void setScreenWidth(String value) {
        dataSet.put(MyApiUrlKeys.SCREEN_WIDTH, value);
    }

    public String getScreenHeight() {
        if(dataSet.containsKey(MyApiUrlKeys.SCREEN_HEIGHT)) {
            return dataSet.get(MyApiUrlKeys.SCREEN_HEIGHT);
        }

        return null;
    }

    public void setScreenHeight(String value) {
        dataSet.put(MyApiUrlKeys.SCREEN_HEIGHT, value);
    }
}