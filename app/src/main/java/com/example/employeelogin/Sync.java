package com.example.employeelogin;

import java.util.ArrayList;
import java.util.List;

public class Sync {

    private List<ListModel> responseList = new ArrayList<>();
    private List<ListPojo> sampleList = new ArrayList<>();
    private static final Sync syncInstance = new Sync();

    public Example getExample() {
        return example;
    }

    public void setExample(Example example) {
        this.example = example;
    }

    private Example example;

    public List<ListModel> getResponseList() {
        return responseList;
    }

    public void setResponseList(ArrayList<ListModel> responseList) {
        this.responseList = responseList;
    }

    public static Sync getSyncInstance() {
        return syncInstance;
    }

    public List<ListPojo> getSampleList() {
        return sampleList;
    }

    public void setSampleList(List<ListPojo> sampleList) {
        this.sampleList = sampleList;
    }


}
