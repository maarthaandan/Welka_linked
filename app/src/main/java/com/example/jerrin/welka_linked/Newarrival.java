package com.example.jerrin.welka_linked;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by jerrin on 30/5/17.
 */

public class Newarrival extends AppCompatActivity {

    Button b5 = (Button) findViewById(R.id.button5);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newarrival);
        b5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent confirm = new Intent(Newarrival.this, Confirm.class);
                startActivity(confirm);
            }
        });
    }
}
