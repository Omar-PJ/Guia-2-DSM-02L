package com.example.analisisderesultados2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Bundle;
import android.widget.TextView;


public class Segundactividad extends AppCompatActivity {
    TextView etNombre,etsalario,etiss,etafp,etrenta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundactividad);
        etsalario = findViewById(R.id.txtsalario);
        etiss = findViewById(R.id.txtISS);
        etafp= findViewById(R.id.txtAFP);
        etrenta= findViewById(R.id.txtRenta);
        etNombre=findViewById(R.id.txtNombre);
        Bundle datos = getIntent().getExtras();
        String nombre = datos.getString("nombre");
        int horas = datos.getInt("horas");
        //operaciones
        double salario=8.50*horas;
        double iss=0.02*salario;
        double afp=0.03*salario;
        double renta=0.04*salario;
        etNombre.setText("Hola "+nombre+" tus datos son:");
        etsalario.setText("Su salario es de $"+salario+"");
        etiss.setText("El descuento de ISS es de $"+iss+"");
        etafp.setText("El descuento de AFP es de $"+afp+"");
        etrenta.setText("El descuento de RENTA es de $"+renta+"");
    }
}