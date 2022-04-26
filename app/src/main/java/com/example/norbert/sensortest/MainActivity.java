package com.example.norbert.sensortest;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private SensorManager sManager;
    private TextView viewText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        List<Sensor> devicesSensors = sManager.getSensorList(Sensor.TYPE_ALL);
        viewText = (TextView) findViewById(R.id.textView);

    }
}
