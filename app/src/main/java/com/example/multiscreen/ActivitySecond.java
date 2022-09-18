package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivitySecond extends AppCompatActivity {

    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), "shnathan", Toast.LENGTH_SHORT).show();

                open2();
            }
        });
    }
    public void open2(){
//        Intent intent = new Intent(this,MainActivity.class);
//        startActivity(intent);
        Intent returnIntent = new Intent();
        returnIntent.putExtra(MainActivity.RESULT_KEY, "Second Screen Value = " + System.currentTimeMillis());
        setResult(Activity.RESULT_OK, returnIntent);
        finish();
    }


}
