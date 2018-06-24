package models;

public class DashBoardModel {

    private String topicName;
    private String dateTime;
    private String location;
    private String rate;
    private String muncheScore;
    private String imageUrl;
    private int itemType;


    public DashBoardModel(String topicName, String dateTime, String location, String rate, String muncheScore, String imageUrl, int itemType) {
        this.topicName = topicName;
        this.dateTime = dateTime;
        this.location = location;
        this.rate = rate;
        this.muncheScore = muncheScore;
        this.imageUrl = imageUrl;
        this.itemType = itemType;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getMuncheScore() {
        return muncheScore;
    }

    public void setMuncheScore(String muncheScore) {
        this.muncheScore = muncheScore;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getItemType() {
        return itemType;
    }

    public void setItemType(int itemType) {
        this.itemType = itemType;
    }
}
