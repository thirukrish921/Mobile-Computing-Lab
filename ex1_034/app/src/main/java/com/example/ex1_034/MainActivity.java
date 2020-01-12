package com.example.ex1_034;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity {
    private Button b1,b2;

    private TextView text;
  //  Button b2=findViewById(R.id.color_btn);
    //TextView text=findViewById(R.id.textView2);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button) findViewById(R.id.size_btn);
        b2=(Button)findViewById(R.id.color_btn);
        text=findViewById(R.id.textView2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getApplicationContext(),String.valueOf(text.getTextSize()), LENGTH_SHORT).show();
               if(text.getTextSize()>39){
                   text.setTextSize(TypedValue.COMPLEX_UNIT_SP,14f);


               }
               else{
                   text.setTextSize(TypedValue.COMPLEX_UNIT_SP,20f);

               }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int red= Color.parseColor("#ff0000");
                int blue=Color.parseColor("#0000ff");
                if(text.getCurrentTextColor()==red){
                    text.setTextColor(blue);
                }
                else{
                    text.setTextColor(red);
                }



            }
        });
    }

}
