package com.example.multiscreen;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mainscreen2 extends AppCompatActivity {

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainscreen2);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @NonNull
            @Override
            public void onClick(View v){
                openActivity2();

            }
        });
         public void openActivity2(){
            Intent intent=new Intent(this,Activity2.class);
            startActivity(intent);
        }
    }
}