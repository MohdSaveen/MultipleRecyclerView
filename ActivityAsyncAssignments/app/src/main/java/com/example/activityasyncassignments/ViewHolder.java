package com.example.activityasyncassignments;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
   private ImageView imageView;
    public ViewHolder(@NonNull View itemView) {
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
