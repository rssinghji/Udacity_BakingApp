package com.example.android.recipe.retrofit;

import com.example.android.recipe.pojo.Recipe;
import java.util.ArrayList;
import retrofit2.Call;
import retrofit2.http.GET;

public interface IRecipe {
    @GET("baking.json")
    Call<ArrayList<Recipe>> getRecipe();
}