package com.example.film;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.film);

        List<String> list = new ArrayList<>();
        list.add("SpiderMan");
        list.add("IronMan");
        list.add("Hulk");
        list.add("Thor");

        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,list);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener( new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent , View view , int position ,long id)
            {
                i = new Intent(MainActivity.this, locandina.class);
                i.putExtra("titolo", parent.getItemAtPosition(position).toString());
                startActivity(i);

            }
        });


    }
}

