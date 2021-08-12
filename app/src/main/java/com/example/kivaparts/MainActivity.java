package com.example.kivaparts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton myImageButton_liftMotor;
    ImageButton myImageButton_mea;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myImageButton_liftMotor = (ImageButton) findViewById(R.id.imageButton_liftMotor);
        myImageButton_mea = (ImageButton) findViewById(R.id.imageButton_mea);

        myImageButton_liftMotor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(MainActivity.this, lift_motor_Activity.class);
                startActivity(intentLoadNewActivity);
            }
        });

        myImageButton_mea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(MainActivity.this, mea_activity.class);
                startActivity(intentLoadNewActivity);
            }
        });



    }


}