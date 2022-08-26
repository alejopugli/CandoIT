
package com.candoit.DTO;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "humidity",
        "pressure",
        "st",
        "visibility",
        "wind_speed",
        "id",
        "description",
        "temp",
        "wing_deg",
        "tempDesc"
})
@Generated("jsonschema2pojo")
@Entity
@Table(name = "weather")
public class WeatherDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonIgnore
    private Integer _id;
    @JsonProperty("humidity")
    private Integer humidity;
    @JsonProperty("pressure")
    private Double pressure;
    @JsonProperty("st")
    private String st;
    @JsonProperty("visibility")
    private Double visibility;
    @Column(name = "wind_speed")
    @JsonProperty("wind_speed")
    private Integer windSpeed;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("description")
    private String description;
    @JsonProperty("temp")
    private Double temp;
    @Column(name = "wing_deg")
    @JsonProperty("wing_deg")
    private String wingDeg;
    @Column(name = "temp_desc")
    @JsonProperty("tempDesc")
    private String tempDesc;
    @OneToOne // (mappedBy = "weather",cascade = {CascadeType.ALL})
    private CityDTO City;

    public WeatherDTO() {
    }

    public WeatherDTO(Integer _id, Integer humidity, Double pressure, String st, Double visibility, Integer windSpeed,
            Integer id, String description, Double temp, String wingDeg, String tempDesc) {
        this._id = _id;
        this.humidity = humidity;
        this.pressure = pressure;
        this.st = st;
        this.visibility = visibility;
        this.windSpeed = windSpeed;
        this.id = id;
        this.description = description;
        this.temp = temp;
        this.wingDeg = wingDeg;
        this.tempDesc = tempDesc;
    }

    public Integer get_id() {
        return this._id;
    }

    public void set_id(Integer _id) {
        this._id = _id;
    }

    public CityDTO getCity() {
        return this.City;
    }

    public void setCity(CityDTO City) {
        this.City = City;
    }

    @JsonProperty("humidity")
    public Integer getHumidity() {
        return humidity;
    }

    @JsonProperty("humidity")
    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    @JsonProperty("pressure")
    public Double getPressure() {
        return pressure;
    }

    @JsonProperty("pressure")
    public void setPressure(Double pressure) {
        this.pressure = pressure;
    }

    @JsonProperty("st")
    public String getSt() {
        return st;
    }

    @JsonProperty("st")
    public void setSt(String st) {
        this.st = st;
    }

    @JsonProperty("visibility")
    public Double getVisibility() {
        return visibility;
    }

    @JsonProperty("visibility")
    public void setVisibility(Double visibility) {
        this.visibility = visibility;
    }

    @JsonProperty("wind_speed")
    public Integer getWindSpeed() {
        return windSpeed;
    }

    @JsonProperty("wind_speed")
    public void setWindSpeed(Integer windSpeed) {
        this.windSpeed = windSpeed;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("temp")
    public Double getTemp() {
        return temp;
    }

    @JsonProperty("temp")
    public void setTemp(Double temp) {
        this.temp = temp;
    }

    @JsonProperty("wing_deg")
    public String getWingDeg() {
        return wingDeg;
    }

    @JsonProperty("wing_deg")
    public void setWingDeg(String wingDeg) {
        this.wingDeg = wingDeg;
    }

    @JsonProperty("tempDesc")
    public String getTempDesc() {
        return tempDesc;
    }

    @JsonProperty("tempDesc")
    public void setTempDesc(String tempDesc) {
        this.tempDesc = tempDesc;
    }

}
