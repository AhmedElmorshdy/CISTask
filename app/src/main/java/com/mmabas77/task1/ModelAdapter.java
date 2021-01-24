package com.mmabas77.task1;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;

import java.util.List;

public class ModelAdapter extends ArrayAdapter<Model> {
    TextView squadNme;
    ImageView squadImage;
    CardView itemCard;

    public ModelAdapter(@NonNull Context context, @NonNull List<Model> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.squads,parent,false);
        final Model model = getItem(position);
         initView(convertView);
         bindingData(model);
         onClickItem(Details.class,model);
        return convertView;
    }

    /* method for intialize items view by id*/
    private void initView(View convertView){
        squadNme  =  convertView.findViewById(R.id.text);
        squadImage= convertView.findViewById(R.id.profile_image);
        itemCard = convertView.findViewById(R.id.cards);
    }
    /* method for binding data with model*/
    private void bindingData(Model model){
        squadNme.setText(model.getSquadName());
        squadImage.setImageResource(model.getImage());
    }
    /* method for listview items listener*/
    private void onClickItem(final Class direction, final Model model){
        itemCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),direction);
                intent.putExtra("NAME",model.getSquadName());
                intent.putExtra("IMAGE",model.getImage());
                getContext().startActivity(intent);
            }
        });
    }
}
