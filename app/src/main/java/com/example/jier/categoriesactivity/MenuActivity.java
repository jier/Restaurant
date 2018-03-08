package com.example.jier.categoriesactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MenuActivity extends AppCompatActivity implements MenuesRequest.Callback {
    public ListView listView;
    private MenuItemAdapter adapter = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        listView = findViewById(R.id.menu);
        Intent intent = getIntent();
        new MenuesRequest(getApplicationContext()).getMenuItem(this,intent.getStringExtra("category"));
    }

    @Override
    public void gotMenuItems(ArrayList<MenuItem> items) {
        adapter = new MenuItemAdapter(this,R.layout.activity_menu,items);
        listView.setAdapter(adapter);
    }

    @Override
    public void gotMenuItemsError(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT);
    }
}
