package com.example.ssss;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;



public class MainActivity5 extends AppCompatActivity {

    SwitchCompat SwitchE;
    ImageView imagenview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        imagenview= (ImageView) findViewById(R.id.imageView4);
        SwitchE=(SwitchCompat)findViewById(R.id.switch1);
    }
    public void onclicks(View View){
        if(View.getId()==R.id.switch1){
            if(SwitchE.isChecked()){
                imagenview.setVisibility(View.VISIBLE);
            }else{imagenview.setVisibility(View.INVISIBLE);}
        }
    }

}