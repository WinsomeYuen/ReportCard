package com.example.android.reportcard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Chemistry extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle(R.string.category_chemistry);
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.chemistry1);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        setContentView(R.layout.grade_list);

        final ArrayList<ReportCard> reports = new ArrayList<ReportCard>();
        reports.add(new ReportCard("Amy","Grade: B"));
        reports.add(new ReportCard("Tanya","Grade: A"));
        reports.add(new ReportCard("Ethan","Grade: B"));
        ReportCardAdapter adapter = new ReportCardAdapter(this, reports);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                ReportCard report = reports.get(position);
            }
        });
    }
}
