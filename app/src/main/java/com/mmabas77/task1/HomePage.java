package com.mmabas77.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class HomePage extends AppCompatActivity {
    ListView squadsListView;
    ArrayList<Model>modelArrayList;
    ModelAdapter squadModelAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

      initView();
      setSquadModelAdapter();


    }
    /* method for intialize items view by id*/
    private void initView(){
        squadsListView = findViewById(R.id.list);
    }
    /* method to fill the list with data */
    private void loadData(){
        modelArrayList = new ArrayList<>();
        modelArrayList.add(new Model(R.drawable.download,"ANDROID SQUAD"));
        modelArrayList.add(new Model(R.drawable.download1,"DATA SCIENCE SQUAD"));
    }
    /* method to set list of data to Custom adapter*/
    private void setSquadModelAdapter(){
        loadData();
        squadModelAdapter = new ModelAdapter(HomePage.this,modelArrayList);
        squadsListView.setAdapter(squadModelAdapter);
    }
}