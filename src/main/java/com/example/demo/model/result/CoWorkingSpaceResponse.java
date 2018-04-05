package com.example.demo.model.result;

import com.example.demo.model.CoWorkingSpace;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CoWorkingSpaceResponse {

    private ArrayList<CoWorkingSpace> results;

    public CoWorkingSpaceResponse() {
    }

    public ArrayList<CoWorkingSpace> getResults() {
        return results;
    }

    public void setResults(ArrayList<CoWorkingSpace> results) {
        this.results = results;
    }
}
