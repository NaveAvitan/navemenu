package com.example.navemenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class ThreeColorList extends AppCompatActivity {
LinearLayout lv;
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main,menu);

        return true;
    }
    public boolean onOptionsItemSelected (MenuItem menu){


        return  true;
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_color_list);
        LinearLayout lv= (LinearLayout) findViewById(R.id.lv);
    }

    public void nextact(View view) {
        
    }
}
