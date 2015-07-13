package com.example.administrator.bmi;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {
    private EditText height = null;
    private EditText weight = null;
    private Button button = null;
    private TextView result = null;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button=(Button)findViewById(R.id.btn);

        height=(EditText) findViewById(R.id.height);
        weight=(EditText) findViewById(R.id.weight);
        result=(TextView) findViewById(R.id.result);


        button.setOnClickListener(new View.OnClickListener() {
            double bmi=0;

            public void onClick(View v) {

                double h=new Double(height.getText().toString());
                double w=new Double(weight.getText().toString());
                h=h/100;
                bmi=w/(h*h);



                double final_resault = exchangeResault(bmi);
                if(bmi<18.5){

                    result.setText("\n"+"BMI指数为:"+final_resault+"\n"+"\n"+"偏轻");
                }

                else if(bmi>=18.5&&bmi<24){

                   result.setText("\n"+"BMI指数为:"+final_resault+"\n"+"\n"+"正常 ");
                }

                else if(bmi>=24&&bmi<27){

                    result.setText("\n"+"BMI指数为:"+final_resault+"\n"+"\n"+"偏重");
                }

                else if(bmi>=27&&bmi<30){

                   result.setText("\n"+"BMI指数为:"+final_resault+"\n"+"\n"+"偏胖");
                }

                else if(bmi>=30&&bmi<35){

                    result.setText("\n"+"BMI指数为:"+final_resault+"\n"+"\n"+"中等肥胖");
                }

                else if(bmi>35){

                  result.setText("\n"+"BMI指数为:"+final_resault+"\n"+"\n"+"重度肥胖");
                }
            }
        });
    }


    public double exchangeResault(double resault){
        double first =resault*100;
        double second = (int) first;

        double second_first = first-second;

        if(second_first>0.5){

            second++;
        }

        double jieguo = (double)second/100;
        return jieguo;

    }

}
