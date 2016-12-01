package com.digitalmirko.brainteam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BrainDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brain_detail);

        String personName = (String) getIntent().getExtras().get("personName");

        System.out.println("The person is here! " + personName); // Test to see if click works

    }

}
