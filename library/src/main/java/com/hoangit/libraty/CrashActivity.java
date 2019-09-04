package com.hoangit.libraty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class CrashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crash);

        TextView tvCrash = findViewById(R.id.tv_crash);
        tvCrash.setText(CrashManager.getAllErrorDetailsFromIntent(this,getIntent()));
    }
}
