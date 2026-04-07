package com.example.context_option;

import android.os.Bundle;
import android.view.*;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView tvContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvContext = findViewById(R.id.tvContext);

        registerForContextMenu(tvContext);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_options, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.menu_profile) {
            Toast.makeText(this, "Profile Selected", Toast.LENGTH_SHORT).show();
        }
        else if (item.getItemId() == R.id.menu_settings) {
            Toast.makeText(this, "Settings Selected", Toast.LENGTH_SHORT).show();
        }
        else if (item.getItemId() == R.id.menu_exit) {
            finish();
        }
        return true;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.menu_context, menu);
    }
    @Override
    public boolean onContextItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.con_edit) {
            Toast.makeText(this, "Edit Clicked", Toast.LENGTH_SHORT).show();
        }
        else if (item.getItemId() == R.id.con_delete) {
            Toast.makeText(this, "Delete Clicked", Toast.LENGTH_SHORT).show();
        }
        return true;
    }
}
