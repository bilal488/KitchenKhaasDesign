package com.example.technohem.kitchenkhaasdesign;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NewUserActivity extends AppCompatActivity {

    Button btn_login_via_email;
    TextView txtView_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_user);

        btn_login_via_email = (Button)findViewById(R.id.btn_login_via_email);
        txtView_register = (TextView)findViewById(R.id.txtView_registerA);

        btn_login_via_email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                Intent i = new Intent(NewUserActivity.this,LoginActivity.class);
                startActivity(i);
            }
        });

        txtView_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                Intent i = new Intent(getBaseContext(),RegisterActivity.class);
                startActivity(i);
            }
        });
    }
}
