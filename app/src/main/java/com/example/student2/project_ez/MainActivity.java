package com.example.student2.project_ez;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("LOG","FATAL ERROR  1");
                Toast.makeText(MainActivity.this,
                        R.string.toastText1,
                        Toast.LENGTH_SHORT).show();
            }
        });
        Button btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("LOG","FATAL ERROR 2");
                Toast.makeText(MainActivity.this,
                        R.string.toastText2,
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
