package com.project.android.bakingapp.retrofit;

import com.project.android.bakingapp.RecipeUtilities.Recipe;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface IRecipe {
    @GET("baking.json")
    Call<ArrayList<Recipe>> getRecipe();
}
