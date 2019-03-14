package com.sankhe.chinmay.unclogthecity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.File;

public class GarbageActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garbage);

    }
    public void Complaint(View view)
    {
        startActivity(new Intent(this,Sub1.class));
    }

    public void Submit(View view)
    {
        startActivity(new Intent(this,FinalcompToilet.class));
    }

    public void Open_Camera(View view)
    {
        startActivity(new Intent(this,Camera.class));
    }


}
