package ru.pfl.guitest;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;

import ru.pfl.guitest.ui.login.LoginActivity;

public class MainActivity extends AppCompatActivity {

    TextView[] tv_main;
    OnClickListener clickListener;
    Intent[] mIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_main = new TextView[]{findViewById(R.id.textView_main_test_activity), findViewById(R.id.textView_main_empty_activity), findViewById(R.id.textView_main_basic_activity),
                findViewById(R.id.textView_main_fragmentvm_activity), findViewById(R.id.textView_main_bottomnavigation_activity), findViewById(R.id.textView_main_tabbed_activity),
                findViewById(R.id.textView_main_fullscreen_activity), findViewById(R.id.textView_main_settings_activity), findViewById(R.id.textView_main_navigationdrawer_activity),
                findViewById(R.id.textView_main_login_activity), findViewById(R.id.textView_main_scrolling_activity), findViewById(R.id.textView_main_maps_activity),
                findViewById(R.id.textView_main_masterdetailflow_activity), findViewById(R.id.textView_main_uielements_activity), findViewById(R.id.textViewUielmActivity),
                findViewById(R.id.textViewRecyclerViewActivity), findViewById(R.id.textViewDialogActivity)};

        /*tv1 = (TextView) findViewById(R.id.textView1);
        tv2 = (TextView) findViewById(R.id.textView2);
        tv3 = (TextView) findViewById(R.id.textView3);*/

        //FragmentManager fm = getSupportFragmentManager();
        //BlankFragment bf = (BlankFragment) fm.findFragmentById(R.layout.fragment_blank);
        //Intent baIntent = new Intent(this, BasicActivity.class);
        //Intent eaIntent = new Intent(this, EmptyActivity.class);
        //Intent tIntent = new Intent(this, TestActivity.class);
        mIntent = new Intent[]{new Intent(this, TestActivity.class), new Intent(this, EmptyActivity.class), new Intent(this, BasicActivity.class),
                new Intent(this, FragmentViewModelActivity.class), new Intent(this, BottomNavigationActivity.class), new Intent(this, TabbedActivity.class),
                new Intent(this, FullscreenActivity.class), new Intent(this, SettingsActivity.class), new Intent(this, NavigationDrawerActivity.class),
                new Intent(this, LoginActivity.class), new Intent(this, ScrollingActivity.class), new Intent(this, MapsActivity.class),
                new Intent(this, MDFItemListActivity.class), new Intent(this, UiElementsActivity.class), new Intent(this, UielmActivity.class),
                new Intent(this, RecyclerViewActivity.class), new Intent(this, DialogActivity.class)};




        clickListener = new OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = v.getId();
                switch (id){
                    case R.id.textView_main_test_activity:


                        //mIntent = new Intent(this, BasicActivity.class);
                        startActivity(mIntent[0]);

                        //BlankFragment bf = new BlankFragment();
                        //bf.getLayoutInflater().inflate(R.layout.fragment_blank, getBaseContext());
                        //setContentView(R.layout.fragment_blank);
                        //Toast.makeText(getBaseContext(), "Case1", Toast.LENGTH_SHORT).show();

                        break;
                    case R.id.textView_main_empty_activity:
                        //mIntent = new Intent(this, EmptyActivity.class);
                        startActivity(mIntent[1]);
                        break;
                    case R.id.textView_main_basic_activity:
                        //mIntent = new Intent(this, TestActivity.class);
                        startActivity(mIntent[2]);
                        break;
                    case R.id.textView_main_fragmentvm_activity:
                        startActivity(mIntent[3]);
                        break;
                    case R.id.textView_main_bottomnavigation_activity:
                        startActivity(mIntent[4]);
                        break;
                    case R.id.textView_main_tabbed_activity:
                        startActivity(mIntent[5]);
                        break;
                    case R.id.textView_main_fullscreen_activity:
                        startActivity(mIntent[6]);
                        break;
                    case R.id.textView_main_settings_activity:
                        startActivity(mIntent[7]);
                        break;
                    case R.id.textView_main_navigationdrawer_activity:
                        startActivity(mIntent[8]);
                        break;
                    case R.id.textView_main_login_activity:
                        startActivity(mIntent[9]);
                        break;
                    case R.id.textView_main_scrolling_activity:
                        startActivity(mIntent[10]);
                        break;
                    case R.id.textView_main_maps_activity:
                        startActivity(mIntent[11]);
                        break;
                    case R.id.textView_main_masterdetailflow_activity:
                        startActivity(mIntent[12]);
                        break;
                    case R.id.textView_main_uielements_activity:
                        startActivity(mIntent[13]);
                        break;
                    case R.id.textViewUielmActivity:
                        startActivity(mIntent[14]);
                        break;
                    case R.id.textViewRecyclerViewActivity:
                        startActivity(mIntent[15]);
                        break;
                    case R.id.textViewDialogActivity:
                        startActivity(mIntent[16]);
                        break;
                    default:
                        Toast.makeText(getBaseContext(), "Click" + String.valueOf(v.getId()) + "!!!", Toast.LENGTH_SHORT).show();
                        break;
                }

            }
        };
        for(TextView tv : tv_main){
            tv.setOnClickListener(clickListener);
        }
        /*tv1.setOnClickListener(clickListener);
        tv2.setOnClickListener(clickListener);
        tv3.setOnClickListener(clickListener);*/
    }

    @Nullable
    @Override
    public View onCreateView(@Nullable View parent, @NonNull String name, @NonNull Context context, @NonNull AttributeSet attrs) {
        //tv1.setOnClickListener();
        //clickListener.onClick(parent);
        return super.onCreateView(parent, name, context, attrs);
        //View rootView = inflater.inflate(R.layout.fragment1, container, false);
        //return rootView;
    }



    /*public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }*/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id){
            case R.id.item1:
                Toast.makeText(getBaseContext(), "Item1", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item2:
                Toast.makeText(getBaseContext(), "Item2", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item_exit:
                this.finishAffinity();
                System.exit(0);
                break;
        }

        /*if(id == R.id.item1){
            Toast.makeText(getBaseContext(), "Item1", Toast.LENGTH_SHORT).show();
        }
        if(id == R.id.item2){
            Toast.makeText(getBaseContext(), "Item2", Toast.LENGTH_SHORT).show();
        }*/

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        this.finishAffinity();
        System.exit(0);
    }
}