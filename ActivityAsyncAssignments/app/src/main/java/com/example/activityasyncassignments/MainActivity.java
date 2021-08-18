package com.example.activityasyncassignments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.activityasyncassignments.recycler2.AdapterClass2;
import com.example.activityasyncassignments.recycler2.ModelClass2;
import com.example.activityasyncassignments.recyclerView3.AdapterClass3;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

RecyclerView recyclerView1;
    ArrayList<ModelClass> modelClassArrayList=new ArrayList<>();
    RecyclerView recyclerView2;
    ArrayList<ModelClass2> modelClassArrayList2=new ArrayList<>();
    RecyclerView recyclerView3;
    ArrayList<ModelClass> modelClassArrayList3=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView1=findViewById(R.id.recyclerView1);
        recyclerView2=findViewById(R.id.recyclerView2);
        recyclerView3=findViewById(R.id.recyclerView3);
        buildData();
        setRecyclerView();
        buildData2();
        setRecyclerView2();
        buildData3();
        setRecyclerView3();

    }

    private void setRecyclerView3() {
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        AdapterClass3 adapterClass3=new AdapterClass3(modelClassArrayList);
        recyclerView3.setAdapter(adapterClass3);

        recyclerView3.setLayoutManager(linearLayoutManager);

    }

    private void buildData3() {

        for(int i=0;i<4;i++) {
            ModelClass modelClass = new ModelClass(R.drawable.picss);
            modelClassArrayList3.add(modelClass);
            ModelClass modelClass1 = new ModelClass(R.drawable.picsss);
            modelClassArrayList3.add(modelClass1);
            ModelClass modelClass2 = new ModelClass(R.drawable.pic);
            modelClassArrayList3.add(modelClass2);
            ModelClass modelClass3 = new ModelClass(R.drawable.picss);
            modelClassArrayList3.add(modelClass3);
        }

    }

    private void setRecyclerView2() {
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        AdapterClass2 adapterClass2=new AdapterClass2(modelClassArrayList2);
        recyclerView2.setAdapter(adapterClass2);

        recyclerView2.setLayoutManager(linearLayoutManager);
    }

    private void buildData2() {
        for(int i=0;i<4;i++) {
            ModelClass2 modelClass1s= new ModelClass2(R.drawable.pic);
            modelClassArrayList2.add(modelClass1s);
            ModelClass2 modelClass2s = new ModelClass2(R.drawable.pics);
            modelClassArrayList2.add(modelClass2s);
            ModelClass2 modelClass3s = new ModelClass2(R.drawable.picss);
            modelClassArrayList2.add(modelClass3s);
            ModelClass2 modelClass4s = new ModelClass2(R.drawable.picsss);
            modelClassArrayList2.add(modelClass4s);
        }
    }

    private void setRecyclerView() {
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        AdapterClass adapterClass=new AdapterClass(modelClassArrayList);
        recyclerView1.setAdapter(adapterClass);

        recyclerView1.setLayoutManager(linearLayoutManager);

    }
    private void buildData() {
        for(int i=0;i<4;i++) {
            ModelClass modelClass = new ModelClass(R.drawable.pic);
            modelClassArrayList.add(modelClass);
            ModelClass modelClass1 = new ModelClass(R.drawable.pics);
            modelClassArrayList.add(modelClass1);
            ModelClass modelClass2 = new ModelClass(R.drawable.picss);
            modelClassArrayList.add(modelClass2);
            ModelClass modelClass3 = new ModelClass(R.drawable.picsss);
            modelClassArrayList.add(modelClass3);
        }

    }


}