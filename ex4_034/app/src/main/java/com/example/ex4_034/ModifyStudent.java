package com.example.ex4_034;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ModifyStudent extends AppCompatActivity {

    private Model teachersModel;
    private EditText etname, etcourse, etemail, etphone;
    private Button btnupdate, btndelete;
    private Helper databaseHelperStudent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modify_student);

        Intent intent = getIntent();
        teachersModel = (Model) intent.getSerializableExtra("teachers");

        databaseHelperStudent = new Helper(this);

        etname = (EditText) findViewById(R.id.etname);
        etcourse = (EditText) findViewById(R.id.etcourse);
        etemail = (EditText) findViewById(R.id.etemail);
        etphone = (EditText) findViewById(R.id.etphone);
        btndelete = (Button) findViewById(R.id.btndelete);
        btnupdate = (Button) findViewById(R.id.btnupdate);

        etname.setText(teachersModel.getName());
        etcourse.setText(teachersModel.getCourse());
        etemail.setText(teachersModel.getEmail());
        etphone.setText(teachersModel.getPhone());

        btnupdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                databaseHelperStudent.updateStudent(teachersModel.getId(),etname.getText().toString(),etcourse.getText().toString(),etemail.getText().toString(), etphone.getText().toString());
                Toast.makeText(ModifyStudent.this, "Updated Successfully!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(ModifyStudent.this,MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });

        btndelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                databaseHelperStudent.deleteUSer(teachersModel.getId());
                Toast.makeText(ModifyStudent.this, "Deleted Successfully!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(ModifyStudent.this,MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });

    }
}
