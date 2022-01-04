package com.ford.activitycycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Integer onCreateCount=0;
    private Integer onStartCount=0;
    private Integer onPauseCount=0;
    private Integer onResumeCount=0;
    private Integer onStopCount=0;
    private Integer onDestroyCount=0;

    private TextView onCreateText;
    private TextView onStartText;
    private TextView onPauseText;
    private TextView onResumeText;
    private TextView onStopText;
    private TextView onDestroyText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onCreateCount++;
        onCreateText=findViewById(R.id.onCreateCount);
        onCreateText.setText("onCreate:"+onCreateCount.toString());
        Toast.makeText(getApplicationContext(), "onCreate Called", Toast.LENGTH_LONG).show();
        Log.i("onCreate():","Activity is created");
    }
    protected void onStart() {
        super.onStart();
        onStartCount++;
        onStartText=findViewById(R.id.onStartCount);
        onStartText.setText("onStart:"+onStartCount.toString());
        Toast.makeText(getApplicationContext(), "onStart Called", Toast.LENGTH_LONG).show();
        Log.i("onStart():","Activity started");
    }
    protected void onResume() {
        super.onResume();
        onResumeCount++;
        onResumeText=findViewById(R.id.onResumeCount);
        onResumeText.setText("onResume:"+onResumeCount.toString());
        Toast.makeText(getApplicationContext(), "onResume Called", Toast.LENGTH_LONG).show();
        Log.i("onResume():","Activity Resumed");
    }
    protected void onPause() {
        super.onPause();
        onPauseCount++;
        onPauseText=findViewById(R.id.onPauseCount);
        onPauseText.setText("onPause:"+onPauseCount.toString());
        Toast.makeText(getApplicationContext(), "onPause Called", Toast.LENGTH_LONG).show();
        Log.i("onPause():","Activity paused");
    }
    protected void onStop() {
        super.onStop();
        onStopCount++;
        onStopText=findViewById(R.id.onStopCount);
        onStopText.setText("onStop:"+onStopCount.toString());
        Toast.makeText(getApplicationContext(), "onStop Called", Toast.LENGTH_LONG).show();
        Log.i("onStop():","Activity stopped");
    }
    protected void onDestroy() {
        super.onDestroy();
        onDestroyCount++;
        onDestroyText=findViewById(R.id.onDestroyCount);
        onDestroyText.setText("onDestroy:"+onDestroyCount.toString());
        Toast.makeText(getApplicationContext(), "onDestroy Called", Toast.LENGTH_LONG).show();
        Log.i("onDestroy():","Activity destroyed");
    }


}