package com.ishuinzu.menusdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class PopupMenuActivity extends AppCompatActivity {
    private Button btnShowPopup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_menu);

        btnShowPopup = findViewById(R.id.btnShowPopup);

        btnShowPopup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Show Popup Menu
                PopupMenu popupMenu = new PopupMenu(PopupMenuActivity.this, btnShowPopup);
                popupMenu.inflate(R.menu.my_menu);
                popupMenu.setOnMenuItemClickListener(onMenuItemClickListener);
                popupMenu.show();
            }
        });
    }

    PopupMenu.OnMenuItemClickListener onMenuItemClickListener = new PopupMenu.OnMenuItemClickListener() {
        @SuppressLint("NonConstantResourceId")
        @Override
        public boolean onMenuItemClick(MenuItem item) {
            switch (item.getItemId()) {
                case R.id.menuDownload:
                    Toast.makeText(PopupMenuActivity.this, "Download Menu", Toast.LENGTH_SHORT).show();
                    break;

                case R.id.menuShare:
                    Toast.makeText(PopupMenuActivity.this, "Share Menu", Toast.LENGTH_SHORT).show();
                    break;

                case R.id.manuUpload:
                    Toast.makeText(PopupMenuActivity.this, "Upload Menu", Toast.LENGTH_SHORT).show();
                    break;
            }
            return true;
        }
    };
}