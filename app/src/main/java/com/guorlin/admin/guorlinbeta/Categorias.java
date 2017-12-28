package com.guorlin.admin.guorlinbeta;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Categorias extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorias);
    }

    public void gotodep (View view){

        Intent intent = new Intent(this, Deportes.class);
        startActivity(intent);

    }

    public void gotonat (View view){

        Intent intent = new Intent(this, Naturaleza.class);
        startActivity(intent);

    }

    public void gotoani (View view){

        Intent intent = new Intent(this, Animacion.class);
        startActivity(intent);

    }

    public void gototer (View view){

        Intent intent = new Intent(this, Terror.class);
        startActivity(intent);

    }

    public void gotocorto (View view){

        Intent intent = new Intent(this, Cortometraje.class);
        startActivity(intent);

    }


    public void gototuri (View view){

        Intent intent = new Intent(this, Turismo.class);
        startActivity(intent);

    }


    public void gotoguorlin (View view){

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://wwww.guorlin.wordpress.com"));
        startActivity(intent);

    }
}
