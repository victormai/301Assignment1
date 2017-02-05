package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Victor on 2017-02-04.
 */

public class SizeBookActivity extends Activity {

    private ListView oldPersonList;
    private ArrayList<Person> personList;
    private ArrayAdapter<Person> adapter;

    @Override
    protected void  onStart() {
        super.onStart();
        adapter = new ArrayAdapter<Person>(this,R.layout.list_item, personList);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_size_book);
    }

    public void listPersons(View view) {
        Person person = new Person("John");
        personList.add(person);
        setContentView(R.layout.test);
    }

    public void addPerson(View view){
        Intent intent = new Intent(this, AddPersonActivity.class);
        startActivityForResult(intent,1);
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            if(resultCode == Activity.RESULT_OK){
                Person newPerson = (Person) data.getExtras().getSerializable("newPerson");
                personList.add(newPerson);
            }
        }
    }

    private void loadFromFile() {
        try {
            FileInputStream fis = openFileInput(FILENAME);
            BufferedReader in = new BufferedReader(new InputStreamReader(fis));

            Gson gson = new Gson();

            // Taken from http://stackoverflow.com/questions/12384064/gson-convert-from-json-to-a-typed-arraylistt
            // 2017-01-26 17:53:59
            personList = gson.fromJson(in,new TypeToken<ArrayList<Person>>(){}.getType());

            fis.close();
        } catch (FileNotFoundException e) {
            personList = new ArrayList<Person>();
        } catch (IOException e) {
            throw new RuntimeException();
        }

    }

}
