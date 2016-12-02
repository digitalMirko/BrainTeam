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
                bornTextView.setText("South African-born, Canadian-American ");
                professionTextView.setText("Business Magnate, Investor\nEngineer, and Inventor");
                detailsTextView.setText("Elon is the founder, CEO, and CTO of SpaceX; co-founder, CEO, and product architect of Tesla Motors; co-founder and chairman " +
                        "of SolarCity; co-chairman of OpenAI; co-founder of Zip2; and founder of X.com which merged with PayPal of Confinity. As of June 2016, he has an " +
                        "estimated net worth of US$11.5 billion, making him the 83rd wealthiest person in the world.\n\n" +
                        "Musk has stated that the goals of SolarCity, Tesla Motors, and SpaceX revolve around his vision to change the world and humanity." +
                        "His goals include reducing global warming through sustainable energy production and consumption, and reducing the \"risk of human extinction\" " +
                        "by \"making life multiplanetary\" by setting up a human colony on Mars.\n\n" +
                        "In addition to his primary business pursuits, he has also envisioned a high-speed transportation system known as the Hyperloop, and has proposed" +
                        " a VTOL supersonic jet aircraft with electric fan propulsion, known as the Musk electric jet.");
                imageView.setImageResource(R.mipmap.elon4b);
                break;
            case "Bill Gates":
                bornTextView.setText("U.S. Born");
                professionTextView.setText("Business Magnate, Investor,\nAuthor and Philanthropis");
                detailsTextView.setText("In 1975, Gates and Paul Allen co-founded Microsoft, which became the world's largest PC software company. During his career at " +
                        "Microsoft, Gates held the positions of chairman, CEO and chief software architect, and was the largest individual shareholder until May 2014." +
                        "Gates has authored and co-authored several books.\n\n" +
                        "Starting in 1987, Gates was included in the Forbes list of the world's wealthiest people and was the wealthiest from 1995 to 2007, again in 2009, " +
                        "and has been since 2014. Between 2009 and 2014, his wealth doubled from US$40 billion to more than US$82 billion. Between 2013 and 2014, his wealth " +
                        "increased by US$15 billion. Gates is currently the richest person in the world, with an estimated net worth of US$81.7 billion as of November 2016.\n\n" +
                        "Gates is one of the best-known entrepreneurs of the personal computer revolution. Gates has been criticized for his business tactics, which have " +
                        "been considered anti-competitive, an opinion that has in some cases been upheld by numerous court rulings. Later in his career Gates pursued a " +
                        "number of philanthropic endeavors, donating large amounts of money to various charitable organizations and scientific research programs through the " +
                        "Bill & Melinda Gates Foundation, established in 2000.");
                imageView.setImageResource(R.mipmap.bill);
                break;
            case "Steve Jobs":
                bornTextView.setText("U.S. Born, Arab American");
                professionTextView.setText("Businessman, Inventor,\nand Industrial Designer");
                detailsTextView.setText("Steve was the co-founder, chairman, and chief executive officer (CEO) of Apple Inc.; CEO and majority shareholder of Pixar; " +
                        "a member of The Walt Disney Company's board of directors following its acquisition of Pixar; and founder, chairman, and CEO of NeXT. Jobs is widely " +
                        "recognized as a pioneer of the microcomputer revolution of the 1970s and 1980s, along with Apple co-founder Steve Wozniak. Shortly after his death, " +
                        "Jobs's official biographer, Walter Isaacson, described him as a \"creative entrepreneur whose passion for perfection and ferocious drive revolutionized " +
                        "six industries: personal computers, animated movies, music, phones, tablet computing, and digital publishing.\"");
                imageView.setImageResource(R.mipmap.steve);
                break;
            case "Larry Page":
                bornTextView.setText("U.S. Born");
                professionTextView.setText("Computer Scientist and\nan Internet Entrepreneur");
                detailsTextView.setText("Larry co-founded Google Inc. with Sergey Brin in 1998.\n\n" + "Page is the chief executive officer (CEO) of Google's parent company, " +
                        "Alphabet Inc. After stepping aside as Google CEO in August 2001 in favour of Eric Schmidt, he re-assumed the role in April 2011. He announced his " +
                        "intention to step aside a second time in July 2015 to become CEO of Alphabet, under which Google's assets would be reorganized. Under Page, Alphabet " +
                        "is seeking to deliver major advancements in a variety of industries.\n\n" +
                        "In November 2016, he is the 12th richest person in the world, with an estimated net worth of US$36.9 billion.\n\n" +
                        "Page is the inventor of PageRank, Google's best-known search ranking algorithm. Page received the Marconi Prize in 2004");
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
