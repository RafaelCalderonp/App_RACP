package com.example.app_racp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String nameApp = "FUERA  PIRAÑA";
         //Texview es la clase y  mEditText es como la instancie yo
        //TextView mTexView = findViewById(R.id.texView);
        //mTexView.setText(nameApp);
        //int number1 = 10;
        //int number2 = 20;
        //mTexView.setText(" LA SUMA ES: " + (number1 + number2));

        EditText editText1 = findViewById(R.id.editTextNumber);
        EditText editText2 = findViewById(R.id.editTextNumber2);
        TextView mTexView = findViewById(R.id.texView);
        Button button = findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = editText1.getText().toString();
                String num2 = editText2.getText().toString();
                int result =Integer.parseInt(num1) + Integer.parseInt(num2);
                mTexView.setText(result);
            }
        });
    }
}