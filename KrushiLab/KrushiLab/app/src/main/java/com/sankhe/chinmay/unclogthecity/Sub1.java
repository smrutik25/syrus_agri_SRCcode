package com.sankhe.chinmay.unclogthecity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Sub1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub1);
    }

    public void sendMessage(View view)
    {
        EditText editText=findViewById(R.id.editText);
        String message=editText.getText().toString();
        Intent intent=new Intent(this,FinalcompToilet.class);
        intent.putExtra("EXTRA_MESSAGE",message);
        startActivity(intent);
    }

}

