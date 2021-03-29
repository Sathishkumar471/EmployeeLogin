package com.example.employeelogin.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Header {

    @SerializedName("In_user_code")
    @Expose
    private String inUserCode;
    @SerializedName("In_user_name")
    @Expose
    private String inUserName;
    @SerializedName("In_role_code")
    @Expose
    private String inRoleCode;
    @SerializedName("In_role_name")
    @Expose
    private String inRoleName;
    @SerializedName("In_orgn_code")
    @Expose
    private String inOrgnCode;
    @SerializedName("In_location")
    @Expose
    private String inLocation;
    @SerializedName("In_Reponse")
    @Expose
    private String inReponse;
    @SerializedName("config")
    @Expose
    private String config;

    public String getInUserCode() {
        return inUserCode;
    }

    public void setInUserCode(String inUserCode) {
        this.inUserCode = inUserCode;
    }

    public String getInUserName() {
        return inUserName;
    }

    public void setInUserName(String inUserName) {
        this.inUserName = inUserName;
    }

    public String getInRoleCode() {
        return inRoleCode;
    }

    public void setInRoleCode(String inRoleCode) {
        this.inRoleCode = inRoleCode;
    }

    public String getInRoleName() {
        return inRoleName;
    }

    public void setInRoleName(String inRoleName) {
        this.inRoleName = inRoleName;
    }

    public String getInOrgnCode() {
        return inOrgnCode;
    }

    public void setInOrgnCode(String inOrgnCode) {
        this.inOrgnCode = inOrgnCode;
    }

    public String getInLocation() {
        return inLocation;
    }

    public void setInLocation(String inLocation) {
        this.inLocation = inLocation;
    }

    public String getInReponse() {
        return inReponse;
    }

    public void setInReponse(String inReponse) {
        this.inReponse = inReponse;
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }

}
