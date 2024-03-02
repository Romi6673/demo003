package com.example.demo003;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView tv;
    int x = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        tv = findViewById(R.id.tv);
    }

    public void go(View view) {
        x++;
        if (x % 6 == 0) {
            tv.setText("Enough clicks to go to a new start");
            x = 0;
        } else {
            tv.setText("This is click number: " + x);
        }
    }
}
