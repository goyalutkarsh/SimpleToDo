package com.example.simpletodo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class EditActivity extends AppCompatActivity {

    EditText etItem;
    Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        etItem = findViewById(R.id.etItem);
        btnSave = findViewById(R.id.btnSave);

        getSupportActionBar().setTitle("Edit item");

        etItem.setText(getIntent().getStringExtra(MainActivity.KEY_ITEM_TEXT);

    }
}