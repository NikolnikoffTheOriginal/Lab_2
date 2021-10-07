package com.example.lab_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner spCountingOptional;
    EditText edPhrase;
    TextView showCount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.spCountingOptional = findViewById(R.id.spCountingOptional);
        this.edPhrase = findViewById(R.id.edPhrase);
        this.showCount = findViewById(R.id.showCount);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.Counting, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.spCountingOptional.setAdapter(adapter);
    }

    public void onBtnClick(View view) {
        if(edPhrase.getText().toString().trim().length() > 0) {
            if (spCountingOptional.getSelectedItem().toString().trim().equals("Chars")) {
                String phrase = this.edPhrase.getText().toString();
                int charCount = CountingWords.getCharCount(phrase);
                String formattedResult = String.valueOf(charCount);
                this.showCount.setText(formattedResult);
            } else if (spCountingOptional.getSelectedItem().toString().trim().equals("Words")) {
                String phrase = this.edPhrase.getText().toString();
                int wordCount = CountingWords.countWordsUsingSplit(phrase);
                String formattedResult = String.valueOf(wordCount);
                this.showCount.setText(formattedResult);

            }
        }
        else {
            Toast.makeText(this, "You did not enter a word", Toast.LENGTH_SHORT).show();
            return;
        }
    }
}