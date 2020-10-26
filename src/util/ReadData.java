package util;

import model.Station;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadData {

    public void readFileByLines(String fileName, List<Station> stations) {
        BufferedReader reader = null;
        File file = new File(fileName);

        try {
            reader = new BufferedReader(new FileReader(file));
            String str = null;
            int line = 1;
            int cnt = 0;

            //按行读取文件
            while ((str = reader.readLine()) != null) {
                Station station = new Station();
                List<String> list = new ArrayList<String>();
                String[] arr = str.split(" ");      //以空格对每行进行分隔
                for(int i = 0; i < arr.length; i++)       //list中存储该行内容
                    list.add(arr[i]);

                String num = list.get(0);                 //num为地铁线名
                list.remove(0);                     //将地铁线名从list中去除，剩下该线路的所有站点

                station.setStationNum(num);               //将线路名加入station
                station.setStations(list);                //将线路内站点加入station
                stations.add(station);                    //将station加入到列表中

            }
            reader.close();                               //关闭文件
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader == null)
                try {
                    reader.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
        }
    }

}
