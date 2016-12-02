package com.digitalmirko.brainteam;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class BrainDetailActivity extends AppCompatActivity {

    TextView nameTextView;
    TextView bornTextView;
    TextView professionTextView;
    TextView detailsTextView;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brain_detail);

        nameTextView = (TextView) findViewById(R.id.nameTextView);
        bornTextView = (TextView) findViewById(R.id.bornTextView);
        professionTextView = (TextView) findViewById(R.id.professionTextView);
        detailsTextView = (TextView) findViewById(R.id.detailsTextView);
        imageView = (ImageView) findViewById(R.id.imageView);

        // Persons Name
        String personName = (String) getIntent().getExtras().get("personName");
//        System.out.println("The person is here! " + personName); // Test to see if click works
        nameTextView.setText(personName);

        // Person birth place
        switch (personName){
            case "Nikola Tesla":
                bornTextView.setText("Serbian American");
                imageView.setImageResource(R.mipmap.nikola);
                break;
            case "Elon Musk":
                bornTextView.setText("South African");
                imageView.setImageResource(R.mipmap.elon);
                break;
            case "Bill Gates":
                bornTextView.setText("U.S. Born");
                imageView.setImageResource(R.mipmap.bill);
                break;
            case "Steve Jobs":
                bornTextView.setText("U.S. Born");
                imageView.setImageResource(R.mipmap.steve);
                break;
            case "Larry Page":
                bornTextView.setText("U.S. Born");
                imageView.setImageResource(R.mipmap.larry);
                break;
            case "Sergey Brin":
                bornTextView.setText("Soviet Born");
                imageView.setImageResource(R.mipmap.sergey);
                break;
            default:
                break;
        }




    }

}
