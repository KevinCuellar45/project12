package com.example.ssss;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity6 extends AppCompatActivity {

    private TextView etx1;
    private CheckBox check1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        check1=(CheckBox)findViewById(R.id.checkBoxsaludable);
        etx1=(TextView)findViewById(R.id.textView11);

    }

    public void decir(View View){
        if(check1.isChecked() == true){
            etx1.setText("Me alegra por usted");
        }else{etx1.setText(":3");};
    }
}