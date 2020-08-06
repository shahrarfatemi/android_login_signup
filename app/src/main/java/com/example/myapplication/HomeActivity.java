package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    TextView userText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        String userName = CurrentUser.userName;
        userText = (TextView) findViewById(R.id.userText);
        userText.setText("Hello "+userName);
    }
    @Override
    public void onBackPressed(){
        Toast.makeText(HomeActivity.this, "back pressed", Toast.LENGTH_SHORT).show();
    }
}
