package com.sankhe.chinmay.unclogthecity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ToiletActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toilet);

    } public void submitComplaint(View view)
    {
        EditText editText = findViewById(R.id.user_Complaint);
        String message = editText.getText().toString();

        Intent intent = new Intent(this, FinalcompToilet.class);
        intent.putExtra("EXTRA_MESSAGE", message);
        startActivity(intent);
    }
    public void mapsToilet(View view){
        startActivity(new Intent(this,MapsActivity1.class));

    }
}
