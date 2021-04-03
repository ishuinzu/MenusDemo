package com.ishuinzu.menusdemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ContextMenuActivity extends AppCompatActivity {
    private Button btnLongPress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_context_menu);

        btnLongPress = findViewById(R.id.btnLongPress);

        //Register btnLongPress For Context Menu
        registerForContextMenu(btnLongPress);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.add(0, v.getId(), 0, "Share");
        menu.add(0, v.getId(), 0, "Upload");
        menu.add(0, v.getId(), 0, "Download");
        menu.add(0, v.getId(), 0, "Select");
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if (item.getTitle().equals("Share")) {
            Toast.makeText(this, "Share Menu", Toast.LENGTH_SHORT).show();
        } else if (item.getTitle().equals("Upload")) {
            Toast.makeText(this, "Upload Menu", Toast.LENGTH_SHORT).show();
        } else if (item.getTitle().equals("Download")) {
            Toast.makeText(this, "Download Menu", Toast.LENGTH_SHORT).show();
        } else if (item.getTitle().equals("Select")) {
            Toast.makeText(this, "Select Menu", Toast.LENGTH_SHORT).show();
        }
        return true;
    }
}