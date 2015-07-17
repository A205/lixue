package com.example.administrator.bmi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by Administrator on 2015/7/16.
 */
public class Welcome extends Activity {
    private  final int SPLASH_DISPLAY_LENGTH=2000;
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
        new Handler().postDelayed(new Runnable(){
            public void run(){
                Intent intent=new Intent(Welcome.this,MainActivity.class);
                startActivity(intent);
                Welcome.this.finish();
                finish();
            }
        },SPLASH_DISPLAY_LENGTH);
    }
}