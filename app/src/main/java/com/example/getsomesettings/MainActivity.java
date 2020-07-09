package com.example.getsomesettings;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.ActivityManager;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Fibonacci::";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text = findViewById(R.id.txt_process);
        ActivityManager am = (ActivityManager) getApplicationContext().
                getSystemService(Activity.ACTIVITY_SERVICE);
        RunningTaskInfo foregroundTaskInfo = am.getRunningTasks(10).get(0);
        packageName
        text.setText(packageName);
    }
}