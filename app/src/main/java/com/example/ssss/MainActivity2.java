package com.example.ssss;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity2 extends AppCompatActivity {

    private Spinner SpinnerDia;
    private Spinner SpinnerMusculo;
    private Spinner SpinnerRutina;
    private Spinner SpinnerRepeticiones;
    private Spinner SpinnerSeries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        SpinnerMusculo = (Spinner)findViewById(R.id.SpinnerMusculo);
        SpinnerRutina = (Spinner)findViewById(R.id.SpinnerRutina);
        SpinnerRepeticiones = (Spinner)findViewById(R.id.SpinnerRepeticiones);
        SpinnerSeries = (Spinner)findViewById(R.id.SpinnerSeries);
        SpinnerDia = (Spinner)findViewById(R.id.SpinnerDia);

        String []Dia = {"-------------","Lunes", "Martes", "Miercoles", "Jueves", "Viernes","Sabado"};
        String Musculo[] = {"-------------","Biceps", "Triceps", "Pecho", "Espalda", "Abdomen", "Cuadriceps","Femorales","Gluteo"};
        String rutina[] ={"-------------","curl 21", "Press frances" , "Press inclinado", "Remo con barra", "plancha", "Extenciones","Prensa", "Puente"};
        String repeticiones[]={"-------------","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
        String series[]={"-------------","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"};

        ArrayAdapter <String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, Dia);
        SpinnerDia.setAdapter(adapter1);
        ArrayAdapter <String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, Musculo);
        SpinnerMusculo.setAdapter(adapter2);
        ArrayAdapter <String> adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, rutina);
        SpinnerRutina.setAdapter(adapter3);
        ArrayAdapter <String> adapter4 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, repeticiones);
        SpinnerRepeticiones.setAdapter(adapter4);
        ArrayAdapter <String> adapter5 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, series);
        SpinnerSeries.setAdapter(adapter5);
    }
    public void Registrar(View view){
        String diaR = SpinnerDia.getSelectedItem().toString();
        String musculoR = SpinnerMusculo.getSelectedItem().toString();
        String rutinaR = SpinnerRutina.getSelectedItem().toString();
        String repeticionesR = SpinnerRepeticiones.getSelectedItem().toString();
        String seriesR = SpinnerSeries.getSelectedItem().toString();

    }
    public void Guardar(View View){
        Intent Guardar = new Intent(this,MainActivity.class);
        startActivity(Guardar);
    }
}