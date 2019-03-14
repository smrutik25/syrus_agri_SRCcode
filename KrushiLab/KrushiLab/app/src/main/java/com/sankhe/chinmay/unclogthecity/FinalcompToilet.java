package com.sankhe.chinmay.unclogthecity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FinalcompToilet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finalcomp_toilet);
        Intent intent =  getIntent() ;
        String message =intent.getStringExtra("EXTRA_MESSAGE");
        TextView textView=findViewById(R.id.display_message);
        textView.setText(message);
    }
}
