package com.example.holdempub;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TradeViewHolder extends RecyclerView.ViewHolder {

    TextView title;
    TextView amount;
    TextView cost;
    TextView ticket;
    public TradeViewHolder(@NonNull View itemView) {
        super(itemView);

        title = itemView.findViewById(R.id.tradeTitle);
        amount = itemView.findViewById(R.id.amount);
        ticket = itemView.findViewById(R.id.ticket);
        cost = itemView.findViewById(R.id.cost);

    }


    public void onBind(Trade data){

        title.setText(data.getTitle());
        ticket.setText(data.getTicketName());
        amount.setText(data.getAmount()+" EA");
        cost.setText(data.getCost()+" 원");

    }
}
