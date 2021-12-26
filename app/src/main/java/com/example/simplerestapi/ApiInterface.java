package com.example.simplerestapi;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("posts")
    public Call<List<Post>> getPost(@Query("postId") int postId);
}
