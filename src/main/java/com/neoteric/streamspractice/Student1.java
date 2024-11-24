package com.neoteric.streamspractice;

import java.util.Map;

public class Student1 {
    private String name;
    private Map<String,Integer> subjects;

    public Student1(String name, Map<String, Integer> subjects) {
        this.name = name;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public Map<String, Integer> getSubjects() {
        return subjects;
    }
}
