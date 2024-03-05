package com.sapir.namesfinder.namesfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.sapir.namesfinder.R;

public class ActivityByCategory extends AppCompatActivity {
    private Button BycategoryButtonBack;
    private TextView BycategoryLBL ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_by_category);
        findViews();
        initViews();
    }


    private void findViews() {
        BycategoryButtonBack =findViewById(R.id.BycategoryButtonBack);
        BycategoryLBL =findViewById(R.id.BycategoryLBL);


    }

    private void initViews() {
        BycategoryButtonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();

            }
        });
    }
}