package com.digitalmirko.brainteam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    String[] brainTeam = new String[]{"Nikola Tesla","Elon Musk","Bill Gates","Steve Jobs", "Larry Page", "Sergey Brin"};

    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);

        ArrayAdapter<String> brainTeamAdapter = new ArrayAdapter<String>(getBaseContext(),android.R.layout.simple_list_item_1, brainTeam);

        listView.setAdapter(brainTeamAdapter);

    }
}
