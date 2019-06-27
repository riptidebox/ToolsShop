package com.omelchenkoaleks.toolsshop;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class DrillCategoryActivity extends AppCompatActivity {
    private ListView mDrillsListView;

    private ArrayList<Drill> mDrills;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drill_category);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        mDrills = new ArrayList<>();
        mDrills.add(new Drill(getString(R.string.drill_interskol_title),
                getString(R.string.drill_iterskol_info), R.drawable.interskol));
        mDrills.add(new Drill(getString(R.string.drill_makita_title),
                getString(R.string.drill_makita_info), R.drawable.makita));
        mDrills.add(new Drill(getString(R.string.drill_dewalt_title),
                getString(R.string.drill_dewalt_info), R.drawable.dewalt));

        ArrayAdapter<Drill> adapter = new ArrayAdapter<>(getApplicationContext(),
                android.R.layout.simple_list_item_1, mDrills);

        mDrillsListView = findViewById(R.id.drills_list_view);
        mDrillsListView.setAdapter(adapter);

        mDrillsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }
}
