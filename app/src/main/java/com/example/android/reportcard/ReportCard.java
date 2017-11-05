package com.example.android.reportcard;

public class ReportCard {
    private String name;
    private String grade;

    public ReportCard(String n, String g){
        name = n;
        grade = g;
    }

    public String getName(){return name;}

    public String getGrade(){return grade;}
}
