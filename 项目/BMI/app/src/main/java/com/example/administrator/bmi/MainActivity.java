package com.example.administrator.bmi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {
    private EditText height = null;
    private EditText weight = null;
    private Button button = null;
    private Button button2 = null;
    private TextView result = null;
    private EditText aim=null;
    private TextView outcome = null;
    private TextView name=null;



    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button=(Button)findViewById(R.id.btn);
        Button button2=(Button)findViewById(R.id.btn2);

        height=(EditText) findViewById(R.id.height);
        weight=(EditText) findViewById(R.id.weight);
        aim=(EditText) findViewById(R.id.aim);
        name=(EditText) findViewById(R.id.name);
        result=(TextView) findViewById(R.id.result1);
        outcome=(TextView) findViewById(R.id.result2);


        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,GuanyuActivity.class);
                startActivity(intent);
            }
        });





        button.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {
                if (TextUtils.isEmpty(height.getText().toString()) || TextUtils.isEmpty(weight.getText().toString())||
                        TextUtils.isEmpty(aim.getText().toString())||TextUtils.isEmpty(name.getText().toString())) {
                    Toast.makeText(getApplicationContext(), "请输入数据", Toast.LENGTH_LONG).show();
                    return;
                }



                double h = new Double(height.getText().toString());
                double w = new Double(weight.getText().toString());
                double a = new Double(aim.getText().toString());


                Intent intent=new Intent(MainActivity.this,OtherActivity.class);

                intent.putExtra("height",h);
                intent.putExtra("weight",w);
                intent.putExtra("aim",a);
                intent.putExtra("name",name.getText().toString());

                startActivity(intent);
            }
        });
    }




}