package ru.pfl.guitest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class TestActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        Toolbar toolbar_test_activity_v = findViewById(R.id.toolbar_test_activity);
        //setSupportActionBar(toolbar_test_activity_v);

        //getSupportActionBar()
        //getActionBar()

        ActionBar oldActionBar = getSupportActionBar();

        oldActionBar.setDisplayHomeAsUpEnabled(true);
        oldActionBar.setDisplayShowHomeEnabled(true);

        oldActionBar.setDisplayShowTitleEnabled(true);
        oldActionBar.setTitle("OldActBar");

        toolbar_test_activity_v.setTitle("NewToolbar");
        

        Button button_test_activity_v = findViewById(R.id.button_test_activity);

        button_test_activity_v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                //finishActivity(0);
                //this.finishAffinity();
                //System.exit(0);
            }
        });


        /*getSupportActionBar().setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });*/
        toolbar_test_activity_v.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId() == android.R.id.home){
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
}