package com.corona.COVID19;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class Activity_scanner extends AppCompatActivity {

    Button btnscan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scanner);
        btnscan = (Button) findViewById(R.id.btnScan);
        final Activity_scanner activity = this;

        btnscan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IntentIntegrator integrador = new IntentIntegrator(activity);
                integrador.setDesiredBarcodeFormats(IntentIntegrator.QR_CODE_TYPES);
                integrador.setPrompt("Camera Scan");
                integrador.setCameraId(0);
                integrador.initiateScan();


            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
        if(result != null){
                if(result.getContents() != null){
                    alert(result.getContents());
                }
        }else {
            alert("Scan cancelado");
            super.onActivityResult(requestCode, resultCode, data);
        }
    }

    private void alert(String msg){
        Toast.makeText(getApplicationContext(), "A posição da pessoa é: " + msg, Toast.LENGTH_LONG).show();
    }
}
