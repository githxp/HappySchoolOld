package com.hxp.happyschool.activitys;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.hxp.happyschool.R;

/**
 * Created by hxp on 15-11-26.
 */
public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);
        Button obj_navigation = (Button) findViewById(R.id.btn_navigation);
        obj_navigation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6 = new Intent(MainActivity.this, Map3DActivity.class);
                startActivity(intent6);
            }
        });
        Button obj_test = (Button) findViewById(R.id.btn_test);
        obj_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent10 = new Intent(MainActivity.this,test.class);
                startActivity(intent10);
            }
        });
        Button obj_thread = (Button) findViewById(R.id.btn_mainthread);
        obj_thread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent11 = new Intent(MainActivity.this,thread.class);
                startActivity(intent11);
            }
        });
    }
}
