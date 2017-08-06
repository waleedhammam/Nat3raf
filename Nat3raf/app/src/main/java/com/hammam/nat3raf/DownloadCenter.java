package com.hammam.nat3raf;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DownloadCenter extends AppCompatActivity {

    private Button simplyArduinoButton, arduinoOfficialSiteButton,
                arduinoSimulationBookButton, arduinoIdeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_download_center);

        simplyArduinoButton = (Button) findViewById(R.id.simply_arduino_button);
        arduinoOfficialSiteButton = (Button) findViewById(R.id.arduino_official_site_button);
        arduinoSimulationBookButton = (Button) findViewById(R.id.arduino_simulation_book_button);
        arduinoIdeButton = (Button) findViewById(R.id.arduino_ide_button);

        simplyArduinoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://librebooks.org/simply-arduino/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        arduinoOfficialSiteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://arduino.cc/";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        arduinoSimulationBookButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://docs.google.com/uc?authuser=0&id=0B-xWBBQzf-YkZklyVzhmWS1oMVk&export=download";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        arduinoIdeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://arduino.cc/en/Main/Software";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
    }
}
