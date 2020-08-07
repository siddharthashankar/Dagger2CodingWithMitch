package com.sid.dagger.dagger2codingwithmitch.network.main;

import com.sid.dagger.dagger2codingwithmitch.models.Post;

import java.util.List;

import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MainApi {

    @GET("posts")
    Flowable<List<Post>> getPostsFromUser(
        @Query("userId") int id
    );
}
