package com.example.ex4_034;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button addStud;
    Button modStud;

    private ListView listView;
    private ArrayList<Model> StudentModelArrayList;
    private CustomAdapter customAdapter;
    private Helper databaseHelperTeacher;

    public  void addTeachersActivity(){
        addStud= (Button)findViewById(R.id.btn_add_student);
        addStud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent addTeachersr = new Intent(MainActivity.this, AddCourse.class);
                startActivity(addTeachersr);

            }
        });
    }

    public  void modTeachersActivity(){
        modStud= (Button)findViewById(R.id.btn_student_modify);
        modStud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent modTeachersr = new Intent(MainActivity.this, ModStudent.class);
                startActivity(modTeachersr);

            }
        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addTeachersActivity();
        modTeachersActivity();

        listView = (ListView) findViewById(R.id.student_lv);

        databaseHelperTeacher = new Helper(this);

        StudentModelArrayList = databaseHelperTeacher.getAllStudent();

        customAdapter = new CustomAdapter(this,StudentModelArrayList);
        listView.setAdapter(customAdapter);
    }
}
