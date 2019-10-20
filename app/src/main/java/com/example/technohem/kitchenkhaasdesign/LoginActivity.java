package com.example.technohem.kitchenkhaasdesign;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    TextView textRegister,textbacktolanding;
    Button btn_sendto_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        textRegister = (TextView)findViewById(R.id.textView_Register);
        textbacktolanding = (TextView)findViewById(R.id.textView_backToLandingPage);
        btn_sendto_main = (Button)findViewById(R.id.btn_login2main);

        textRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                Intent i = new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(i);
            }
        });

        textbacktolanding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                Intent i = new Intent(LoginActivity.this,NewUserActivity.class);
                startActivity(i);
            }
        });

        btn_sendto_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this,MainActivity.class);
                startActivity(i);
            }
        });
    }

    @Override
    public void onBackPressed() {
        finish();
        Intent i = new Intent(LoginActivity.this,NewUserActivity.class);
        startActivity(i);
    }
}
