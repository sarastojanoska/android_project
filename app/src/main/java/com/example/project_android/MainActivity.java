package com.example.project_android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Mountain_peak> Mountains;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();

        Mountains=new ArrayList<>();
        Mountains.add(new Mountain_peak("Chamonix(2504m)","Alpes,France",getResources().getStringArray(R.array.description)[0],R.drawable.ski_chamonix_2,R.drawable.ski_chamonix));
        Mountains.add(new Mountain_peak("Cortina d'Ampezzo(2924m)","Dolomiti,Italy",getResources().getStringArray(R.array.description)[1],R.drawable.cortina,R.drawable.cortina_travel));
        Mountains.add(new Mountain_peak("Passo Groste(2504m)","Dolomiti,Italy",getResources().getStringArray(R.array.description)[2],R.drawable.madonna_ski,R.drawable.madonna_di_campiglio));
        Mountains.add(new Mountain_peak("Punta Rocca(3265m)","Dolomiti,Italy",getResources().getStringArray(R.array.description)[3],R.drawable.ski_marmolada,R.drawable.glacier));
        Mountains.add(new Mountain_peak("Solden(3340m)","Tyrol,Austria",getResources().getStringArray(R.array.description)[4],R.drawable.ski_solden,R.drawable.resort_solden));
        Mountains.add(new Mountain_peak("Kitzbuhel(2096m)","Tyrol,Austria",getResources().getStringArray(R.array.description)[5],R.drawable.ski_kitzbuhel,R.drawable.kitzbuehel_winternacht));

        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,Mountains);
        myrv.setLayoutManager(new GridLayoutManager(this,2));
        myrv.setAdapter(myAdapter);
    }
}
