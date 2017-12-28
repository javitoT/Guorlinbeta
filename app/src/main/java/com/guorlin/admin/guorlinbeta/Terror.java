package com.guorlin.admin.guorlinbeta;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Terror extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terror);
    }

    public void gototer1 (View view){

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=FHUErvVAeIw&t=122s"));
        startActivity(intent);

    }

    public void gototer2 (View view){

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=OwX-YlAa8XQ&t=4s"));
        startActivity(intent);

    }

    public void gototer3 (View view){

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=A6aRkhlqWuE"));
        startActivity(intent);

    }

    public void gototer4 (View view){

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=_FMJ04ekNhQ"));
        startActivity(intent);

    }

    public void gototer5 (View view){

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=digFHDPAPn0"));
        startActivity(intent);

    }

    public void gototer6 (View view){

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=-eG5O1WmQ6Y"));
        startActivity(intent);

    }
}
