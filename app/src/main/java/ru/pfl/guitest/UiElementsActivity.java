package ru.pfl.guitest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

public class UiElementsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uielements);

        ActionBar actBar = getSupportActionBar();

        actBar.setDisplayHomeAsUpEnabled(true);
        actBar.setDisplayShowHomeEnabled(true);

        actBar.setDisplayShowTitleEnabled(true);
        actBar.setTitle("UIElements");
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId() == android.R.id.home){
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}