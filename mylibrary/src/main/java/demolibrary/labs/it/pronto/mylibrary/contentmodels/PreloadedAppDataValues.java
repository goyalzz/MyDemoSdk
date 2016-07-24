package demolibrary.labs.it.pronto.mylibrary.contentmodels;

import java.util.HashMap;

import demolibrary.labs.it.pronto.mylibrary.utils.MyApiUrlKeys;

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

    public String getPublisherRefId() {
        if(dataSet.containsKey(MyApiUrlKeys.PUBLISHER_REF_ID)) {
            return dataSet.get(MyApiUrlKeys.PUBLISHER_REF_ID);
        }

        return null;
    }

    public void setPublisherRefId(String value) {
        dataSet.put(MyApiUrlKeys.PUBLISHER_REF_ID, value);
    }

    public String getPublisherSubPublisher() {
        if(dataSet.containsKey(MyApiUrlKeys.PUBLISHER_SUB_PUBLISHER)) {
            return dataSet.get(MyApiUrlKeys.PUBLISHER_SUB_PUBLISHER);
        }

        return null;
    }

    public void setPublisherSubPublisher(String value) {
        dataSet.put(MyApiUrlKeys.PUBLISHER_SUB_PUBLISHER, value);
    }

    public String getPublisherSubSite() {
        if(dataSet.containsKey(MyApiUrlKeys.PUBLISHER_SUB_SITE)) {
            return dataSet.get(MyApiUrlKeys.PUBLISHER_SUB_SITE);
        }

        return null;
    }

    public void setPublisherSubSite(String value) {
        dataSet.put(MyApiUrlKeys.PUBLISHER_SUB_SITE, value);
    }

    public String getPublisherSubCampaign() {
        if(dataSet.containsKey(MyApiUrlKeys.PUBLISHER_SUB_CAMPAIGN)) {
            return dataSet.get(MyApiUrlKeys.PUBLISHER_SUB_CAMPAIGN);
        }

        return null;
    }

    public void setPublisherSubCampaign(String value) {
        dataSet.put(MyApiUrlKeys.PUBLISHER_SUB_CAMPAIGN, value);
    }

    public String getPublisherSubAdgroup() {
        if(dataSet.containsKey(MyApiUrlKeys.PUBLISHER_SUB_ADGROUP)) {
            return dataSet.get(MyApiUrlKeys.PUBLISHER_SUB_ADGROUP);
        }

        return null;
    }

    public void setPublisherSubAdgroup(String value) {
        dataSet.put(MyApiUrlKeys.PUBLISHER_SUB_ADGROUP, value);
    }

    public String getPublisherSubAd() {
        if(dataSet.containsKey(MyApiUrlKeys.PUBLISHER_SUB_AD)) {
            return dataSet.get(MyApiUrlKeys.PUBLISHER_SUB_AD);
        }

        return null;
    }

    public void setPublisherSubAd(String value) {
        dataSet.put(MyApiUrlKeys.PUBLISHER_SUB_AD, value);
    }

    public String getPublisherSubKeyword() {
        if(dataSet.containsKey(MyApiUrlKeys.PUBLISHER_SUB_KEYWORD)) {
            return dataSet.get(MyApiUrlKeys.PUBLISHER_SUB_KEYWORD);
        }

        return null;
    }

    public void setPublisherSubKeyword(String value) {
        dataSet.put(MyApiUrlKeys.PUBLISHER_SUB_KEYWORD, value);
    }

    public String getPublisherSub1() {
        if(dataSet.containsKey(MyApiUrlKeys.PUBLISHER_SUB1)) {
            return dataSet.get(MyApiUrlKeys.PUBLISHER_SUB1);
        }

        return null;
    }

    public void setPublisherSub1(String value) {
        dataSet.put(MyApiUrlKeys.PUBLISHER_SUB1, value);
    }

    public String getPublisherSub2() {
        if(dataSet.containsKey(MyApiUrlKeys.PUBLISHER_SUB2)) {
            return dataSet.get(MyApiUrlKeys.PUBLISHER_SUB2);
        }

        return null;
    }

    public void setPublisherSub2(String value) {
        dataSet.put(MyApiUrlKeys.PUBLISHER_SUB2, value);
    }

    public String getPublisherSub3() {
        if(dataSet.containsKey(MyApiUrlKeys.PUBLISHER_SUB3)) {
            return dataSet.get(MyApiUrlKeys.PUBLISHER_SUB3);
        }

        return null;
    }

    public void setPublisherSub3(String value) {
        dataSet.put(MyApiUrlKeys.PUBLISHER_SUB3, value);
    }

    public String getPublisherSub4() {
        if(dataSet.containsKey(MyApiUrlKeys.PUBLISHER_SUB4)) {
            return dataSet.get(MyApiUrlKeys.PUBLISHER_SUB4);
        }

        return null;
    }

    public void setPublisherSub4(String value) {
        dataSet.put(MyApiUrlKeys.PUBLISHER_SUB4, value);
    }

    public String getPublisherSub5() {
        if(dataSet.containsKey(MyApiUrlKeys.PUBLISHER_SUB5)) {
            return dataSet.get(MyApiUrlKeys.PUBLISHER_SUB5);
        }

        return null;
    }

    public void setPublisherSub5(String value) {
        dataSet.put(MyApiUrlKeys.PUBLISHER_SUB5, value);
    }

    public String getAdvertiserSubPublisher() {
        if(dataSet.containsKey(MyApiUrlKeys.ADVERTISER_SUB_PUBLISHER)) {
            return dataSet.get(MyApiUrlKeys.ADVERTISER_SUB_PUBLISHER);
        }

        return null;
    }

    public void setAdvertiserSubPublisher(String value) {
        dataSet.put(MyApiUrlKeys.ADVERTISER_SUB_PUBLISHER, value);
    }

    public String getAdvertiserSubSite() {
        if(dataSet.containsKey(MyApiUrlKeys.ADVERTISER_SUB_SITE)) {
            return dataSet.get(MyApiUrlKeys.ADVERTISER_SUB_SITE);
        }

        return null;
    }

    public void setAdvertiserSubSite(String value) {
        dataSet.put(MyApiUrlKeys.ADVERTISER_SUB_SITE, value);
    }

    public String getAdvertiserSubCampaign() {
        if(dataSet.containsKey(MyApiUrlKeys.ADVERTISER_SUB_CAMPAIGN)) {
            return dataSet.get(MyApiUrlKeys.ADVERTISER_SUB_CAMPAIGN);
        }

        return null;
    }

    public void setAdvertiserSubCampaign(String value) {
        dataSet.put(MyApiUrlKeys.ADVERTISER_SUB_CAMPAIGN, value);
    }

    public String getAdvertiserSubAdgroup() {
        if(dataSet.containsKey(MyApiUrlKeys.ADVERTISER_SUB_ADGROUP)) {
            return dataSet.get(MyApiUrlKeys.ADVERTISER_SUB_ADGROUP);
        }

        return null;
    }

    public void setAdvertiserSubAdgroup(String value) {
        dataSet.put(MyApiUrlKeys.ADVERTISER_SUB_ADGROUP, value);
    }

    public String getAdvertiserSubAd() {
        if(dataSet.containsKey(MyApiUrlKeys.ADVERTISER_SUB_AD)) {
            return dataSet.get(MyApiUrlKeys.ADVERTISER_SUB_AD);
        }

        return null;
    }

    public void setAdvertiserSubAd(String value) {
        dataSet.put(MyApiUrlKeys.ADVERTISER_SUB_AD, value);
    }

    public String getAdvertiserSubKeyword() {
        if(dataSet.containsKey(MyApiUrlKeys.ADVERTISER_SUB_KEYWORD)) {
            return dataSet.get(MyApiUrlKeys.ADVERTISER_SUB_KEYWORD);
        }

        return null;
    }

    public void setAdvertiserSubKeyword(String value) {
        dataSet.put(MyApiUrlKeys.ADVERTISER_SUB_KEYWORD, value);
    }
}
