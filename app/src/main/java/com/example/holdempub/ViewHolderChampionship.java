package com.example.holdempub;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolderChampionship extends RecyclerView.ViewHolder {

    ImageView poster;
    TextView name;
    TextView place;
    TextView time;
    TextView buyin;


    public ViewHolderChampionship(@NonNull View itemView) {
        super(itemView);

        poster = itemView.findViewById(R.id.poster);
        name = itemView.findViewById(R.id.name);
        time = itemView.findViewById(R.id.time);
        place = itemView.findViewById(R.id.place);
        buyin = itemView.findViewById(R.id.buyin);
    }


    public void onBind(Championship data){
        name.setText(data.getName());
        place.setText("위치: " +data.getPlace());
        buyin.setText("바인: " + data.getBuyin());
        time.setText("시간: " + data.getTime());
        poster.setImageResource(data.getPoster());
    }
}
