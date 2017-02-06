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

/**
 * Activity used to create a person class with user input for adding to the list
 */
public class AddPersonActivity extends AppCompatActivity {
    /**
     * Called on creation
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        setContentView(R.layout.person_entry);

        /**
         * Button initialization
         */
        Button confirmButton = (Button) findViewById(R.id.confirm);

        /**
         * Listen for button click after user inputs information
         */
        confirmButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                // Get editName text field into string
                EditText editName = (EditText) findViewById(R.id.editName);
                String newName = editName.getText().toString();

                // Create a new person with given new name, person not created if no name inputted
                Person person = new Person(newName);

                /**
                 * Turn editDate field into string
                 * If newDate is not empty, call setDate function to set date of constructed person
                 */
                EditText editDate = (EditText) findViewById(R.id.Date);
                String newDate = editDate.getText().toString();
                if (!newDate.matches("")) {
                    person.setDate(newDate);
                }

                /**
                 * Turn editNeck field into string
                 * If neckString is not empty, neckString is changed into double
                 * Call setNeckSize function to set neck size of constructed person
                 */
                EditText editNeck = (EditText) findViewById(R.id.editNeck);
                String neckString = editNeck.getText().toString();
                if (!neckString.matches("")) {
                    Double newNeck = Double.parseDouble(neckString);
                    person.setNeckSize(newNeck);
                }

                /**
                 * Turn editBust field into string
                 * If bustString is not empty, bustString is changed into double
                 * Call setBustSize function to set bust size of constructed person
                 */
                EditText editBust = (EditText) findViewById(R.id.editBust);
                String bustString = editBust.getText().toString();
                if (!neckString.matches("")) {
                    Double newBust = Double.parseDouble(bustString);
                    person.setBustSize(newBust);
                }

                /**
                 * Turn editChest field into string
                 * If chestString is not empty, chestString is changed into double
                 * Call setChestSize function to set chest size of constructed person
                 */
                EditText editChest = (EditText) findViewById(R.id.editChest);
                String chestString = editChest.getText().toString();
                if (!chestString.matches("")) {
                    Double newChest = Double.parseDouble(chestString);
                    person.setChestSize(newChest);
                }

                /**
                 * Turn editWaist field into string
                 * If waistString is not empty, waistString is changed into double
                 * Call setWaistSize function to set waist size of constructed person
                 */
                EditText editWaist = (EditText) findViewById(R.id.editWaist);
                String waistString = editWaist.getText().toString();
                if (!waistString.matches("")) {
                    Double newWaist = Double.parseDouble(waistString);
                    person.setWaistSize(newWaist);
                }

                /**
                 * Turn editHip field into string
                 * If hipString is not empty, hipString is changed into double
                 * Call setHipSize function to set hip size of constructed person
                 */
                EditText editHip = (EditText) findViewById(R.id.editHip);
                String hipString = editWaist.getText().toString();
                if (!hipString.matches("")) {
                    Double newHip = Double.parseDouble(hipString);
                    person.setHipSize(newHip);
                }

                /**
                 * Turn editInseam field into string
                 * If inseamString is not empty, inseamString is changed into double
                 * Call setInseamSize function to set inseam size of constructed person
                 */
                EditText editInseam = (EditText) findViewById(R.id.editInseam);
                String inseamString = editInseam.getText().toString();
                if (!inseamString.matches("")) {
                    Double newInseam = Double.parseDouble(inseamString);
                    person.setInseamSize(newInseam);
                }

                /**
                 * Turn editComment field into string
                 * If newComment is not empty, comment is saved to person with setter
                 */
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

