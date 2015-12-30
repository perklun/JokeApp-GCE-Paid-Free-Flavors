package com.example.myjokes;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class JokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        String joke = getIntent().getStringExtra("joke");
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        JokeFragment jokeFragment = JokeFragment.newInstance(joke);
        ft.replace(R.id.jokeFragment, jokeFragment);
        ft.commit();
    }

    public void returnToMainActivity(View v){
        finish();
    }
}
