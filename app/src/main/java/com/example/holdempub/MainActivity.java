package com.example.holdempub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    CRecyclerAdapter adapter;
    TextView count;
    Button goToPub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        getData();
        count.setText(adapter.getItemCount()+"개의 결과: ");

        goToPub = findViewById(R.id.goToPub);

    }


    public void init(){

        count = findViewById(R.id.count);

        RecyclerView recyclerView = findViewById(R.id.rcView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);



        adapter = new CRecyclerAdapter();
        recyclerView.setAdapter(adapter);

    }


    public void getData(){

        Championship apl = new Championship(R.drawable.apl,"APL",
                "Seoul", "3 Ticket", "1400 start");

        Championship bpp = new Championship(R.drawable.bpp,"B.P.P",
                "Seoul", "2 Ticket", "1400 start");

        Championship ksop = new Championship(R.drawable.ksop,"KSOP",
                "Seoul", "2 Ticket", "1400 start");
        Championship hpl = new Championship(R.drawable.hpl,"HPL",
                "양양 쏠비", "2 Ticket", "1400 start");

        Championship apl2 = new Championship(R.drawable.apl,"APL",
                "Seoul", "3 Ticket", "1400 start");

        Championship bpp2 = new Championship(R.drawable.bpp,"B.P.P",
                "Seoul", "2 Ticket", "1400 start");

        Championship ksop2 = new Championship(R.drawable.ksop,"KSOP",
                "Seoul", "2 Ticket", "1400 start");

        adapter.addItem(apl);
        adapter.addItem(bpp);
        adapter.addItem(ksop);
        adapter.addItem(hpl);
        adapter.addItem(apl2);
        adapter.addItem(bpp2);
        adapter.addItem(ksop2);


    }

    public void goToPub(View view) {

        Intent intent1 = new Intent(getApplicationContext(), PubActivity.class);
        startActivity(intent1);
    }
}