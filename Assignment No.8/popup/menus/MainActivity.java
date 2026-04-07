package com.example.menus;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnPopup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Popup Menu");

        btnPopup = findViewById(R.id.btnPopup);

        btnPopup.setOnClickListener(v -> {

            PopupMenu popupMenu = new PopupMenu(MainActivity.this, btnPopup);
            popupMenu.getMenuInflater().inflate(R.menu.menu_popup, popupMenu.getMenu());

            popupMenu.setOnMenuItemClickListener(item -> {

                if (item.getItemId() == R.id.android) {
                    Toast.makeText(this, "Android Selected", Toast.LENGTH_SHORT).show();
                }
                else if (item.getItemId() == R.id.java) {
                    Toast.makeText(this, "Java Selected", Toast.LENGTH_SHORT).show();
                }
                else if (item.getItemId() == R.id.kotlin) {
                    Toast.makeText(this, "Kotlin Selected", Toast.LENGTH_SHORT).show();
                }
                else if (item.getItemId() == R.id.python) {
                    Toast.makeText(this, "Python Selected", Toast.LENGTH_SHORT).show();
                }
                else if (item.getItemId() == R.id.cpp) {
                    Toast.makeText(this, "C++ Selected", Toast.LENGTH_SHORT).show();
                }
                else if (item.getItemId() == R.id.c) {
                    Toast.makeText(this, "C Selected", Toast.LENGTH_SHORT).show();
                }
                else if (item.getItemId() == R.id.javascript) {
                    Toast.makeText(this, "JavaScript Selected", Toast.LENGTH_SHORT).show();
                }
                else if (item.getItemId() == R.id.php) {
                    Toast.makeText(this, "PHP Selected", Toast.LENGTH_SHORT).show();
                }
                else if (item.getItemId() == R.id.swift) {
                    Toast.makeText(this, "Swift Selected", Toast.LENGTH_SHORT).show();
                }
                return true;
            });
            popupMenu.show();
        });
    }
}
