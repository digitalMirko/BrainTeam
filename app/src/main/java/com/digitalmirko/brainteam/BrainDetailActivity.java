package com.digitalmirko.brainteam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class BrainDetailActivity extends AppCompatActivity {

    TextView nameTextView;
    TextView bornTextView;
    TextView professionTextView;
    TextView detailsTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brain_detail);

        nameTextView = (TextView) findViewById(R.id.nameTextView);
        bornTextView = (TextView) findViewById(R.id.bornTextView);
        professionTextView = (TextView) findViewById(R.id.professionTextView);
        detailsTextView = (TextView) findViewById(R.id.detailsTextView);

        String personName = (String) getIntent().getExtras().get("personName");
//        System.out.println("The person is here! " + personName); // Test to see if click works

        nameTextView.setText(personName);

    }

}
