package com.example.planets_app;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<Planets> planetsArrayList;
    private MyCustomAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listview);

        planetsArrayList=new ArrayList<>();
        Planets planet1 = new Planets ("Mercury","8 Moons", R.drawable.mercury);
        Planets planet2 = new Planets ("Venus","8 Moons", R.drawable.venus);
        Planets planet3 = new Planets ("Earth",  "1 Moon", R.drawable.earth);
        Planets planet4 = new Planets("Mars","2 Moons", R.drawable.mars);
        Planets planet5 =new Planets ( "Jupiter", "79 Moons", R.drawable.jupiter);
        Planets planet6 = new Planets ( "Saturn","83 Moons", R.drawable.saturn);
        Planets planet7 = new Planets ( "Uranus","27 Moons", R.drawable.uranus);
        Planets planet8 = new Planets ( "Neptune", "14 Moons", R.drawable.neptune);
        planetsArrayList.add(planet1);
        planetsArrayList.add(planet2);
        planetsArrayList.add(planet3);
        planetsArrayList.add(planet4);
        planetsArrayList.add(planet5);
        planetsArrayList.add(planet6);
        planetsArrayList.add(planet7);
        planetsArrayList.add(planet8);
        adapter=new MyCustomAdapter(planetsArrayList,getApplicationContext());
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Planet Name "+adapter.getItem(position).getPlanetName(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}