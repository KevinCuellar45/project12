package com.example.ssss;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //METODOS PARA LOS BOTONES
    public void RegistrarRutina(View View){
        Intent RegistrarRutina = new Intent(this,MainActivity2.class);
        startActivity(RegistrarRutina);
    }
    public void HorarioRutina(View View){
        Intent HorarioRutina = new Intent(this,MainActivity3.class);
        startActivity(HorarioRutina);
    }
        public void Progreso(View View){
        Intent Progreso = new Intent(this,MainActivity4.class);
        startActivity(Progreso);
    }
    public void Configuracion(View View){
        Intent Configuracion = new Intent(this,MainActivity5.class);
        startActivity(Configuracion);
    }
    public void AcercaDe(View View){
        Intent AcercaDe = new Intent(this,MainActivity6.class);
        startActivity(AcercaDe);
    }
}