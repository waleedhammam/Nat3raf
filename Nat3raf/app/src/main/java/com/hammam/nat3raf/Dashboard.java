package com.hammam.nat3raf;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Dashboard extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    Button whatIsArduino, developmentEnvironment, startWithArduino,
            simpleProjects, na3rafNew;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);

        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        whatIsArduino = (Button) findViewById(R.id.what_is_arduino_button);
        developmentEnvironment = (Button) findViewById(R.id.development_environment_button);
        startWithArduino = (Button) findViewById(R.id.start_with_arduino_button);
        simpleProjects = (Button) findViewById(R.id.simple_projects_button);
        na3rafNew = (Button) findViewById(R.id.nat3raf_new_button);

        whatIsArduino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent whatIsArduinoIntent = new Intent(getApplicationContext(), DataViewer.class);
                whatIsArduinoIntent.putExtra("INTENT_ITEM_NAME", "whatIsArduino");
                startActivity(whatIsArduinoIntent);
            }
        });

        developmentEnvironment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent developmentEnvironmentIntent = new Intent(getApplicationContext(), DataViewer.class);
                developmentEnvironmentIntent.putExtra("INTENT_ITEM_NAME", "developmentEnvironment");
                startActivity(developmentEnvironmentIntent);
            }
        });

        startWithArduino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startWithArduinoIntent = new Intent(getApplicationContext(), DataViewer.class);
                startWithArduinoIntent.putExtra("INTENT_ITEM_NAME", "startWithArduino");
                startActivity(startWithArduinoIntent);
            }
        });

        simpleProjects.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent simpleProjectsIntent = new Intent(getApplicationContext(), QuestionsActivity.class);
                startActivity(simpleProjectsIntent);
            }
        });

        na3rafNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /*
                 * dummy check simulator
                 * Add version checker after creating webserver
                 */
                new AlertDialog.Builder(Dashboard.this)
                        .setTitle("جديد نَتَعرّف")
                        .setMessage("لا يوجد اصدارات اخري من نتعرف حالياّ")
                        .setNeutralButton("موافق",null)
                        .setIcon(R.mipmap.ic_launcher)
                        .show();
            }
        });
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.refrences_and_buy) {
            Intent startWithArduinoIntent = new Intent(getApplicationContext(), DataViewer.class);
            startWithArduinoIntent.putExtra("INTENT_ITEM_NAME", "refrences_and_buy");
            startActivity(startWithArduinoIntent);

        } else if (id == R.id.download_center) {
            Intent downloadCenter = new Intent(getApplicationContext(), DownloadCenter.class);
            startActivity(downloadCenter);

        } else if (id == R.id.help) {
            Intent startWithArduinoIntent = new Intent(getApplicationContext(), DataViewer.class);
            startWithArduinoIntent.putExtra("INTENT_ITEM_NAME", "help");
            startActivity(startWithArduinoIntent);

        } else if (id == R.id.call_us) {
            Intent callUs = new Intent(getApplicationContext(), CallUs.class);
            startActivity(callUs);

        } else if (id == R.id.about_us) {
            Intent startWithArduinoIntent = new Intent(getApplicationContext(), DataViewer.class);
            startWithArduinoIntent.putExtra("INTENT_ITEM_NAME", "about_us");
            startActivity(startWithArduinoIntent);

        } else if (id == R.id.exit) {
            finish();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return false;
    }
}
