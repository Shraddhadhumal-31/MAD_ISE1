package com.example.checkbox;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    CheckBox cbJava, cbAndroid, cbDatabase, cbCompiler;
    CheckBox cbOS, cbCN, cbSE, cbAI;
    Button btnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbJava = findViewById(R.id.cbJava);
        cbAndroid = findViewById(R.id.cbAndroid);
        cbDatabase = findViewById(R.id.cbDatabase);
        cbCompiler = findViewById(R.id.cbCompiler);

        cbOS = findViewById(R.id.cbOS);
        cbCN = findViewById(R.id.cbCN);
        cbSE = findViewById(R.id.cbSE);
        cbAI = findViewById(R.id.cbAI);

        btnSubmit = findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(v -> {

            String subjects = "Selected Subjects:\n";

            if (cbJava.isChecked()) subjects += "Java\n";
            if (cbAndroid.isChecked()) subjects += "Android\n";
            if (cbDatabase.isChecked()) subjects += "Database\n";
            if (cbCompiler.isChecked()) subjects += "Compiler Design\n";
            if (cbOS.isChecked()) subjects += "Operating System\n";
            if (cbCN.isChecked()) subjects += "Computer Networks\n";
            if (cbSE.isChecked()) subjects += "Software Engineering\n";
            if (cbAI.isChecked()) subjects += "Artificial Intelligence\n";

            if (subjects.equals("Selected Subjects:\n")) {
                Toast.makeText(this, "No subject selected", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, subjects, Toast.LENGTH_LONG).show();
            }
        });
    }
}
