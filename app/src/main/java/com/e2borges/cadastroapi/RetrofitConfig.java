package com.e2borges.cadastroapi;

import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class RetrofitConfig {

    private final Retrofit retrofit;

    public RetrofitConfig() {
        this.retrofit = new Retrofit.Builder()
                .baseUrl("http://127.0.0.1:8080/api/v1.0/")
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
    }

    public PersonService getPersonService(){
        return this.retrofit.create(PersonService.class);
    }

}
