package com.ishuinzu.menusdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnOptionMenu, btnContextMenu, btnPopupMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOptionMenu = findViewById(R.id.btnOptionMenu);
        btnContextMenu = findViewById(R.id.btnContextMenu);
        btnPopupMenu = findViewById(R.id.btnPopupMenu);

        btnOptionMenu.setOnClickListener(this);
        btnContextMenu.setOnClickListener(this);
        btnPopupMenu.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnOptionMenu:
                //Start Option Menu Activity
                startActivity(new Intent(MainActivity.this, OptionMenuActivity.class));
                break;

            case R.id.btnContextMenu:
                //Start Context Menu Activity
                startActivity(new Intent(MainActivity.this, ContextMenuActivity.class));
                break;

            case R.id.btnPopupMenu:
                //Start Popup Menu Activity
                startActivity(new Intent(MainActivity.this, PopupMenuActivity.class));
                break;
        }
    }
}