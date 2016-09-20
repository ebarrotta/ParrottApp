package com.studyjam.android.wtm.parrottapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    private EditText inputText;
    private TextView outputText;

    public void buttonOnClick(View v) {

        Button b = (Button) v;

        inputText = (EditText) findViewById(R.id.input_edit_text);
        outputText = (TextView) findViewById(R.id.output_text_view);
        outputText.append(inputText.getText());
    }

    public void buttonReset(View v) {

        Button b = (Button) v;
        outputText.setText("Parrot says... ");
    }
}
