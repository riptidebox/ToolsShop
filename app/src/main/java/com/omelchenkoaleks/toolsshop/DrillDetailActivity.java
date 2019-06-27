package com.omelchenkoaleks.toolsshop;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class DrillDetailActivity extends AppCompatActivity {
    private ImageView mDrillImageView;
    private TextView mTitleTextView;
    private TextView mInfoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drill_detail);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        mDrillImageView = findViewById(R.id.drill_image_view);
        mTitleTextView = findViewById(R.id.title_text_vew);
        mInfoTextView = findViewById(R.id.info_text_view);

        Intent intent = getIntent();
        if (intent.hasExtra("title")
                && intent.hasExtra("info")
                && intent.hasExtra("imageId")) {
            String title = intent.getStringExtra("title");
            String info = intent.getStringExtra("info");
            int imageId = intent.getIntExtra("imageId", -1);

            mTitleTextView.setText(title);
            mInfoTextView.setText(info);
            mDrillImageView.setImageResource(imageId);
        } else {
            Intent backToCategory = new Intent(this, DrillCategoryActivity.class);
            startActivity(backToCategory);
        }
    }
}
