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
                professionTextView.setText("Inventor, Electrical/Mechanical Engineer\nPhysicist, and Futurist");
                detailsTextView.setText("Tesla gained experience in telephony and electrical engineering before emigrating to the United States in 1884 to work for " +
                        "Thomas Edison in New York City. He soon struck out on his own with financial backers, setting up laboratories and companies to develop a range" +
                        " of electrical devices. His patented AC induction motor and transformer were licensed by George Westinghouse, who also hired Tesla for a short" +
                        " time as a consultant. His work in the formative years of electric-power development was involved in a corporate alternating current/direct " +
                        "current \"War of Currents\" as well as various patent battles. He became a naturalized US citizen in 1891.\n\n" +
                        "Tesla went on to pursue his ideas of wireless lighting and electricity distribution in his high-voltage, high-frequency power experiments " +
                        "in New York and Colorado Springs and made early (1893) pronouncements on the possibility of wireless communication with his devices. " +
                        "He tried to put these ideas to practical use in an ill-fated attempt at intercontinental wireless transmission, his unfinished " +
                        "Wardenclyffe Tower project. In his lab, he also conducted a range of experiments with mechanical oscillators/generators, electrical " +
                        "discharge tubes, and early X-ray imaging. He also built a wireless controlled boat, one of the first ever exhibited.\n\n" +
                        "Tesla was renowned for his achievements and showmanship, eventually earning him a reputation in popular culture as an " +
                        "archetypal \"mad scientist\". His patents earned him a considerable amount of money, much of which was used to finance his own " +
                        "projects with varying degrees of success. He lived most of his life in a series of New York hotels through his retirement. " +
                        "Tesla died on 7 January 1943 in New York City. His work fell into relative obscurity after his death, but in 1960, " +
                        "the General Conference on Weights and Measures named the SI unit of magnetic flux density the tesla in his honor. " +
                        "There has been a resurgence in popular interest in Tesla since the 1990s\n");
                imageView.setImageResource(R.mipmap.nikola);
                break;
            case "Elon Musk":
                bornTextView.setText("South African-born Canadian-American ");
                imageView.setImageResource(R.mipmap.elon4b);
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
