package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {
    private static final String TASK_TAB = "task_tab";
    private TabHost mTabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTabHost = (TabHost) findViewById(android.R.id.tabhost);
        mTabHost.setup();

        TabHost.TabSpec mSpec = mTabHost.newTabSpec(TASK_TAB);
        mSpec.setContent(R.id.tab1);
        mSpec.setIndicator("Tab1");
        mTabHost.addTab(mSpec);
    }
}
