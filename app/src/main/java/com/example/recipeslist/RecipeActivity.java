package com.example.recipeslist;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class RecipeActivity extends AppCompatActivity {

    private Recipe recipe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        Toolbar toolbarRecipe = findViewById(R.id.toolbar_recipe);
        setSupportActionBar(toolbarRecipe);
        toolbarRecipe.setLogo(R.drawable.ic_action_app);

        TextView recipeName = findViewById(R.id.recipe_name);
        TextView ingredientsName = findViewById(R.id.ingredient_view);
        TextView preparation = findViewById(R.id.preparation_view);

        int recipeId = (Integer) getIntent().getExtras().get("position");
        recipe = Recipe.recipes[recipeId];
        recipeName.setText(recipe.getName());
        ingredientsName.setText(recipe.getIngredients());
        preparation.setText(recipe.getPreparation());


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.help_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.action_help:
                openHelpDialog();
                return true;
            case R.id.action_share:
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, recipe.getName());
                intent.putExtra(Intent.EXTRA_TEXT, recipe.getIngredients());
                intent.putExtra(Intent.EXTRA_TEXT, recipe.getPreparation());
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void openHelpDialog(){
        HelpDialog helpDialog = new HelpDialog();
        helpDialog.show(getSupportFragmentManager(),"help dialog");
    }
}