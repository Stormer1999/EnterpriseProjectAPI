package com.example.covidapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ZoneInfo {

    @JsonProperty("ConfirmDate")
    private String ConfirmDate;
    @JsonProperty("Gender")
    private String Gender;
    @JsonProperty("Province")
    private String Province;

}
