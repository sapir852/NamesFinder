package com.sapir.namesfinder;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

    public interface NameAPI {

        @GET("raw/KRc8xhkF")
         Call<List<Name>> loadName();

        @GET("raw/KRc8xhkF")
        Call<List<Name>> loadNameByLetter();

        @GET("raw/KRc8xhkF")
        Call<List<Name>> loadNameByCategory();
        @GET("raw/KRc8xhkF")
        Call<List<Name>> loadRandomName();

        @GET("raw/KRc8xhkF")
        Call<List<Name>> loadNameByLetterAndCategory();

    }
