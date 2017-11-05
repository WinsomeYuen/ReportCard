package com.example.android.reportcard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.icon);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the chemistry category
        TextView chemistry = (TextView) findViewById(R.id.chemistry);
        chemistry.setCompoundDrawablesWithIntrinsicBounds(R.drawable.chemistry2, 0, 0, 0);
        chemistry.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent chemistryIntent = new Intent(MainActivity.this, Chemistry.class);
                startActivity(chemistryIntent);
            }
        });

        // Find the View that shows the maths category
        TextView maths = (TextView) findViewById(R.id.maths);
        maths.setCompoundDrawablesWithIntrinsicBounds(R.drawable.maths2, 0, 0, 0);
        maths.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent mathsIntent = new Intent(MainActivity.this, Maths.class);
                startActivity(mathsIntent);
            }
        });

        // Find the View that shows the english category
        TextView english = (TextView) findViewById(R.id.english);
        english.setCompoundDrawablesWithIntrinsicBounds(R.drawable.english2, 0, 0, 0);
        english.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent englishIntent = new Intent(MainActivity.this, English.class);
                startActivity(englishIntent);
            }
        });

        // Find the View that shows the art category
        TextView art = (TextView) findViewById(R.id.art);
        art.setCompoundDrawablesWithIntrinsicBounds(R.drawable.art2, 0, 0, 0);
        art.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent artIntent = new Intent(MainActivity.this, Art.class);
                startActivity(artIntent);
            }
        });

    }

}
