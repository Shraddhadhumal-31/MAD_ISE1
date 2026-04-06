package com.example.explicit_ex;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    Button btnOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroup);
        btnOrder = findViewById(R.id.btnOrder);

        btnOrder.setOnClickListener(v -> {

            int selectedId = radioGroup.getCheckedRadioButtonId();

            if (selectedId == -1) {
                Toast.makeText(MainActivity.this, "Please select a food item", Toast.LENGTH_SHORT).show();
            } else {
                String food = "";

                if (selectedId == R.id.rbPizza) {
                    food = "Pizza";
                } else if (selectedId == R.id.rbBurger) {
                    food = "Burger";
                } else if (selectedId == R.id.rbPasta) {
                    food = "Pasta";
                }
                Intent intent = new Intent(MainActivity.this, OrderActivity.class);
                intent.putExtra("FOOD_ITEM", food);
                startActivity(intent);
            }
        });
    }
}
