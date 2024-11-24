package com.neoteric.flatmap;

import java.util.ArrayList;
import java.util.List;

public class Subject implements Comparable<Subject>{
    private String name;
    private int marks;

    private List<Subject> subjectList = new ArrayList<>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

  public void add(Subject subject){
        this.subjectList.add(subject);
  }

    public List<Subject> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(List<Subject> subjectList) {
        this.subjectList = subjectList;
    }


    @Override
    public int compareTo(Subject o) {
        return 0;
    }
}
