package com.example.employeelogin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Detail {
    @SerializedName("In_orgnlvl_code")
    @Expose
    private String inOrgnlvlCode;
    @SerializedName("In_orgnlvl_name")
    @Expose
    private String inOrgnlvlName;

    public String getInOrgnlvlCode() {
        return inOrgnlvlCode;
    }

    public void setInOrgnlvlCode(String inOrgnlvlCode) {
        this.inOrgnlvlCode = inOrgnlvlCode;
    }

    public String getInOrgnlvlName() {
        return inOrgnlvlName;
    }

    public void setInOrgnlvlName(String inOrgnlvlName) {
        this.inOrgnlvlName = inOrgnlvlName;
    }
}
