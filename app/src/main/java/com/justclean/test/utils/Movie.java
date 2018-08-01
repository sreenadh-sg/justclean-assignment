package com.justclean.test.utils;

import com.google.gson.annotations.SerializedName;

public class Movie {


    @SerializedName("title")
    public String title;
    @SerializedName("original_language")
    public String original_language;
    @SerializedName("release_date")
    public String release_date;
    @SerializedName("poster_path")
    public String poster_path;
    @SerializedName("runtime")
    public int runtime;

}
