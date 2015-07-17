package com.example.administrator.bmi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Administrator on 2015/7/16.
 */
public class GuanyuActivity extends Activity{
    @Override
    protected void  onCreate (Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.introduce);
        Button button3=(Button)findViewById(R.id.btn3);
        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent =new Intent(GuanyuActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
