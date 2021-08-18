package com.example.activityasyncassignments.recycler2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.activityasyncassignments.R;

import java.util.ArrayList;

public class AdapterClass2 extends RecyclerView.Adapter<ViewHolder2> {

    ArrayList<ModelClass2> modelClassArrayList2;

    public AdapterClass2(ArrayList<ModelClass2> modelClassArrayList2) {
        this.modelClassArrayList2 = modelClassArrayList2;
    }

    @NonNull
    @Override
    public ViewHolder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout2,parent,false);
        return new ViewHolder2(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder2 holder, int position) {
        ModelClass2 modelClass2=modelClassArrayList2.get(position);
        holder.setData(modelClass2);
    }

    @Override
    public int getItemCount() {
        return modelClassArrayList2.size();
    }
}
