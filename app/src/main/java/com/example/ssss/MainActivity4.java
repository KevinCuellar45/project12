package com.example.ssss;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    private EditText et1,et2;
    private TextView tv1;
    private RadioButton rb1,rb2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        et1 = (EditText)findViewById(R.id.TxtEstatura);
        et2 =(EditText)findViewById(R.id.TextPeso);
        tv1 = (TextView)findViewById(R.id.TxtResultado);
        rb1 =(RadioButton)findViewById(R.id.radioButton6);
        rb2 =(RadioButton)findViewById(R.id.radioButton7);

    }

    public void calcular(View View){
        String val1_str = et1.getText().toString();
        String val2_str = et2.getText().toString();

        float val1_float =Float.parseFloat(val1_str);
        float  val2_float =Float.parseFloat(val2_str);

        if(rb1.isChecked() == true ){
                float imc = val1_float / val2_float;
                String imc_str = String.valueOf(imc);
                tv1.setText(imc_str);
        }else if(rb2.isChecked() == true){
                float pip = val1_float / (val2_float*val2_float);
                String pip_str = String.valueOf(pip);
                tv1.setText(pip_str);
        }
        }

    };
