package com.example.covidapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CovidDataSummary {
    @JsonProperty("Confirmed")
    private int confirmed;
    @JsonProperty("Recovered")
    private int recovered;
    @JsonProperty("Hospitalized")
    private int hospitalized;
    @JsonProperty("Deaths")
    private int deaths;
    @JsonProperty("NewConfirmed")
    private int newConfirmed;
    @JsonProperty("NewRecovered")
    private int newRecovered;
    @JsonProperty("NewHospitalized")
    private int newHospitalized;
    @JsonProperty("NewDeaths")
    private int newDeaths;
    @JsonProperty("UpdateDate")
    private String updateDate;
    @JsonProperty("Source")
    private String source;
    @JsonProperty("DevBy")
    private String devBy;
    @JsonProperty("ServerBy")
    private String severBy;


}
