package com.example.navemenu;

import android.content.Intent;
import android.graphics.Color;
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
        int id= menu.getItemId();
        if(id==R.id.red){
            lv.setBackgroundColor(Color.RED);
        }
        if(id==R.id.blue){
            lv.setBackgroundColor(Color.BLUE);
        }
        if(id==R.id.green){
            lv.setBackgroundColor(Color.GREEN);
        }
        return  true;
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_color_list);
        LinearLayout lv= (LinearLayout) findViewById(R.id.lv);
    }

    public void nextact(View view) {
    Intent si=new Intent(this,FourColorList.class);
    startActivity(si);
    }
}
