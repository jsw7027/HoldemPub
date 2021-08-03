package com.example.holdempub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignInPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_page);

    }

    public void goToSignUp(View view) {

        Intent intent1 = new Intent(getApplicationContext(), SignUpPage.class);
        startActivity(intent1);
    }

    public void login(View view) {

        Intent login = new Intent(getApplicationContext(), TradePage.class);
        startActivity(login);
    }
}