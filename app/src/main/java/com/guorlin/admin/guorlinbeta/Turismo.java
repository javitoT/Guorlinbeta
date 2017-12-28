package com.guorlin.admin.guorlinbeta;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Turismo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turismo);
    }

    public void gototuri1 (View view){

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=L_tqK4eqelA&t=163s"));
        startActivity(intent);

    }

    public void gototuri2 (View view){

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=FzrkpXlRP1M"));
        startActivity(intent);

    }

    public void gototuri3 (View view){

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=FzrkpXlRP1M"));
        startActivity(intent);

    }

    public void gototuri4 (View view){

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=mQWKmN7IRBo"));
        startActivity(intent);

    }

    public void gototuri5 (View view){

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=1ziMH_lAUW0"));
        startActivity(intent);

    }

    public void gototuri6 (View view){

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=n1fZe-Oqs14"));
        startActivity(intent);

    }
}
