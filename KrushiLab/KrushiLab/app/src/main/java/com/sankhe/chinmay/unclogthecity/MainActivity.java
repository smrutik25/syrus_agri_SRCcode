package com.sankhe.chinmay.unclogthecity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
     public void OpenToilet(View view)
    {
        startActivity(new Intent(this,ToiletActivity.class));
    }
    public void OpenGarbage(View view)
    {
        startActivity(new Intent(this,GarbageActivity.class));
    }

}
