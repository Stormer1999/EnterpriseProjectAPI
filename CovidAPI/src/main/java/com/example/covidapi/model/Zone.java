package com.example.covidapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Zone {

    @JsonProperty("Data")
    private List<ZoneInfo> Data;
    @JsonProperty("LastData")
    private String LastData;
    @JsonProperty("UpdateDate")
    private String  UpdateDate;
    @JsonProperty("Source")
    private String Source;
}
