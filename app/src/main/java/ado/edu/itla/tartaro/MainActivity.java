package ado.edu.itla.tartaro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(LOG_TAG, "Estoy por aquí");

        //Boton Categoria

        Button btnCategoria = findViewById(R.id.btnCategoria);
        btnCategoria.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent vistaCategoria;
                vistaCategoria = new Intent(MainActivity.this, CategoriaActivity.class);
                startActivity(vistaCategoria);

            }
        });

        Button btnRegistroGeneral = findViewById(R.id.btnRegistroActivity);
        btnRegistroGeneral.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                System.out.println("Aquiiii. Registro");
                Intent RegistroGeneral = new Intent(MainActivity.this, RegistroGeneral.class);
                startActivity(RegistroGeneral);
            }
        });

        Button btnLogIn = findViewById(R.id.btn_LogIn);
        btnLogIn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                System.out.println("Aquiiii. LogIn");
                Intent LogIn = new Intent(MainActivity.this, LogInGeneral.class);
                startActivity(LogIn);

            }
        });


    }

}