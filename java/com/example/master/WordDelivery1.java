package com.example.master;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class WordDelivery1 extends AppCompatActivity {

    ImageButton btn_Back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_delivery1);

        btn_Back = (ImageButton) findViewById(R.id.btnBack);

        btn_Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goBack();
//                Toast.makeText(WordDelivery1.this,"balik",Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void goBack(){
        Intent intent = new Intent(this, Page2.class);
        startActivity(intent);
    }
}