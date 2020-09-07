package com.example.barcodescanner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.IOException;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button btnStartScanning;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStartScanning = findViewById(R.id.btnStartScanning);
        btnStartScanning.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnStartScanning:
                Intent intent = new Intent(this, ScanningActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }

}