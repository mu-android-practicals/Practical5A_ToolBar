package com.example.toolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar tbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tbar=findViewById(R.id.toolBar);
        setSupportActionBar(tbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater mi = getMenuInflater();
        mi.inflate(R.menu.appp_bar_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId()==R.id.search)
            Toast.makeText(this, "Search menu click", Toast.LENGTH_SHORT).show();

        if (item.getItemId()==R.id.save)
            Toast.makeText(this, "Search save click", Toast.LENGTH_SHORT).show();

        if (item.getItemId()==R.id.setting)
            Toast.makeText(this, "Search setting click", Toast.LENGTH_SHORT).show();



        return super.onOptionsItemSelected(item);
    }
}