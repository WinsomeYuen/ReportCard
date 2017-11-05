package com.example.android.reportcard;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ReportCardAdapter extends ArrayAdapter<ReportCard>{
    private static final String LOG_TAG = ReportCardAdapter.class.getSimpleName();

    public ReportCardAdapter(Activity context, ArrayList<ReportCard> report) {
        super(context, 0, report);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        ReportCard currentReport = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);
        nameTextView.setText(currentReport.getName());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView gradeTextView = (TextView) listItemView.findViewById(R.id.grade_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        gradeTextView.setText(currentReport.getGrade());

        return listItemView;
    }
}
