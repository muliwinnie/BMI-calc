package com.example.BMI;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import ke.ac.bmi.R;

public class MainActivity extends AppCompatActivity {

    EditText edUsername, edPassword;
    String username, password;
    TextView TvResult;
    EditText ed1, ed3;
    String weight, height;
    Double val1, val2, BMI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ed3 = findViewById(R.id.editText3);
        ed1 = findViewById(R.id.editText);


    }

    public void calculateBMI(View view) {
        weight = ed1.getText().toString();
        weight = ed1.getText().toString();
        val1 = Double.parseDouble(weight);
        val2 = Double.parseDouble(height);
        BMI = (val1 / (val2 * val2));
        if (BMI < 15) {
            Toast.makeText(getApplicationContext(), "Very severely underweight", Toast.LENGTH_SHORT).show();
            String finalResult = String.valueOf(BMI);
            TvResult.setText("Your BMI is" + finalResult + "and your health is very severely underweight");
        } else if (BMI >= 15 && BMI<= 16 ) {
            Toast.makeText(getApplicationContext(), "Severely underweight", Toast.LENGTH_SHORT).show();
            String finalResult = String.valueOf(BMI);
            TvResult.setText("Your BMI is" + finalResult + "and your health is severely underweight");
        } else if (BMI >= 16.5 && BMI<= 18 ) {
            Toast.makeText(getApplicationContext(), "Severely underweight", Toast.LENGTH_SHORT).show();
            String finalResult = String.valueOf(BMI);
            TvResult.setText("Your BMI is" + finalResult + "and your health is underweight");
        }
            else if (BMI >= 18.5 && BMI<= 25 ) {
            Toast.makeText(getApplicationContext(), "Severely underweight", Toast.LENGTH_SHORT).show();
            String finalResult = String.valueOf(BMI);
            TvResult.setText("Your BMI is" + finalResult + "and your health is normal/healthy weight");
        }
                else if (BMI >= 25.5 && BMI<= 30 ) {
            Toast.makeText(getApplicationContext(), "Severely underweight", Toast.LENGTH_SHORT).show();
            String finalResult = String.valueOf(BMI);
            TvResult.setText("Your BMI is" + finalResult + "and your health is overweight");
        } else if (BMI >= 30.5 && BMI<= 35 ) {
            Toast.makeText(getApplicationContext(), "Severely underweight", Toast.LENGTH_SHORT).show();
            String finalResult = String.valueOf(BMI);
            TvResult.setText("Your BMI is" + finalResult + "and your health is moderately obese");
        } else if (BMI >= 35.5 && BMI<= 40 ) {
            Toast.makeText(getApplicationContext(), "Severely underweight", Toast.LENGTH_SHORT).show();
            String finalResult = String.valueOf(BMI);
            TvResult.setText("Your BMI is" + finalResult + "and your health is severely obese");
        } else if (BMI > 40 ) {
            Toast.makeText(getApplicationContext(), "Severely underweight", Toast.LENGTH_SHORT).show();
            String finalResult = String.valueOf(BMI);
            TvResult.setText("Your BMI is" + finalResult + "and your health is very severely obese");
        }
    }
}
