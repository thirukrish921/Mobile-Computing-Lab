package com.example.ex4_034;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import static com.example.ex4_034.Helper.*;

public class ModStudent extends AppCompatActivity {

    private ListView listView;
    private ArrayList<Model> StudentModelArrayList;
    private CustomMod customMod;
    private Helper databaseHelperStudent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mod);

        listView = (ListView) findViewById(R.id.student_lvi);

        databaseHelperStudent = new Helper(this);

        StudentModelArrayList = databaseHelperStudent.getAllStudent();

        customMod = new CustomMod(this,StudentModelArrayList);
        listView.setAdapter(customMod);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(ModStudent.this,ModifyStudent.class);
                intent.putExtra("teachers",StudentModelArrayList.get(position));
                startActivity(intent);
            }
        });
    }
}
