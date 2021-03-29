package com.example.employeelogin.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Context {

    @SerializedName("orgnId")
    @Expose
    private String orgnId;
    @SerializedName("locnId")
    @Expose
    private String locnId;
    @SerializedName("userId")
    @Expose
    private String userId;
    @SerializedName("localeId")
    @Expose
    private String localeId;
    @SerializedName("Header")
    @Expose
    private Header header;
    @SerializedName("Detail")
    @Expose
    private List<Detail> detail = null;

    public String getOrgnId() {
        return orgnId;
    }

    public void setOrgnId(String orgnId) {
        this.orgnId = orgnId;
    }

    public String getLocnId() {
        return locnId;
    }

    public void setLocnId(String locnId) {
        this.locnId = locnId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLocaleId() {
        return localeId;
    }

    public void setLocaleId(String localeId) {
        this.localeId = localeId;
    }

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public List<Detail> getDetail() {
        return detail;
    }

    public void setDetail(List<Detail> detail) {
        this.detail = detail;
    }

}


