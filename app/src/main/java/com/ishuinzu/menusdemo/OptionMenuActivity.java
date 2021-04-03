package com.ishuinzu.menusdemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class OptionMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.my_menu, menu);
        return true;
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.manuUpload:
                Toast.makeText(this, "Upload Menu", Toast.LENGTH_SHORT).show();
                break;

            case R.id.menuDownload:
                Toast.makeText(this, "Download Menu", Toast.LENGTH_SHORT).show();
                break;

            case R.id.menuShare:
                Toast.makeText(this, "Share Menu", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}