package com.example.retrofitbasic.ApiHelpers;

import com.example.retrofitbasic.Models.DamageRepairParts;
import com.example.retrofitbasic.Models.InsertionMessage;
import com.example.retrofitbasic.Models.PartDetails;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface GetDataService {

//    @POST("/api/users")
//    Call<User> createUser(@Body User user);
//
    //when sending parameter through url, use @Query in the get method.user ? at the end
    @GET("getpartdetails?")
    Call<List<PartDetails>> doGetPartDetails(@Query("categoryid") String categoryid);

    //in the post method use @Field to send parameter.
    //@FormUrlEncoded
    @POST("insertrepairpartdetails")
    Call<List<InsertionMessage>> doInsertPartDetails(@Body List<DamageRepairParts> drp);
    //Call<List<InsertionMessage>> doInsertPartDetails(@Field("tstpar") String tstpar);

//
//    @FormUrlEncoded
//    @POST("/api/users?")
//    Call<UserList> doCreateUserWithField(@Field("name") String name, @Field("job") String job);

}
