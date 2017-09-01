package ru.itis.models;

import java.util.List;

/**
 * 04.06.2017
 * FreandsResponse @author Ayupov Ayaz (First Software Engineering Platform)
 *
 * @version v1.0 /
 */
public class FreandsResponse {
    private List<Freand> response;

    public FreandsResponse() {
    }

    public List<Freand> getResponse() {
        return response;
    }

    public void setResponse(List<Freand> response) {
        this.response = response;
    }
}
