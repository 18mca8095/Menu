package com.example.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import static android.os.Trace.isEnabled;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout cl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cl = findViewById(R.id.clp);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.my_menu,menu);


        return true;

    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch(item.getItemId())
        {
            case R.id.red :
                cl.setBackgroundColor(Color.RED);
                item.setEnabled(false);
                return true;
            case R.id.yellow :
                cl.setBackgroundColor(Color.YELLOW);
                item.setEnabled(false);
                return true;
            case R.id.green :
                cl.setBackgroundColor(Color.GREEN);
                item.setEnabled(false);
                return true;
            case R.id.blue :
                cl.setBackgroundColor(Color.BLUE);
                item.setEnabled(false);
                return true;
        }

        return true;
    }



}
