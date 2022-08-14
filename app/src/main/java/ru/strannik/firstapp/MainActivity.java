package ru.strannik.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        setOnBtnClickListener();

    }

    private void setOnBtnClickListener() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Приветик");


            }
        });
    }

    private void initView(){
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);
    }

    private void setNewText(){
        textView.setText("Good Evening");
    }
}