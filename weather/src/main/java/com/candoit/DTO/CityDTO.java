
package com.candoit.DTO;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "_id",
        "dist",
        "lid",
        "fid",
        "int_number",
        "name",
        "province",
        "lat",
        "lon",
        "zoom",
        "updated",
        "weather",
        "forecast"
})
@Generated("jsonschema2pojo")
@Entity
@Table(name = "city")
public class CityDTO {

    @Id
    @JsonProperty("_id")
    private String id;
    @JsonProperty("dist")
    private Double dist;
    @JsonProperty("lid")
    private Integer lid;
    @JsonProperty("fid")
    private Integer fid;
    @Column(name = "int_number")
    @JsonProperty("int_number")
    private Integer intNumber;
    @JsonProperty("name")
    // @Column(unique = true)
    private String name;
    @JsonProperty("province")
    private String province;
    @JsonProperty("lat")
    private String lat;
    @JsonProperty("lon")
    private String lon;
    @JsonProperty("zoom")
    private String zoom;
    @JsonProperty("updated")
    private Integer updated;
    @JsonProperty("weather")
    @JoinColumn(name = "weather_id", referencedColumnName = "_id")
    @OneToOne(cascade = { CascadeType.ALL })
    private WeatherDTO weather;
    @JsonProperty("forecast")
    private String forecast;

    public CityDTO() {
    }

    public CityDTO(String id, Double dist, Integer lid, Integer fid, Integer intNumber, String name, String province,
            String lat, String lon, String zoom, Integer updated, WeatherDTO weather, String forecast) {
        this.id = id;
        this.dist = dist;
        this.lid = lid;
        this.fid = fid;
        this.intNumber = intNumber;
        this.name = name;
        this.province = province;
        this.lat = lat;
        this.lon = lon;
        this.zoom = zoom;
        this.updated = updated;
        this.weather = weather;
        this.forecast = forecast;
    }

    @JsonProperty("_id")
    public String getId() {
        return id;
    }

    @JsonProperty("_id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("dist")
    public Double getDist() {
        return dist;
    }

    @JsonProperty("dist")
    public void setDist(Double dist) {
        this.dist = dist;
    }

    @JsonProperty("lid")
    public Integer getLid() {
        return lid;
    }

    @JsonProperty("lid")
    public void setLid(Integer lid) {
        this.lid = lid;
    }

    @JsonProperty("fid")
    public Integer getFid() {
        return fid;
    }

    @JsonProperty("fid")
    public void setFid(Integer fid) {
        this.fid = fid;
    }

    @JsonProperty("int_number")
    public Integer getIntNumber() {
        return intNumber;
    }

    @JsonProperty("int_number")
    public void setIntNumber(Integer intNumber) {
        this.intNumber = intNumber;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("province")
    public String getProvince() {
        return province;
    }

    @JsonProperty("province")
    public void setProvince(String province) {
        this.province = province;
    }

    @JsonProperty("lat")
    public String getLat() {
        return lat;
    }

    @JsonProperty("lat")
    public void setLat(String lat) {
        this.lat = lat;
    }

    @JsonProperty("lon")
    public String getLon() {
        return lon;
    }

    @JsonProperty("lon")
    public void setLon(String lon) {
        this.lon = lon;
    }

    @JsonProperty("zoom")
    public String getZoom() {
        return zoom;
    }

    @JsonProperty("zoom")
    public void setZoom(String zoom) {
        this.zoom = zoom;
    }

    @JsonProperty("updated")
    public Integer getUpdated() {
        return updated;
    }

    @JsonProperty("updated")
    public void setUpdated(Integer updated) {
        this.updated = updated;
    }

    @JsonProperty("weather")
    public WeatherDTO getWeather() {
        return weather;
    }

    @JsonProperty("weather")
    public void setWeather(WeatherDTO weather) {
        this.weather = weather;
    }

    @JsonProperty("forecast")
    public String getForecast() {
        return forecast;
    }

    @JsonProperty("forecast")
    public void setForecast(String forecast) {
        this.forecast = forecast;
    }

}
