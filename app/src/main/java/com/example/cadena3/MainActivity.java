package com.example.cadena3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView nombre = (TextView) findViewById(R.id.edinombre);
        final TextView edad = (TextView) findViewById(R.id.ediedad);
        final TextView correo = (TextView) findViewById(R.id.edicorreo);
        final TextView telefono = (TextView) findViewById(R.id.editelefono);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TableLayout lista = (TableLayout) findViewById(R.id.lista);
                String [] cadena = {nombre.getText().toString(), edad.getText().toString(),correo.getText().toString(), telefono.getText().toString()};
                        TableRow row = new TableRow(getBaseContext());
                TextView textView;
                //generamos una variable
               //System.out.println(cadena);
                for (int i=0; i<4; i++)
                {
                    textView=new TextView(getBaseContext());
                    textView.setGravity(Gravity.CENTER_VERTICAL);//centro de la tabla
                    textView.setPadding(15,15,15,15);
                    textView.setBackgroundResource(R.color.purple_200);
                    textView.setText(cadena[i]);
                    textView.setTextColor(Color.WHITE);
                    row.addView(textView);
                }
                lista.addView(row);
            }
        });
    }
}