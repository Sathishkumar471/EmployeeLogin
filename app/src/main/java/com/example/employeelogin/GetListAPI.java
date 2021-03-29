package com.example.employeelogin;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GetListAPI {
    @GET(Constants.Validation)
    Call<Example> getList(@Query("org") String org,@Query("locn") String locn,@Query("user") String user,
                          @Query("lang") String lang,
                          @Query("In_user_code") String In_user_code, @Query("In_user_pwd") String In_user_pwd);
}
