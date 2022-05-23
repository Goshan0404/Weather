
package com.example.weather.model.com.example;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Part {

    @SerializedName("part_name")
    @Expose
    private String partName;
    @SerializedName("temp_min")
    @Expose
    private Integer tempMin;
    @SerializedName("temp_max")
    @Expose
    private Integer tempMax;
    @SerializedName("temp_avg")
    @Expose
    private Integer tempAvg;
    @SerializedName("feels_like")
    @Expose
    private Integer feelsLike;
    @SerializedName("icon")
    @Expose
    private String icon;
    @SerializedName("condition")
    @Expose
    private String condition;
    @SerializedName("daytime")
    @Expose
    private String daytime;
    @SerializedName("polar")
    @Expose
    private Boolean polar;
    @SerializedName("wind_speed")
    @Expose
    private Double windSpeed;
    @SerializedName("wind_gust")
    @Expose
    private Integer windGust;
    @SerializedName("wind_dir")
    @Expose
    private String windDir;
    @SerializedName("pressure_mm")
    @Expose
    private Integer pressureMm;
    @SerializedName("pressure_pa")
    @Expose
    private Integer pressurePa;
    @SerializedName("humidity")
    @Expose
    private Integer humidity;
    @SerializedName("prec_mm")
    @Expose
    private Integer precMm;
    @SerializedName("prec_period")
    @Expose
    private Integer precPeriod;
    @SerializedName("prec_prob")
    @Expose
    private Integer precProb;

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public Integer getTempMin() {
        return tempMin;
    }

    public void setTempMin(Integer tempMin) {
        this.tempMin = tempMin;
    }

    public Integer getTempMax() {
        return tempMax;
    }

    public void setTempMax(Integer tempMax) {
        this.tempMax = tempMax;
    }

    public Integer getTempAvg() {
        return tempAvg;
    }

    public void setTempAvg(Integer tempAvg) {
        this.tempAvg = tempAvg;
    }

    public Integer getFeelsLike() {
        return feelsLike;
    }

    public void setFeelsLike(Integer feelsLike) {
        this.feelsLike = feelsLike;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getDaytime() {
        return daytime;
    }

    public void setDaytime(String daytime) {
        this.daytime = daytime;
    }

    public Boolean getPolar() {
        return polar;
    }

    public void setPolar(Boolean polar) {
        this.polar = polar;
    }

    public Double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public Integer getWindGust() {
        return windGust;
    }

    public void setWindGust(Integer windGust) {
        this.windGust = windGust;
    }

    public String getWindDir() {
        return windDir;
    }

    public void setWindDir(String windDir) {
        this.windDir = windDir;
    }

    public Integer getPressureMm() {
        return pressureMm;
    }

    public void setPressureMm(Integer pressureMm) {
        this.pressureMm = pressureMm;
    }

    public Integer getPressurePa() {
        return pressurePa;
    }

    public void setPressurePa(Integer pressurePa) {
        this.pressurePa = pressurePa;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public Integer getPrecMm() {
        return precMm;
    }

    public void setPrecMm(Integer precMm) {
        this.precMm = precMm;
    }

    public Integer getPrecPeriod() {
        return precPeriod;
    }

    public void setPrecPeriod(Integer precPeriod) {
        this.precPeriod = precPeriod;
    }

    public Integer getPrecProb() {
        return precProb;
    }

    public void setPrecProb(Integer precProb) {
        this.precProb = precProb;
    }

}
