package com.example.rodneytressler.week1assessment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private TextView textView;
    private Button buttonSubmit;
    private Button buttonAndroid;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.edit_text);
        textView = findViewById(R.id.text_view);
        buttonSubmit = findViewById(R.id.button_submit);
        onClickListener();
    }
    private void onClickListener() {
        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textInput = new editText().getText().toString();
                textView.setText(textInput);
                editText.setText("");
                Toast.makeText(MainActivity.this, "Android is fun!", Toast.LENGTH_SHORT).show();
            }
        });
        buttonAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,LoveAndroid.class));
            }
        });
    }
}