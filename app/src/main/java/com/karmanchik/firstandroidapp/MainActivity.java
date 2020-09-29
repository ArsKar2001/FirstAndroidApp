package com.karmanchik.firstandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("SetTextI18n")
    public void bntConvertClick(View view) {
        EditText ptFieldId = findViewById(R.id.ptFieldId);
        TextView resultText = findViewById(R.id.resultText);

        String text = ptFieldId.getText().toString();
        if(!text.equals("")) {
            float number = (float) (Float.parseFloat(text) * 1.6);
            resultText.setText("В "+text+" милях = "+number+" км.");
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}