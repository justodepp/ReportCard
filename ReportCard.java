package com.android.reportcard;

import java.util.ArrayList;

public class ReportCard {

    private String studentName;
    private int vote;
    private int year;
    private String sectionClass;
    private ArrayList<Integer> boardVote;

    public ReportCard(String sn, int year, String sectionClass) {
        studentName = sn;
        year = year;
        sectionClass = sectionClass;
        boardVote = new ArrayList<Integer>();
    }

    public void setVote(int vote) {
        boardVote.add(vote);
    }

    public double getAverage() {
        double avg = 0;
        for (int g : boardVote) {
            avg += g;
        }
        avg = avg / boardVote.size();
        return avg;
    }

    public int getYear() {
        return year;
    }

    public String getStudentName() {
        return studentName;
    }

    @Override
    public String toString() {
        return "ReportCard{" +
                "year=" + getYear() +
                ", studentName='" + getStudentName() + '\'' +
                ", average='" + getAverage() + '\'' +
                '}';
    }
}