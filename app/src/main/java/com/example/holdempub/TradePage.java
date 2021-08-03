package com.example.holdempub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class TradePage extends AppCompatActivity {


    RecyclerView tradeRc;
    TradeRecyclerAdapter tradeAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trade_page);

        init();
        initDB();


    }

    void init(){
        tradeRc = findViewById(R.id.tradeRc);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        tradeRc.setLayoutManager(linearLayoutManager);
        tradeAdapter = new TradeRecyclerAdapter();

        tradeRc.setAdapter(tradeAdapter);
    }


    public void initDB(){
        Trade trade1 = new Trade("jsw7027", "KSOP 팔아요", "KSOP", 100000, 1, "직거래");
        Trade trade2 = new Trade("jsw7027", "BPP 팔아요", "BPP", 120000, 1, "직거래");
        Trade trade3 = new Trade("jsw7027", "HPL 팔아요", "HPL", 80000, 1, "직거래");
        Trade trade4 = new Trade("jsw7027", "APL 팔아요", "APL", 90000, 1, "직거래");

        tradeAdapter.addItem(trade1);
        tradeAdapter.addItem(trade2);
        tradeAdapter.addItem(trade3);
        tradeAdapter.addItem(trade4);
    }
}