package com.example.findinghotel;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.lights.LightState;
import android.os.Bundle;
import android.widget.ListView;

public class PureveglistActivity extends AppCompatActivity {
    ListView list;
    String [] mess={
            "ATITHI HOTEL",
            "HOTEL AAiSAHEB",
            "JYOTI'S KITCHEN",
            "AUNTY'S KITCHEN",
            "PRATIBHA MESS",
            "SHIVSHAKTI DINING HALL",
            "TARAMMA BHOJANALAYA",
            "RAMDEV DINING HALL"
    };
    Integer [] imageId={
            R.drawable.photo1,
            R.drawable.photo2,
            R.drawable.photo3,
            R.drawable.photo4,
            R.drawable.photo5,
            R.drawable.photo6,
            R.drawable.photo7,
            R.drawable.photo8,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pureveglist);
        CustomList adapter=new CustomList(PureveglistActivity.this,mess,imageId);
        list=findViewById(R.id.purevegmess);
        list.setAdapter(adapter);
    }
}