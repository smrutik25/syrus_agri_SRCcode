package com.sankhe.chinmay.unclogthecity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class loginActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private TextView Info;
    private Button Login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Name =(EditText) findViewById(R.id.etname);
        Password=(EditText) findViewById(R.id.etpassword);
        Info=(TextView) findViewById(R.id.tvinfo);
        Login=(Button) findViewById(R.id.btnlogin);
    }
    
}
