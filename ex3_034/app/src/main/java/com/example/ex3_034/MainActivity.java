package com.example.ex3_034;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Button b1;
    Spinner s1,s2;
    EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.button);
        s1=findViewById(R.id.shape);
        s2=findViewById(R.id.color);
        text=findViewById(R.id.editText);

        final String shape[]={"Rectangle","Square","Circle"};
        ArrayAdapter  <String> adapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_item,shape);
        s1.setAdapter(adapter);
        final String color[]={"red","blue","green"};
        ArrayAdapter<String> adapter1=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_item,color);
        s2.setAdapter(adapter1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Bundle b=new Bundle();
                b.putString("shape",s1.getSelectedItem().toString());
                b.putString("color",s2.getSelectedItem().toString());
                b.putString("params",text.getText().toString());
                Intent i=new Intent(getApplicationContext(),Second_page.class);
                i.putExtras(b);
                startActivity(i);


            }
        });
    }



}
