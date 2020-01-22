package com.example.ex3_034;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Second_page extends AppCompatActivity {
    //ImageView Image;
    private Context mcontext;
    private Resources mResources;
    private RelativeLayout mrl;
    private TextView mtext;
    private ImageView mimage;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        mcontext = getApplicationContext();
        mResources = getResources();
        mrl = findViewById(R.id.rl);
        mimage = findViewById(R.id.imageView2);

        Bundle bundle = getIntent().getExtras();
        String shape = bundle.getString("shape");
        String color = bundle.getString("color");
        String para = bundle.getString("params");
        //Toast.makeText(getApplicationContext(),shape,Toast.LENGTH_LONG).show();

        if(shape.equals("Rectangle") | shape.equals(("Square"))){
        String p[] = para.split(",");
        Integer p1 = Integer.parseInt(p[0]);
        Integer p2 = Integer.parseInt(p[1]);
        Integer p3 = Integer.parseInt(p[2]);
        Integer p4 = Integer.parseInt(p[3]);
        //Image=findViewById(R.id.imageView);
        //Toast.makeText(getApplicationContext(),p1,Toast.LENGTH_LONG).show();
        Bitmap bitmap = Bitmap.createBitmap(1500, 1500, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(Color.LTGRAY);
        Paint paint = new Paint();

        if (color.equals("red") ) {
            paint.setColor(Color.RED);
//white background
            canvas.drawRGB(255, 255, 255);
//border's properties
            // paint.setColor(Color.BLACK);
            //  paint.setStrokeWidth(1);
            //paint.setStyle(Paint.Style.STROKE);
            canvas.drawRect(p1, p2, p3, p4, paint);


            //can.drawText("Rectangle",420,150,paint);
            //canvas.drawRect(p1,p2,p3,p4,paint);
            mimage.setImageBitmap(bitmap);
            // Toast.makeText(getApplicationContext(),"done",Toast.LENGTH_LONG).show();
        } else if (color.equals("blue") ) {

            paint.setColor(Color.BLUE);
//white background
            canvas.drawRGB(255, 255, 255);

            canvas.drawRect(p1, p2, p3, p4, paint);
            mimage.setImageBitmap(bitmap);
        } else if (color.equals("green") ) {
            paint.setColor(Color.GREEN);
//white background
            canvas.drawRGB(255, 255, 255);

            canvas.drawRect(p1, p2, p3, p4, paint);
            mimage.setImageBitmap(bitmap);
        }


        }

        if(shape.equals("Circle")){

            String p[] = para.split(",");
            Integer p1 = Integer.parseInt(p[0]);
            Integer p2 = Integer.parseInt(p[1]);
            Integer p3 = Integer.parseInt(p[2]);
           // Integer p4 = Integer.parseInt(p[3]);
            //Image=findViewById(R.id.imageView);
            //Toast.makeText(getApplicationContext(),p1,Toast.LENGTH_LONG).show();
            Bitmap bitmap = Bitmap.createBitmap(1500, 1500, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap);

            canvas.drawColor(Color.LTGRAY);
            Paint paint = new Paint();
           // canvas.drawText("Circle", 420, 150, paint);
            if (color.equals("red") ) {
                paint.setColor(Color.RED);
//white background
                canvas.drawRGB(255, 255, 255);
//border's properties
                // paint.setColor(Color.BLACK);
                //  paint.setStrokeWidth(1);
                //paint.setStyle(Paint.Style.STROKE);
                canvas.drawCircle(p1, p2, p3, paint);


                //can.drawText("Rectangle",420,150,paint);
                //canvas.drawRect(p1,p2,p3,p4,paint);
                mimage.setImageBitmap(bitmap);
                // Toast.makeText(getApplicationContext(),"done",Toast.LENGTH_LONG).show();
            } else if (color.equals("blue") ) {

                paint.setColor(Color.BLUE);
//white background
                canvas.drawRGB(255, 255, 255);

                canvas.drawCircle(p1, p2, p3, paint);
                mimage.setImageBitmap(bitmap);
            } else if (color.equals("green") ) {
                paint.setColor(Color.GREEN);
//white background
                canvas.drawRGB(255, 255, 255);

                canvas.drawCircle(p1, p2, p3,  paint);
                mimage.setImageBitmap(bitmap);
            }


        }

    }
}