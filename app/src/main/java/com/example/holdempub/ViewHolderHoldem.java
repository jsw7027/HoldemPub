package com.example.holdempub;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class ViewHolderHoldem extends RecyclerView.ViewHolder {

    ImageView sImage;
    TextView sName;
    TextView sPlace;
    TextView open;
    TextView game;
    public ViewHolderHoldem(@NonNull View itemView) {
        super(itemView);

        sImage = itemView.findViewById(R.id.sImage);
        sName = itemView.findViewById(R.id.sName);
        sPlace = itemView.findViewById(R.id.sPlace);
        open = itemView.findViewById(R.id.open);
        game = itemView.findViewById(R.id.game);


    }

    public void onBind(HoldemPub data){
        sImage.setImageResource(data.getImage());
        sName.setText(data.getName());
        sPlace.setText(data.getPlace());
        open.setText(data.getOpen());
        game.setText(data.getGame());
    }
}
