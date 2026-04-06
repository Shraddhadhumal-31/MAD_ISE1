package com.example.ratingprogress;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    RatingBar ratingBar;
    TextView tvPercent;
    TextView tvLoading;
    ProgressBar progressHorizontal, progressCircular;
    Button btnRate, btnStart;
    int progress = 0;
    Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ratingBar = findViewById(R.id.ratingBar);
        tvPercent = findViewById(R.id.tvPercent);
        tvLoading = findViewById(R.id.tvLoading);
        progressHorizontal = findViewById(R.id.progressHorizontal);
        progressCircular = findViewById(R.id.progressCircular);

        btnRate = findViewById(R.id.btnRate);
        btnStart = findViewById(R.id.btnStart);

        btnRate.setOnClickListener(v -> {
            float rating = ratingBar.getRating();
            Toast.makeText(this, "You rated: " + rating, Toast.LENGTH_SHORT).show();
        });

        btnStart.setOnClickListener(v -> {
            progress = 0;
            progressCircular.setVisibility(View.VISIBLE);

            new Thread(() -> {
                while (progress < 100) {
                    progress += 10;

                    handler.post(() -> {
                        progressHorizontal.setProgress(progress);
                        tvPercent.setText(progress + "%");
                    });

                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

                handler.post(() -> {
                    progressCircular.setVisibility(View.GONE);
                    tvLoading.setText("Completed");
                    Toast.makeText(this, "Loading Complete!", Toast.LENGTH_SHORT).show();
                });
            }).start();
        });   }
}
