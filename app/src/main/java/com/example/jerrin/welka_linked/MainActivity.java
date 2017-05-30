package com.example.jerrin.welka_linked;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b1 = (Button)findViewById(R.id.button2);
    Button b2 = (Button)findViewById(R.id.button3);
    Button b3 = (Button)findViewById(R.id.button4);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                startActivity(cameraIntent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent newarrival = new Intent(MainActivity.this,Newarrival.class);
                startActivity(newarrival);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent otppage = new Intent(MainActivity.this, Otppage.class);
                startActivity(otppage);
            }
        });
    }
}
