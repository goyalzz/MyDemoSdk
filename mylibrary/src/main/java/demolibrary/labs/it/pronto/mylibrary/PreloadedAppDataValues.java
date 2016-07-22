package demolibrary.labs.it.pronto.mylibrary;

import java.util.HashMap;

/**
 * Created by pronto on 22/7/16.
 */
public class PreloadedAppDataValues {

    private static PreloadedAppDataValues instance;

    private HashMap<String, String> dataSet = new HashMap<>();

    private PreloadedAppDataValues() {}

    public static PreloadedAppDataValues getInstance() {
        if(instance == null) {
            instance = new PreloadedAppDataValues();
        }

        return instance;
    }

    public HashMap<String, String> getDataSet() {
        return dataSet;
    }

    public void setPublisherId(String value) {
        dataSet.put(MyApiUrlKeys.PUBLISHER_ID, value);
    }

    public String getPublisherId() {
        if(dataSet.containsKey(MyApiUrlKeys.PUBLISHER_ID)) {
            return dataSet.get(MyApiUrlKeys.PUBLISHER_ID);
        }

        return null;
    }

    public void setOfferId(String value) {
        dataSet.put(MyApiUrlKeys.OFFER_ID, value);
    }

    public String getOfferId() {
        if(dataSet.containsKey(MyApiUrlKeys.OFFER_ID)) {
            return dataSet.get(MyApiUrlKeys.OFFER_ID);
        }

        return null;
    }

    public void setAgencyId(String value) {
        dataSet.put(MyApiUrlKeys.AGENCY_ID, value);
    }

    public String getAgencyId() {
        if(dataSet.containsKey(MyApiUrlKeys.AGENCY_ID)) {
            return dataSet.get(MyApiUrlKeys.AGENCY_ID);
        }

        return null;
    }
}
