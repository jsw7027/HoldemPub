package com.example.holdempub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

public class PubActivity extends AppCompatActivity {

    RecyclerView pubRc;
    HoldemRecyclerAdapter adapter;
    TextView count2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pub);

        init();
        getData();
        count2 = findViewById(R.id.count2);
        count2.setText(adapter.getItemCount()+"개의 결과: ");

    }


    public void init(){

        pubRc = findViewById(R.id.pubRc);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        pubRc.setLayoutManager(linearLayoutManager);

        adapter = new HoldemRecyclerAdapter();
        pubRc.setAdapter(adapter);

    }


    public void getData(){
        HoldemPub h1 = new HoldemPub(R.drawable.apl, "Final Nine", "1900",
                "강남", "1 데일리, 3장 몬스터, 1.5천장 게임");
        HoldemPub h2 = new HoldemPub(R.drawable.apl, "Final Nine", "1900",
                "홍대", "1장 데일리, 3장 몬스터, 1.5장 게임");
        HoldemPub h3 = new HoldemPub(R.drawable.apl, "Battle Play Pub", "1900",
                "홍대", "1장 데일리");
        HoldemPub h4 = new HoldemPub(R.drawable.apl, "레인보우", "1900",
                "강남", "10장 메인 하이롤러, 20장 사이");

        adapter.addItem(h1);
        adapter.addItem(h2);
        adapter.addItem(h3);
        adapter.addItem(h4);


    }
}