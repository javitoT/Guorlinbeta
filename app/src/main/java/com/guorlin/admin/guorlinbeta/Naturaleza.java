package com.guorlin.admin.guorlinbeta;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Naturaleza extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_naturaleza);
    }

    public void gotonat1 (View view){

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=v64KOxKVLVg&t=105s"));
        startActivity(intent);

    }

    public void gotonat2 (View view){

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=rG4jSz_2HDY"));
        startActivity(intent);

    }

    public void gotonat3 (View view){

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=0XrH2WO1Mzs"));
        startActivity(intent);

    }

    public void gotonat4 (View view){

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=o3a1fkLsNS4"));
        startActivity(intent);

    }

    public void gotonat5 (View view){

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=mlOiXMvMaZo"));
        startActivity(intent);

    }

    public void gotonat6 (View view){

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=7E3XcO9DozY"));
        startActivity(intent);

    }

    public void gotonat7 (View view){

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=BbT_e8lWWdo&t=1s"));
        startActivity(intent);

    }
}
