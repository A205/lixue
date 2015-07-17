package com.example.administrator.bmi;

/**
 * Created by Administrator on 2015/7/16.
 */
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.text.DecimalFormat;


public class OtherActivity extends Activity {
    private EditText height = null;
    private EditText weight = null;

    private TextView result = null;
    private EditText aim = null;
    private TextView call = null;
    private TextView outcome = null;
    private TextView name = null;
    private TextView compare = null;
    private TextView body = null;


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.other_activity);




        double bmi = 0;
        double h = getIntent().getDoubleExtra("height", 0);
        double w = getIntent().getDoubleExtra("weight", 0);
        double a = getIntent().getDoubleExtra("aim", 0);
        String b = getIntent().getStringExtra("name");

        compare = (TextView) findViewById(R.id.compare);
        result = (TextView) findViewById(R.id.result1);
        body = (TextView) findViewById(R.id.weight2);
        outcome = (TextView) findViewById(R.id.result2);
        call = (TextView) findViewById(R.id.call);



        h = h / 100;
        bmi = w / (h * h);
        bmi= new Double( new DecimalFormat( ".00" ).format( bmi ) );
        a = w - a;

        if (a > 0) {
            a = a * 2;
            compare.setText("比目标高" + a + "斤");
        } else if (a < 0) {
            a = (-a) * 2;
            compare.setText("比目标低" + a + "斤");
        } else if (a == 0) {
            compare.setText("达到理想体重");
        }

        w = w * 2;
        body.setText(+w + "");
        call.setText(b);



        if (bmi < 18.5) {
            result.setText(+bmi + "");
            outcome.setText("偏瘦");

        } else if (bmi >= 18.5 && bmi < 24) {

            result.setText(+bmi + "");
            outcome.setText("标准");
        } else if (bmi >= 24 && bmi <= 28) {

            result.setText(+bmi + "");
            outcome.setText("偏胖");
        } else if (bmi > 28) {

            result.setText(+bmi + "");
            outcome.setText("肥胖");
        }

    }
}


