package com.coolweather1.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by pc on 2018/6/11.
 */

public class County extends DataSupport {
    private  int id;
    private String countyName;
    private String weatherId;
    private int cityId;

    public int getId(){
        return id;
    }
    public String getCountyName(){
        return countyName;
    }
    public String getWeatherId(){
        return weatherId;
    }
    public int getCityId(){
        return cityId;
    }

    public void setId(int id){this.id = id;}
    public void setCountyName(String countyName){
        this.countyName = countyName;
    }
    public void setWeatherId(String weatherId){
        this.weatherId = weatherId;
    }
    public void setCityId(int cityId){
        this.cityId = cityId;
    }
}
