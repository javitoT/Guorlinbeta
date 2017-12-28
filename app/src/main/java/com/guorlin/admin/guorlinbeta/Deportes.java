package com.guorlin.admin.guorlinbeta;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Deportes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deportes);
    }

    public void gotodep1 (View view){

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=7gjR60TSn8Q"));
        startActivity(intent);

    }

    public void gotodep2 (View view){

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=CtgRY3Bww38"));
        startActivity(intent);

    }

    public void gotodep3 (View view){

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=wfNvZwN87Hg&t=70s"));
        startActivity(intent);

    }

    public void gotodep4 (View view){

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=AX4hWfyHr5g&t=1s"));
        startActivity(intent);

    }

    public void gotodep5 (View view){

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=AX4hWfyHr5g&t=1s"));
        startActivity(intent);

    }

    public void gotodep6 (View view){

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=JTWdUBIvOFY"));
        startActivity(intent);

    }

    public void gotodep7 (View view){

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=U2E1BlI20vI"));
        startActivity(intent);

    }
}
