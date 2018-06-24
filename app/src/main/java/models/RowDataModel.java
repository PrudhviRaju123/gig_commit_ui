package models;

import java.util.ArrayList;

public class RowDataModel {

    private String headerTitle;
    private ArrayList<DashBoardModel> dashBoardModelList;
    private ArrayList<String> tabDataList;

    public String getHeaderTitle() {
        return headerTitle;
    }

    public void setHeaderTitle(String headerTitle) {
        this.headerTitle = headerTitle;
    }

    public ArrayList<DashBoardModel> getDashBoardModelList() {
        return dashBoardModelList;
    }

    public void setDashBoardModelList(ArrayList<DashBoardModel> dashBoardModelList) {
        this.dashBoardModelList = dashBoardModelList;
    }

    public RowDataModel(String headerTitle, ArrayList<DashBoardModel> dashBoardModelList, ArrayList<String> tabDataList) {
        this.headerTitle = headerTitle;
        this.dashBoardModelList = dashBoardModelList;
        this.tabDataList = tabDataList;
    }

    public ArrayList<String> getTabDataList() {
        return tabDataList;
    }

    public void setTabDataList(ArrayList<String> tabDataList) {
        this.tabDataList = tabDataList;
    }


}
