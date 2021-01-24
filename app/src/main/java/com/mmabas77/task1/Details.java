package com.mmabas77.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Details extends AppCompatActivity {
    Intent intent;
    TextView squadname;
    ImageView squadImage;
    String squadNameValue;
    int squadImageValue;
    TextView toolbarTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
         initView();
         getDatatFromOtherActivity();
         serResources();
    }
    /* method for intialize items view by id*/
    private void initView(){
        squadImage = findViewById(R.id.squadImage);
        squadname = findViewById(R.id.squadName);
        toolbarTitle = findViewById(R.id.title);
    }
    /* method to receive data from brivious activity*/
    private void getDatatFromOtherActivity(){
        intent = getIntent();
        squadNameValue = intent.getStringExtra("NAME");
        squadImageValue = intent.getIntExtra("IMAGE",0);

    }
    /* metgod for set value to view in our design */
    private void serResources(){
        squadname.setText(squadNameValue);
        squadImage.setImageResource(squadImageValue);
        toolbarTitle.setText(squadNameValue);
    }
}