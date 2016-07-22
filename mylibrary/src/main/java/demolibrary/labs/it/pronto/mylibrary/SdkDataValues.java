package demolibrary.labs.it.pronto.mylibrary;

import java.util.HashMap;

/**
 * Created by pronto on 22/7/16.
 */
public class SdkDataValues {

    private static SdkDataValues instance;

    private HashMap<String, String> dataSet = new HashMap<>();

    private SdkDataValues() { }

    public static SdkDataValues getInstance() {
        if(instance == null) {
            instance = new SdkDataValues();
        }

        return instance;
    }

    public HashMap<String, String> getDataSet() {
        return dataSet;
    }

    public void setAction(String action) {
        dataSet.put(MyApiUrlKeys.ACTION, action);
    }

    public String getAction() {
        if(dataSet.containsKey(MyApiUrlKeys.ACTION)) {
            return dataSet.get(MyApiUrlKeys.ACTION);
        }

        return null;
    }

    public void setAdvertiserId(String action) {
        dataSet.put(MyApiUrlKeys.ADVERTISER_ID, action);
    }

    public String getAdvertiserId() {
        if(dataSet.containsKey(MyApiUrlKeys.ADVERTISER_ID)) {
            return dataSet.get(MyApiUrlKeys.ADVERTISER_ID);
        }

        return null;
    }

    public void setDebugMode(String debugMode) {
        dataSet.put(MyApiUrlKeys.DEBUG_MODE, debugMode);
    }

    public String getDebugMode() {
        if(dataSet.containsKey(MyApiUrlKeys.DEBUG_MODE)) {
            return dataSet.get(MyApiUrlKeys.DEBUG_MODE);
        }

        return null;
    }

    public void setEventId(String eventId) {
        dataSet.put(MyApiUrlKeys.EVENT_ID, eventId);
    }

    public String getEventId() {
        if(dataSet.containsKey(MyApiUrlKeys.EVENT_ID)) {
            return dataSet.get(MyApiUrlKeys.EVENT_ID);
        }

        return null;
    }

    public void setEventName(String eventName) {
        dataSet.put(MyApiUrlKeys.EVENT_NAME, eventName);
    }

    public String getEventName() {
        if(dataSet.containsKey(MyApiUrlKeys.EVENT_NAME)) {
            return dataSet.get(MyApiUrlKeys.EVENT_NAME);
        }

        return null;
    }

    public void setPackageName(String value) {
        dataSet.put(MyApiUrlKeys.PACKAGE_NAME, value);
    }

    public String getPackageName() {
        if(dataSet.containsKey(MyApiUrlKeys.PACKAGE_NAME)) {
            return dataSet.get(MyApiUrlKeys.PACKAGE_NAME);
        }

        return null;
    }

    public void setReferralSource(String value) {
        dataSet.put(MyApiUrlKeys.REFERRAL_SOURCE, value);
    }

    public String getReferralSource() {
        if(dataSet.containsKey(MyApiUrlKeys.REFERRAL_SOURCE)) {
            return dataSet.get(MyApiUrlKeys.REFERRAL_SOURCE);
        }

        return null;
    }

    public void setReferralUrl(String value) {
        dataSet.put(MyApiUrlKeys.REFERRAL_URL, value);
    }

    public String getReferralUrl() {
        if(dataSet.containsKey(MyApiUrlKeys.REFERRAL_URL)) {
            return dataSet.get(MyApiUrlKeys.REFERRAL_URL);
        }

        return null;
    }

    public void setTrackingId(String value) {
        dataSet.put(MyApiUrlKeys.TRACKING_ID, value);
    }

    public String getTrackingId() {
        if(dataSet.containsKey(MyApiUrlKeys.TRACKING_ID)) {
            return dataSet.get(MyApiUrlKeys.TRACKING_ID);
        }

        return null;
    }

    public void setSystemDate(String value) {
        dataSet.put(MyApiUrlKeys.SYSTEM_DATE, value);
    }

    public String getSystemDate() {
        if(dataSet.containsKey(MyApiUrlKeys.SYSTEM_DATE)) {
            return dataSet.get(MyApiUrlKeys.SYSTEM_DATE);
        }

        return null;
    }

    public void setSDK(String value) {
        dataSet.put(MyApiUrlKeys.SDK, value);
    }

    public String getSDK() {
        if(dataSet.containsKey(MyApiUrlKeys.SDK)) {
            return dataSet.get(MyApiUrlKeys.SDK);
        }

        return null;
    }

    public void setSdkRetryAttempt(String value) {
        dataSet.put(MyApiUrlKeys.SDK_RETRY_ATTEMPT, value);
    }

    public String getSdkRetryAttempt() {
        if(dataSet.containsKey(MyApiUrlKeys.SDK_RETRY_ATTEMPT)) {
            return dataSet.get(MyApiUrlKeys.SDK_RETRY_ATTEMPT);
        }

        return null;
    }

    public void setSdkVer(String value) {
        dataSet.put(MyApiUrlKeys.SDK_VER, value);
    }

    public String getSdkVer() {
        if(dataSet.containsKey(MyApiUrlKeys.SDK_VER)) {
            return dataSet.get(MyApiUrlKeys.SDK_VER);
        }

        return null;
    }

    public void setTransactionId(String value) {
        dataSet.put(MyApiUrlKeys.TRANSACTION_ID, value);
    }

    public String getTransactionId() {
        if(dataSet.containsKey(MyApiUrlKeys.TRANSACTION_ID)) {
            return dataSet.get(MyApiUrlKeys.TRANSACTION_ID);
        }

        return null;
    }
}
