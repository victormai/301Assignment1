package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Victor on 2017-02-04.
 */

/**
 * This class is the main view class of the project. <br> In this class,
 * user interaction and file manipulation is performed.
 * All files are in the form of "json" files that are stored in
 * Emulator's memory, accessible from Android Device Monitor
 * The file name is indicated in the &nbsp &nbsp &nbsp FILENAME constant.
 *
 * @author Victor Mai
 * @version 1.4.2
 * @since 1.0
 * */
public class SizeBookActivity extends Activity {

    /**
     * Initialize variables
     */
    private ListView oldPersonList;
    private ArrayList<Person> personList;
    private ArrayAdapter<Person> adapter;

    /**
     * runs on start up
     */
    @Override
    protected void  onStart() {
        super.onStart();
        adapter = new ArrayAdapter<Person>(this,R.layout.list_item, personList);
    }

    /**
     * Called when the activity is first created
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_size_book);
    }

    /**
     * Create pop-up list of stored persons
     * @param view
     */
    public void listPersons(View view) {
        Person person = new Person("John");
    }

    /**
     * Change activity to AddPersonActivity for user input of a person's info
     * wait for result so that person can be added to personList
     * @param view
     */
    public void addPerson(View view){
        Intent intent = new Intent(this, AddPersonActivity.class);
        startActivityForResult(intent,1);
    }

    /**
     * recovers person item from AddPersonActivity so that it can be stored into personList
     * @param requestCode
     * @param resultCode
     * @param data
     */
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            if(resultCode == Activity.RESULT_OK){
                Person newPerson = (Person) data.getExtras().getSerializable("newPerson");
            }
        }
    }


}
