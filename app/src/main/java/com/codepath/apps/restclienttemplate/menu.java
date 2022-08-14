package com.codepath.apps.restclienttemplate;

import android.view.Menu;

import androidx.appcompat.app.AppCompatActivity;

public abstract class menu extends AppCompatActivity {
    public boolean onCreateOptionMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return onCreateOptionsMenu(menu);
    }
}
