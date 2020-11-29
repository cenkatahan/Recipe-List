package com.example.recipeslist;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private String intentMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //for the implict intent to send a text
        intentMessage = "Hey, Wanna use my Recipes?";

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setLogo(R.drawable.ic_action_app);

        ArrayList<String> recipes = new ArrayList<>();
        recipes.add("Tomato soup");
        recipes.add("Lasagne");
        recipes.add("Tarte Tatin");


        ArrayAdapter<String > recipeAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,recipes);
        ListView listRecipe = findViewById(R.id.recipeListView);
        listRecipe.setAdapter(recipeAdapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, RecipeActivity.class);
                intent.putExtra("position", (int) position);
                startActivity(intent);
            }
        };

        listRecipe.setOnItemClickListener(itemClickListener);
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
                intent.putExtra(Intent.EXTRA_TEXT,intentMessage);
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