package com.example.vmai_sizebook;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * Created by Victor on 2017-02-04.
 */

public class SizeBookActivity extends Activity {

    private static final String FILENAME = "file.sav";
    public ListView oldPersonsList;

    private ArrayList<Person> personList;
    private ArrayAdapter<Person> adapter;

    
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button addButton = (Button) findViewById(R.id.add);

        addButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                addPerson(v);
            }
        });
    }

    public void addPerson (View view) {
        Intent intent = new Intent(this, AddPersonActivity.class);
    }



}
