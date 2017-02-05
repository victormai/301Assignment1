package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Victor on 2017-02-04.
 */

public class AddPersonActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        setContentView(R.layout.person_entry);

        Button confirmButton = (Button) findViewById(R.id.confirm);

        confirmButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                EditText editName = (EditText) findViewById(R.id.editName);
                String newName = editName.getText().toString();

                Person person = new Person(newName);

                EditText editDate = (EditText) findViewById(R.id.Date);
                String newDate = editDate.getText().toString();
                if (!newDate.matches("")) {
                    person.setDate(newDate);
                }

                EditText editNeck = (EditText) findViewById(R.id.editNeck);
                String neckString = editNeck.getText().toString();
                if (!neckString.matches("")) {
                    Double newNeck = Double.parseDouble(neckString);
                    person.setNeckSize(newNeck);
                }

                EditText editBust = (EditText) findViewById(R.id.editBust);
                String bustString = editBust.getText().toString();
                if (!neckString.matches("")) {
                    Double newBust = Double.parseDouble(bustString);
                    person.setBustSize(newBust);
                }

                EditText editChest = (EditText) findViewById(R.id.editChest);
                String chestString = editChest.getText().toString();
                if (!chestString.matches("")) {
                    Double newChest = Double.parseDouble(chestString);
                    person.setChestSize(newChest);
                }

                EditText editWaist = (EditText) findViewById(R.id.editWaist);
                String waistString = editWaist.getText().toString();
                if (!waistString.matches("")) {
                    Double newWaist = Double.parseDouble(waistString);
                    person.setWaistSize(newWaist);
                }

                EditText editHip = (EditText) findViewById(R.id.editHip);
                String hipString = editWaist.getText().toString();
                if (!hipString.matches("")) {
                    Double newHip = Double.parseDouble(hipString);
                    person.setHipSize(newHip);
                }

                EditText editInseam = (EditText) findViewById(R.id.editInseam);
                String inseamString = editInseam.getText().toString();
                if (!inseamString.matches("")) {
                    Double newInseam = Double.parseDouble(inseamString);
                    person.setInseamSize(newInseam);
                }

                EditText editComment = (EditText) findViewById(R.id.editComment);
                String newComment = editComment.getText().toString();
                if (!newComment.matches("")) {
                    person.setInputComment(newComment);
                }

                Intent intent = new Intent();
                intent.putExtra("newPerson", person);
                setResult(Activity.RESULT_OK,intent);
                finish();
            }
        });
    }

}

