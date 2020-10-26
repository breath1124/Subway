package model;

import java.util.ArrayList;
import java.util.List;

public class Station {
    private String stationNum;                              //存储站点所在线路名
    private List<String> stations = new ArrayList<>();      //存储线路内所有站点名

    public String getStationNum() {
        return stationNum;
    }

    public void setStationNum(String stationNum) {
        this.stationNum = stationNum;
    }

    public List<String> getStations() {
        return stations;
    }

    public void setStations(List<String> stations) {
        this.stations = stations;
    }
}
