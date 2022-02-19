package com.example.analisisderesultado1;
import androidx.lifecycle.ViewModel;

public class ViewModelSumar extends ViewModel {

    int numero = 0;

    public int getNumero() {

        if (numero <= 9) {
            return numero++;
        } else {
            return numero = 0;
        }


    }
}
