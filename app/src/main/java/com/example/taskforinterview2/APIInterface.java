package com.example.taskforinterview2;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by zayed on 07-Feb-18.
 */

public interface APIInterface {
    @GET("intrvw/users.json")
    Call<JsonResponse> doGetUserDetails();
}
