package com.e2borges.cadastroapi;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface PersonService {

    @GET("persons")
    Call<List<Person>> getAllPersons();

    @GET("persons/{id}")
    Call<Person> getPersons(@Path("id") Long id);

    @POST("persons")
    Call<Person> addPerson(@Body Person person);

    @PUT("persons/{id}")
    Call<Person> updatePerson(@Path("id") Long id, @Body Person person);

    @DELETE("persons/{id}")
    Call<Person> deletePerson(@Path("id") Long id);

}
