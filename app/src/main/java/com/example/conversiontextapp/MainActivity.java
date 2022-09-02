package com.example.conversiontextapp;

import androidx.appcompat.app.AppCompatActivity;

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
public void binaryConverter(View v){
    EditText editTxtNumber = findViewById(R.id.editTxtNumber);
    String value = editTxtNumber.getText().toString();
    int n1 = Integer.parseInt(value);

    String binary = Integer.toBinaryString(n1);

    TextView lblAnwser = findViewById(R.id.lblAnwser);
    lblAnwser.setText(" " + binary);

}
    public void hexadecimalConverter(View v){
        EditText editTxtNumber = findViewById(R.id.editTxtNumber);
        String value = editTxtNumber.getText().toString();
        int n1 = Integer.parseInt(value);

        String binary = Integer.toHexString(n1);

        TextView lblAnwser = findViewById(R.id.lblAnwser);
        lblAnwser.setText(" " + binary);

    }
}