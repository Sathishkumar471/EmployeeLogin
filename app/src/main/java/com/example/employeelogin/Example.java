package com.example.employeelogin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Example {
    @SerializedName("context")
    @Expose
    private Context context;
    @SerializedName("ApplicationException")
    @Expose
    private Object applicationException;

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public Object getApplicationException() {
        return applicationException;
    }

    public void setApplicationException(Object applicationException) {
        this.applicationException = applicationException;
    }
}
