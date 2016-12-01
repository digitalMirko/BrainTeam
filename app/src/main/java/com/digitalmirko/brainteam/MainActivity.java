package com.digitalmirko.brainteam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    String[] brainTeam = new String[]{"Nikola Tesla","Elon Musk","Bill Gates","Steve Jobs", "Larry Page", "Sergey Brin"};

    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);

        ArrayAdapter<String> brainTeamAdapter = new ArrayAdapter<String>(getBaseContext(),android.R.layout.simple_list_item_1, brainTeam);

        listView.setAdapter(brainTeamAdapter);

        listView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
//        System.out.println("Tapped:" + position); // Test to see which positions tapped
//        System.out.println(brainTeam[position]); // Test to see which person was tapped

        Intent moveToDetailIntent = new Intent(getBaseContext(), BrainDetailActivity.class);
        moveToDetailIntent.putExtra("personName", brainTeam[position]);
        startActivity(moveToDetailIntent);


    }
}
