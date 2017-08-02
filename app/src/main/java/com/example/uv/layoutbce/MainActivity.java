package com.example.uv.layoutbce;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
    // Objects declaration
    Button btnLinearVertical, btnLinearHorizontal, btnRelative, btnAbsolute;
    Intent verticalIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // object creation/instant
        btnLinearVertical = (Button)findViewById(R.id.btnlinearv);
        btnLinearHorizontal = (Button)findViewById(R.id.btnlinearh);
        btnRelative = (Button)findViewById(R.id.btnrelative);
        btnAbsolute = (Button)findViewById(R.id.btnabsolutely);

        //click listeners
        btnLinearVertical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verticalIntent = new Intent(MainActivity.this, VerticalLinearLayout.class);
                startActivity(verticalIntent);

            }
        });

        btnLinearHorizontal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "CLicked Here", Toast.LENGTH_SHORT).show();
            }
        });

        btnAbsolute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "CLicked Here", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
