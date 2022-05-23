
package com.example.weather.model.com.example;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Forecast {

    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("date_ts")
    @Expose
    private Integer dateTs;
    @SerializedName("week")
    @Expose
    private Integer week;
    @SerializedName("sunrise")
    @Expose
    private String sunrise;
    @SerializedName("sunset")
    @Expose
    private String sunset;
    @SerializedName("moon_code")
    @Expose
    private Integer moonCode;
    @SerializedName("moon_text")
    @Expose
    private String moonText;
    @SerializedName("parts")
    @Expose
    private List<Part> parts = null;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getDateTs() {
        return dateTs;
    }

    public void setDateTs(Integer dateTs) {
        this.dateTs = dateTs;
    }

    public Integer getWeek() {
        return week;
    }

    public void setWeek(Integer week) {
        this.week = week;
    }

    public String getSunrise() {
        return sunrise;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    public String getSunset() {
        return sunset;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    public Integer getMoonCode() {
        return moonCode;
    }

    public void setMoonCode(Integer moonCode) {
        this.moonCode = moonCode;
    }

    public String getMoonText() {
        return moonText;
    }

    public void setMoonText(String moonText) {
        this.moonText = moonText;
    }

    public List<Part> getParts() {
        return parts;
    }

    public void setParts(List<Part> parts) {
        this.parts = parts;
    }

}
