package com.example.actividad_01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText input;

    Button FtoC, CtoF, CMStoMTS, MTStoCMS,
           KMStoMTS, MTStoKMS, LBStoKGS, KGStoLBS,
           DOLtoEURO, EUROtoDOL, Limpiar;

    private boolean comprobarInput(EditText input){
        try{
            Double.parseDouble(input.getText().toString());
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        input = (EditText) findViewById(R.id.MainInput);
        FtoC= (Button) findViewById(R.id.btnFtoC);
        CtoF= (Button) findViewById(R.id.btnCtoF);
        CMStoMTS= (Button) findViewById(R.id.btnCmstoMts);
        MTStoCMS= (Button) findViewById(R.id.btnMtstoCms);
        KMStoMTS= (Button) findViewById(R.id.btnKmstoMts);
        MTStoKMS= (Button) findViewById(R.id.btnMtstoKms);
        LBStoKGS= (Button) findViewById(R.id.btnLbstoKgs);
        KGStoLBS= (Button) findViewById(R.id.btnKgstoLbs);
        DOLtoEURO= (Button) findViewById(R.id.btnDoltoEuro);
        EUROtoDOL= (Button) findViewById(R.id.btnEurotoDol);
        Limpiar = (Button) findViewById(R.id.btnLimpiar);

        Limpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText("");
            }
        });

        FtoC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, Output.class);
                Bundle bundle=new Bundle();
                if(comprobarInput(input)) {
                    bundle.putString("Operacion", "Farenheit a Celcius");
                    bundle.putString("Sufijo", "°C");
                    bundle.putDouble("Valor",Double.parseDouble(input.getText().toString()));
                    intent.putExtras(bundle);
                    startActivities(intent);
                }
            }
        });

        CtoF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, Output.class);
                Bundle bundle=new Bundle();
                if(comprobarInput(input)) {
                    bundle.putString("Operacion", "Celcius a Farenheit");
                    bundle.putString("Sufijo", "°F");
                    bundle.putDouble("Valor",Double.parseDouble(input.getText().toString()));
                    intent.putExtras(bundle);
                    startActivities(intent);
                }
            }
        });

        CMStoMTS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, Output.class);
                Bundle bundle=new Bundle();
                if(comprobarInput(input)) {
                    bundle.putString("Operacion", "Centimetros a Metros");
                    bundle.putString("Sufijo", " mts");
                    bundle.putDouble("Valor",Double.parseDouble(input.getText().toString()));
                    intent.putExtras(bundle);
                    startActivities(intent);
                }
            }
        });

        MTStoCMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, Output.class);
                Bundle bundle=new Bundle();
                if(comprobarInput(input)) {
                    bundle.putString("Operacion", "Metros a Centimetros");
                    bundle.putString("Sufijo", " cms");
                    bundle.putDouble("Valor",Double.parseDouble(input.getText().toString()));
                    intent.putExtras(bundle);
                    startActivities(intent);
                }
            }
        });

        KMStoMTS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, Output.class);
                Bundle bundle=new Bundle();
                if(comprobarInput(input)) {
                    bundle.putString("Operacion", "Kilometros a Metros");
                    bundle.putString("Sufijo", " mts");
                    bundle.putDouble("Valor",Double.parseDouble(input.getText().toString()));
                    intent.putExtras(bundle);
                    startActivities(intent);
                }
            }
        });

        MTStoKMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, Output.class);
                Bundle bundle=new Bundle();
                if(comprobarInput(input)) {
                    bundle.putString("Operacion", "Metros a Kilometros");
                    bundle.putString("Sufijo", " kms");
                    bundle.putDouble("Valor",Double.parseDouble(input.getText().toString()));
                    intent.putExtras(bundle);
                    startActivities(intent);
                }
            }
        });

        LBStoKGS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, Output.class);
                Bundle bundle=new Bundle();
                if(comprobarInput(input)) {
                    bundle.putString("Operacion", "Libras a Kilos");
                    bundle.putString("Sufijo", " kgs");
                    bundle.putDouble("Valor",Double.parseDouble(input.getText().toString()));
                    intent.putExtras(bundle);
                    startActivities(intent);
                }
            }
        });

        KGStoLBS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, Output.class);
                Bundle bundle=new Bundle();
                if(comprobarInput(input)) {
                    bundle.putString("Operacion", "Kilos a Libras");
                    bundle.putString("Sufijo", " lbs");
                    bundle.putDouble("Valor",Double.parseDouble(input.getText().toString()));
                    intent.putExtras(bundle);
                    startActivities(intent);
                }
            }
        });

        DOLtoEURO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, Output.class);
                Bundle bundle=new Bundle();
                if(comprobarInput(input)) {
                    bundle.putString("Operacion", "Dolares a Euros");
                    bundle.putString("prefijo", "$");
                    bundle.putDouble("Valor",Double.parseDouble(input.getText().toString()));
                    intent.putExtras(bundle);
                    startActivities(intent);
                }
            }
        });

        EUROtoDOL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, Output.class);
                Bundle bundle=new Bundle();
                if(comprobarInput(input)) {
                    bundle.putString("Operacion", "Euros a Dolares");
                    bundle.putString("Sufijo", "€");
                    bundle.putDouble("Valor",Double.parseDouble(input.getText().toString()));
                    intent.putExtras(bundle);
                    startActivities(intent);
                }
            }
        });
    }
}