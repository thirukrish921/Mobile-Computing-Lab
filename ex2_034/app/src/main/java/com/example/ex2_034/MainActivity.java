package com.example.ex2_034;
import android.graphics.Color;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    String [] listitem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button a=findViewById(R.id.button_red);
        final Button b=findViewById(R.id.button_blue);
        final Button c=findViewById(R.id.button_green);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int red = Color.parseColor("#ff0000");
                a.setTextColor(red);
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int blue=Color.parseColor("#0000ff");
                b.setTextColor(blue);

                ;            }
        });
        c.setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View view) {
                                     int green=Color.parseColor("#008000");
                                     c.setTextColor(green);

                                 }
                             }
        );
        final Spinner sp=findViewById(R.id.spinner5);
        final ListView lv=findViewById(R.id.lsv);
        listitem=getResources().getStringArray(R.array.list_item);
        ArrayAdapter adapter=new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,listitem);
        lv.setAdapter(adapter);
        sp.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int x=i;
                if(x==0){
                    Toast.makeText(MainActivity.this,"Red",Toast.LENGTH_SHORT).show();
                }
                else if(x==1){
                    Toast.makeText(MainActivity.this,"green",Toast.LENGTH_SHORT).show();

                }
                else{
                    Toast.makeText(MainActivity.this,"Blue",Toast.LENGTH_SHORT).show();
                }
            }
        });
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){
                    Toast.makeText(MainActivity.this,"Red",Toast.LENGTH_SHORT).show();
                }
                else if(i==1){
                    Toast.makeText(MainActivity.this,"green",Toast.LENGTH_SHORT).show();

                }
                else{
                    Toast.makeText(MainActivity.this,"Blue",Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }


}
