package com.example.activityasyncassignments.recyclerView3;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.activityasyncassignments.ModelClass;
import com.example.activityasyncassignments.R;

public class ViewHolder3 extends RecyclerView.ViewHolder {
    private ImageView imageView;
    public ViewHolder3(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);
    }
    private void initViews(View itemView) {
        imageView=itemView.findViewById(R.id.imageView1);
    }
    public void setData(ModelClass modelClass){
        imageView.setImageResource(modelClass.getImage());
    }
}
