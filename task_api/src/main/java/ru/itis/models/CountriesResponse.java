package ru.itis.models;

import java.util.List;

/**
 * 26.05.2017
 * CountriesResponse
 *
 * @author Ayupov Ayaz (First Software Engineering Platform)
 * @version v1.0
 */
public class CountriesResponse {
    private List<Country> response;
    public CountriesResponse() {
    }

    public List<Country> getResponse() {
        return response;
    }

    public void setResponse(List<Country> response) {
        this.response = response;
    }
}
