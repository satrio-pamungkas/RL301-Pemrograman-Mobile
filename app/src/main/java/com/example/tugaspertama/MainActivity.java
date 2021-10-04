package com.example.tugaspertama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.tugaspertama.extra.MESSAGE";
    private EditText EmailText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
        EmailText = findViewById(R.id.editTextTextEmailAddress);
    }

    public void launchSecondActivity(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        String message = EmailText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}