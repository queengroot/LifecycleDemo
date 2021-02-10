package com.example.lifecycledemo;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Toast.makeText(this, "In onCreate - testing GitHub", Toast.LENGTH_SHORT).show();

        Log.i("info", "In onCreate");

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
       // Toast.makeText(this, "In onCreateOptionsMenu", Toast.LENGTH_SHORT).show();

       // Log.i("info", "In onCreateOptionsMenu");
        return true;


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //Toast.makeText(this, "In onOptionsItemSelected", Toast.LENGTH_SHORT).show();

        //Log.i("info", "In onOptionsItemSelected");
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onStart(){
        //call official version of this method
        super.onStart();

        Toast.makeText(this, "In onStart", Toast.LENGTH_SHORT).show();

        Log.i("info", "In onStart");

    }

    @Override
    public void onResume(){
        //call official version of this method
        super.onResume();

        Toast.makeText(this, "In onResume", Toast.LENGTH_SHORT).show();

        Log.i("info", "In onResume");

    }

    @Override
    public void onPause(){
        //call official version of this method
        super.onPause();

        Toast.makeText(this, "In onPause", Toast.LENGTH_SHORT).show();

        Log.i("info", "In onPause");

    }

    @Override
    public void onStop(){
        //call official version of this method
        super.onStop();

        Toast.makeText(this, "In onStop", Toast.LENGTH_SHORT).show();

        Log.i("info", "In onStop");

    }

    @Override
    public void onDestroy(){
        //call official version of this method
        super.onDestroy();

        Toast.makeText(this, "In onDestroy", Toast.LENGTH_SHORT).show();

        Log.i("info", "In onDestroy");

    }

}