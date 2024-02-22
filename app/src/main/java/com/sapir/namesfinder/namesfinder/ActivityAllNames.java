package com.sapir.namesfinder.namesfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.sapir.namesfinder.R;

import org.w3c.dom.Text;

public class ActivityAllNames extends AppCompatActivity {
    private Button allNamesButtonBack;
    private TextView allNamesLBL ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_names);
        findViews();
        initViews();
    }


    private void findViews() {
        allNamesButtonBack =findViewById(R.id.allNamesButtonBack);
        allNamesLBL =findViewById(R.id.allNamesLBL);


    }

    private void initViews() {
        allNamesButtonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();

            }
        });
    }
}