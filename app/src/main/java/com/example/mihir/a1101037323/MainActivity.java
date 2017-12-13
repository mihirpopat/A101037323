package com.example.mihir.a1101037323;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends Activity {
;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1= (Button) findViewById(R.id.buttonEnter);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
                {
                    startActivity(new Intent(MainActivity.this, CuisineType.class));


            }
        });
    }




}
