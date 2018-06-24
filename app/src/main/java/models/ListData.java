package models;

import java.util.ArrayList;

public class ListData {

    public static RowDataModel getFeaturedList() {

        ArrayList<DashBoardModel> list = new ArrayList<>();
        list.add(new DashBoardModel("DeadPool 2 : Fox wars", "September 29, 2020 | 12:30AM EST", "Railegh", "$45", "09.34", "https://pics.me.me/no-glove-no-love-2013-marvel-ima-deadpool2-was-here-29297568.png", 1));
        list.add(new DashBoardModel("Black Road Mountain Hike", "December 28, 2020 | 10:30AM EST", "Durham", "$12", "88.00", "http://www.bollywoodlife.com/wp-content/uploads/2018/06/ant-man.jpg", 1));
        list.add(new DashBoardModel("A Good Autoresponder", "February 13, 2018 | 9:30AM EST", "Shayleeborough", "$745", "28.67", "https://lumiere-a.akamaihd.net/v1/images/pt_blackpanther_characterposter_panther_123cbd2f.jpeg", 1));
        list.add(new DashBoardModel("Avengers Infity War", "March 28, 2017 | 6:30PM EST", "Brooklyn", "$800", "80.34", "https://images-na.ssl-images-amazon.com/images/I/A1tnkTKsnbL._SY606_.jpg", 1));
        RowDataModel rowDataModel = new RowDataModel("Featured", list, null);
        return rowDataModel;
    }

    public static RowDataModel getCategoriesList() {
        ArrayList<DashBoardModel> list = new ArrayList<>();
        list.add(new DashBoardModel("Advertising Outdoor", "January 26, 2018 | 13:30AM EST", "California", "$75", "60.67", "https://images.pexels.com/photos/158063/bellingrath-gardens-alabama-landscape-scenic-158063.jpeg?auto=compress&cs=tinysrgb&h=350", 1));
        list.add(new DashBoardModel("Kishan Photography", "February 25, 2017 | 22:30PM EST", "New Jersy", "$80", "20.34", "https://i.ebayimg.com/images/g/9IEAAOSwAJFa0h2I/s-l300.jpg", 1));
        list.add(new DashBoardModel("Art Design Exhibits", "March 29, 2020 | 12:30AM EST", "CharlesTown", "345", "90.34", "https://imgshare.info/images/2018/06/23/Incredibles-2-2018-Dual-Audio-Hindi.jpg", 1));
        list.add(new DashBoardModel("LandScape Designs", "November 28, 2020 | 12:30AM EST", "Charlotte", "212", "24.00", "https://i.ytimg.com/vi/e6d0VF3TCiQ/movieposter.jpg", 1));

        RowDataModel rowDataModel = new RowDataModel("Popular around me", list, null);
        return rowDataModel;
    }


    public static RowDataModel getRecentViewsList() {
        ArrayList<DashBoardModel> list = new ArrayList<>();
        list.add(new DashBoardModel("Truck Side Adveritising", null, null, "$269", "31.42", "https://cdn.inquisitr.com/wp-content/uploads/2014/03/Incredibles-2-Could-Jack-Jack-Be-The-Villain-In-The-Pixar-Sequel.jpg", 2));
        list.add(new DashBoardModel("why Do you Need to Join", null, null, "511", "78.74", "https://blueridgemountainlife.com/wp-content/uploads/2016/10/linn-cove-viaduct.jpg", 2));
        list.add(new DashBoardModel("Trade show promotions", null, null, "746", "17.72", "http://www.ncblueridge.com/wp-content/member-images/InnonMillCreek2013.jpg", 2));
        list.add(new DashBoardModel("Interior Designs", null, null, "666", "24.45", "http://pilotproject.org/images/www.front-porch-ideas-and-more.com/images/yellow-house-flower-garden.jpg", 2));

        RowDataModel rowDataModel = new RowDataModel("Recently Viewed", list, null);
        return rowDataModel;
    }

    public static RowDataModel getPopularObject() {
        ArrayList<DashBoardModel> list = new ArrayList<>();
        list.add(new DashBoardModel("Buy Youtube Views", "February 13,2018 | 9:30AM EST", "East Bonnieport", "656", "69.37", "https://images.pexels.com/photos/158063/bellingrath-gardens-alabama-landscape-scenic-158063.jpeg", 1));
        RowDataModel rowDataModel = new RowDataModel("Popular around me", list, null);
        return rowDataModel;
    }

    public static RowDataModel getPopularObject1() {
        ArrayList<DashBoardModel> list = new ArrayList<>();
        list.add(new DashBoardModel("Buy Youtube Views", "February 13,2018 | 9:30AM EST", "East Bonnieport", "656", "69.37", "https://www.theactivetimes.com/sites/default/files/styles/tat_slideshow_large/public/5-shutterstock_19931092.jpg", 1));
        RowDataModel rowDataModel = new RowDataModel("Popular around me", list, null);
        return rowDataModel;
    }

    public static RowDataModel getTabData() {
        ArrayList<DashBoardModel> tabs = new ArrayList<>();
        tabs.add(new DashBoardModel("Design", null, null, null, null, null, 3));
        tabs.add(new DashBoardModel("PhotoGraphy", null, null, null, null, null, 3));
        tabs.add(new DashBoardModel("Art", null, null, null, null, null, 3));
        tabs.add(new DashBoardModel("Painting", null, null, null, null, null, 3));
        tabs.add(new DashBoardModel("Landscaping", null, null, null, null, null, 3));
        tabs.add(new DashBoardModel("House Cleaning", null, null, null, null, null, 3));
        RowDataModel rowDataModel = new RowDataModel("All Categories", tabs, null);
        return rowDataModel;
    }


    public static RowDataModel getUpcomingEvents() {
        ArrayList<DashBoardModel> list = new ArrayList<>();
        list.add(new DashBoardModel("Astronomy Or Astrology", "February 13,2018 | 9:30AM EST", null, "$269", "31.42", "https://s.hswstatic.com/gif/landscape-photography-1.jpg", 1));

        RowDataModel rowDataModel = new RowDataModel("Upcoming events", list, null);
        return rowDataModel;
    }


    public static ArrayList<RowDataModel> getDashBoardData() {

        ArrayList<RowDataModel> rowDataModels = new ArrayList<>();
        rowDataModels.add(getFeaturedList());
        rowDataModels.add(getTabData());
        rowDataModels.add(getCategoriesList());
        //rowDataModels.add(getPopularObject1());
        rowDataModels.add(getRecentViewsList());
        rowDataModels.add(getPopularObject());
        rowDataModels.add(getUpcomingEvents());
        return rowDataModels;
    }

}
