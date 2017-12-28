package com.guorlin.admin.guorlinbeta;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Animacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animacion);
    }

    public void gotoani1 (View view){

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=F1eLeIocAcU&t=4s"));
        startActivity(intent);

    }

    public void gotoani2 (View view){

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=G7Dt9ziemYA"));
        startActivity(intent);

    }

    public void gotoani3 (View view){

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=i8TAvBmBD7c"));
        startActivity(intent);

    }

    public void gotoani4 (View view){

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=wczdECcwRw0"));
        startActivity(intent);

    }

    public void gotoani5 (View view){

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=XiDRZfeL_hc"));
        startActivity(intent);

    }

    public void gotoani6 (View view){

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=VZK02CW7oy4"));
        startActivity(intent);

    }

    public void gotoani7 (View view){

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=SZ0fKW5PttM"));
        startActivity(intent);

    }
}
