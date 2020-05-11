package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void moveToButtonSelect(View v)
    {

        EditText input_name = (EditText) findViewById((R.id.enter_name));

        if(input_name.getText().toString().equals("")){
            Toast.makeText(getApplicationContext(),"이름을 입력하세요",Toast.LENGTH_LONG).show();
        }
        else{
            Intent intent = new Intent(this, ButtonSelect.class);
            startActivity(intent);
        }
    }


}
