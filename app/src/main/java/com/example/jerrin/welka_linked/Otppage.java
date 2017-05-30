package com.example.jerrin.welka_linked;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by jerrin on 30/5/17.
 */

public class Otppage extends AppCompatActivity {

    Button b4 = (Button) findViewById(R.id.button);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.otppage);
        b4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(Otppage.this, "OTP has been sent",
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}
