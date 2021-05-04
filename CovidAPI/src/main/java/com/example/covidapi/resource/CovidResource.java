package com.example.covidapi.resource;

import com.example.covidapi.model.CovidDataSummary;
import com.example.covidapi.model.Zone;
import com.example.covidapi.model.ZoneInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CovidResource {

    @Value("$api-key")
    private String apiKey;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/getCovidData")
    public CovidDataSummary getCovidData(){
        return restTemplate.getForObject(
                "https://covid19.th-stat.com/api/open/today"
                /*+ "?api-key" + apiKey*/
                ,CovidDataSummary.class);
    }
    @RequestMapping("/getLastZone")
    public Zone getLastInfected(){
        return restTemplate.getForObject("https://covid19.th-stat.com/api/open/cases"
        ,Zone.class);
    }
}
