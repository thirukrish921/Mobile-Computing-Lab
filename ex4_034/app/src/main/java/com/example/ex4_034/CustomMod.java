package com.example.ex4_034;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class CustomMod extends BaseAdapter {

    private Context context;
    private ArrayList<Model> StudentModelArrayList;

    public CustomMod(Context context, ArrayList<Model> StudentModelArrayList) {

        this.context = context;
        this.StudentModelArrayList = StudentModelArrayList;
    }


    @Override
    public int getCount() {
        return StudentModelArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return StudentModelArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.model_student_mod, null, true);

            holder.tvname = (TextView) convertView.findViewById(R.id.student_name);
            holder.tvcourse = (TextView) convertView.findViewById(R.id.student_course);
            holder.tvemail = (TextView) convertView.findViewById(R.id.student_email);
            holder.tvphone = (TextView) convertView.findViewById(R.id.student_phone);

            convertView.setTag(holder);
        }else {
            // the getTag returns the viewHolder object set as a tag to the view
            holder = (ViewHolder)convertView.getTag();
        }

        holder.tvname.setText("Name: "+StudentModelArrayList.get(position).getName());
        holder.tvcourse.setText("Course: "+StudentModelArrayList.get(position).getCourse());
        holder.tvemail.setText("Email: "+StudentModelArrayList.get(position).getEmail());
        holder.tvphone.setText("Phone: "+StudentModelArrayList.get(position).getPhone());

        return convertView;
    }

    private class ViewHolder {

        protected TextView tvname, tvcourse, tvemail, tvphone;
    }}

