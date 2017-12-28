package com.guorlin.admin.guorlinbeta;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void gotocategorias (View view){

        Intent intent = new Intent(this, Categorias.class);
        startActivity(intent);

    }

    public void gotopremium (View view){

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=YP490BtVF4E&t"));
        startActivity(intent);

    }

    public void gotocontacto (View view){

        Intent intent = new Intent(this, Contacto.class);
        startActivity(intent);

    }


    public void gotoguorlin (View view){

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://wwww.guorlin.wordpress.com"));
        startActivity(intent);

    }
}
