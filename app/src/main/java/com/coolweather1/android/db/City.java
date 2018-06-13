package com.coolweather1.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by pc on 2018/6/11.
 */

public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId;

    public int getId(){
        return id;
    }
    public String getCityName(){
        return cityName;
    }
    public int getCityCode(){
        return cityCode;
    }
    public int getProvinceId(){
        return provinceId;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }
    public void setProvinceId(int provinceId) {this.provinceId = provinceId;}
}
