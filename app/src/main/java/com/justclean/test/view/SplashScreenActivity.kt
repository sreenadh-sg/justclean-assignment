package com.justclean.test.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.justclean.test.R
import com.justclean.test.utils.GetDataService
import com.justclean.test.utils.Movie
import com.justclean.test.utils.RetrofitClientInstance
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SplashScreenActivity : AppCompatActivity(),Callback<Movie> {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val retrofitService:GetDataService =
                RetrofitClientInstance.getRetrofitInstance().create(GetDataService::class.java)
        val result:Call<Movie> = retrofitService.movies
        result.enqueue(this)



    }

    override fun onFailure(call: Call<Movie>?, t: Throwable?) {
        Log.v("Test","Failure")
    }

    override fun onResponse(call: Call<Movie>?, response: Response<Movie>?) {

        val result=response?.body()
        if(result!=null)
            Log.v("Check","count - "+result.original_language)
        else
            Log.v("Check","count - 0")
    }
}
