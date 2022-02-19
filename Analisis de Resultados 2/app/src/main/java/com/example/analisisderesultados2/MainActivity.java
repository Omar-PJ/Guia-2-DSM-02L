package com.example.analisisderesultados2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    EditText etnombre, ethoras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etnombre=findViewById(R.id.txtNombre);
        ethoras=findViewById(R.id.txtHoras);
    }
    public void SegundaActividad(View view) {
        String nombre= etnombre.getText().toString();
        int horas=Integer.valueOf(ethoras.getText().toString());
        Intent intent = new Intent(this,Segundactividad.class);
        intent.putExtra("nombre",nombre);
        intent.putExtra("horas",horas);
        startActivity(intent);
    }
}