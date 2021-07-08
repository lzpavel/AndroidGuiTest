package ru.pfl.guitest;

import android.os.Bundle;

import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class UielmActivity extends AppCompatActivity {

    ActionBarDrawerToggle toggle = null;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uielm);
        //SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        //ViewPager viewPager = findViewById(R.id.uie_view_pager);
        //viewPager.setAdapter(sectionsPagerAdapter);
        //TabLayout tabs = findViewById(R.id.uie_TabLayout);
        //tabs.setupWithViewPager(viewPager);

        UielmPagerAdapter uielmPagerAdapter = new UielmPagerAdapter(this);
        ViewPager2 viewPager2 = findViewById(R.id.view_pager_2_uielm);
        viewPager2.setAdapter(uielmPagerAdapter);

        TabLayout tabLayout = findViewById(R.id.tab_layout_uielm);

        //new TabLayoutMediator(tabs, viewPager2, (tab, position) -> {}).attach();
        //new TabLayoutMediator(tabs, viewPager2, (tab, position) -> tab.setText("OBJECT " + (position + 1))).attach();
        TabItem[] tabItem = {findViewById(R.id.item_tab_uielm_1), findViewById(R.id.item_tab_uielm_2), findViewById(R.id.item_tab_uielm_3)};
        TabLayoutMediator.TabConfigurationStrategy tabConfigurationStrategy = new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                //tab.setText("Tab "+ (position + 1));

                switch (position){
                    case 0:
                        tab.setText(R.string.sfn_buttons);
                        break;
                    case 1:
                        tab.setText(R.string.sfn_text);
                        break;
                    case 2:
                        tab.setText(R.string.sfn_widgets);
                        break;
                }

            }
        };



        new TabLayoutMediator(tabLayout, viewPager2, tabConfigurationStrategy).attach();


        DrawerLayout drawerLayout = findViewById(R.id.drawer_layout_uielm);
        NavigationView navigationView = findViewById(R.id.navigation_view_uielm);
        ActionBar actionBar = getSupportActionBar();


        toggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("User Elements");



        Toast.makeText(getApplicationContext(), "Load!", Toast.LENGTH_SHORT).show();

        Menu nvMenu = navigationView.getMenu();
        //nvMenu.add("Added item");
        MenuItem menuItem = nvMenu.getItem(0);
        menuItem.setTitle(R.string.sfn_buttons);
        menuItem = nvMenu.getItem(1);
        menuItem.setTitle(R.string.sfn_text);
        menuItem = nvMenu.getItem(2);
        menuItem.setTitle(R.string.sfn_widgets);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();

                switch (id){
                    case R.id.item_menu_nvd_uielm_1:
                        //Toast.makeText(getApplicationContext(), "Item1", Toast.LENGTH_SHORT).show();
                        viewPager2.setCurrentItem(0);
                        break;
                    case R.id.item_menu_nvd_uielm_2:
                        //Toast.makeText(getApplicationContext(), "Item2", Toast.LENGTH_SHORT).show();
                        viewPager2.setCurrentItem(1);
                        break;
                    case R.id.item_menu_nvd_uielm_3:
                        //Toast.makeText(getApplicationContext(), "Item3", Toast.LENGTH_SHORT).show();
                        viewPager2.setCurrentItem(2);
                        break;
                }
                drawerLayout.closeDrawers();
                return false;
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(toggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /*@Override   :button in toolbar
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add("Test item");
        return super.onCreateOptionsMenu(menu);
        //return true; enable :button in toolbar
    }*/
}

