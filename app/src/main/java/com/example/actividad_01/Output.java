package com.example.actividad_01;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Output extends AppCompatActivity {

    TextView resultado, leyenda;
    Double val;
    String opc,aux;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_output);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        resultado = (TextView) findViewById(R.id.Resultado);
        leyenda = (TextView) findViewById(R.id.Leyenda);
        Bundle bundle=getIntent().getExtras();
        opc = bundle.getString("Operacion");
        val = bundle.getDouble("Valor");

        switch (opc){
            case "Farenheit a Celcius":
                leyenda.setText(opc);
                val = (val - 32)*(5/9);
                aux = val + bundle.getString("Sufijo");
                resultado.setText(aux);
                break;
            case "Celcius a Farenheit":
                leyenda.setText(opc);
                val = (val * (9/5))+32;
                aux = val + bundle.getString("Sufijo");
                resultado.setText(aux);
                break;
            case "Centimetros a Metros":
                leyenda.setText(opc);
                val/=100;
                aux = val + bundle.getString("Sufijo");
                resultado.setText(aux);
                break;
            case "Metros a Centimetros":
                leyenda.setText(opc);
                val*=100;
                aux = val + bundle.getString("Sufijo");
                resultado.setText(aux);
                break;
            case "Kilometros a Metros":
                leyenda.setText(opc);
                val*=1000;
                aux = val + bundle.getString("Sufijo");
                resultado.setText(aux);
                break;
            case "Metros a Kilometros":
                leyenda.setText(opc);
                val/=1000;
                aux = val + bundle.getString("Sufijo");
                resultado.setText(aux);
                break;
            case "Libras a Kilos":
                leyenda.setText(opc);
                val/=2.20462262;
                aux = val + bundle.getString("Sufijo");
                resultado.setText(aux);
                break;
            case "Kilos a Libras":
                leyenda.setText(opc);
                val*=2.20462262;
                aux = val + bundle.getString("Sufijo");
                resultado.setText(aux);
                break;
            case "Dolares a Euros":
                leyenda.setText(opc);
                val*=0.729980291;
                aux = val + bundle.getString("Sufijo");
                resultado.setText(aux);
                break;
            case "Euros a Dolares":
                leyenda.setText(opc);
                val*=1.3659;
                aux = val + bundle.getString("Sufijo");
                resultado.setText(aux);
                break;
            default:
                resultado.setText("ERROR");

        }
    }

}