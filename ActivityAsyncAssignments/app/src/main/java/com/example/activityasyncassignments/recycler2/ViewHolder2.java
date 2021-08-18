package com.example.activityasyncassignments.recycler2;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.activityasyncassignments.R;

public class ViewHolder2 extends RecyclerView.ViewHolder {
    private ImageView imageView;
    public ViewHolder2(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View itemView) {
        imageView=itemView.findViewById(R.id.imageView2);
    }
    public void setData(ModelClass2 modelClass2){
        imageView.setImageResource(modelClass2.getImage());
    }
}
