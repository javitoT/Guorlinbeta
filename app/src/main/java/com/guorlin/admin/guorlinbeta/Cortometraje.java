package com.guorlin.admin.guorlinbeta;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Cortometraje extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cortometraje);
    }

    public void gotocorto1 (View view){

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=SeDOoLwQQGo&t=547s"));
        startActivity(intent);

    }

    public void gotocorto2 (View view){

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=G-XZhKqQAHU"));
        startActivity(intent);

    }

    public void gotocorto3 (View view){

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=e5_EE7Hpr6I"));
        startActivity(intent);

    }

    public void gotocorto4 (View view){

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=x3dhMxf7-QM"));
        startActivity(intent);

    }

    public void gotocorto5 (View view){

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=WqCH4DNQBUA"));
        startActivity(intent);

    }
}
