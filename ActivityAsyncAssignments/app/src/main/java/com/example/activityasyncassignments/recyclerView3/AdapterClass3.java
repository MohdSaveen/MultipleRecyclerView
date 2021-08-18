package com.example.activityasyncassignments.recyclerView3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.activityasyncassignments.ModelClass;
import com.example.activityasyncassignments.R;
import com.example.activityasyncassignments.ViewHolder;

import java.util.ArrayList;

public class AdapterClass3 extends RecyclerView.Adapter<ViewHolder3> {
    ArrayList<ModelClass> modelClassArrayList;

    public AdapterClass3(ArrayList<ModelClass> modelClassArrayList) {
        this.modelClassArrayList = modelClassArrayList;
    }
    @NonNull
    @Override
    public ViewHolder3 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout1,parent,false);
        return new ViewHolder3(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder3 holder, int position) {
        ModelClass modelClass=modelClassArrayList.get(position);
        holder.setData(modelClass);
    }

    @Override
    public int getItemCount() {
        return modelClassArrayList.size();
    }
}
