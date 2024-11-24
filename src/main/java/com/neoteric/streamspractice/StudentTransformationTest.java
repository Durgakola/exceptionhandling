package com.neoteric.streamspractice;

import java.util.Map;

public class StudentTransformationTest {
    public static void main(String[] args) {
        Map<String,Integer> subjects = Map.of("Telugu",90,
                                              "English", 85,
                                              "Hindi", 86,
                                              "Science", 89,
                                              "Mathematics", 30,
                                              "Social", 90);
        Student1 student1=new Student1("krishna",subjects);

        String finalResult= student1.getSubjects().values()
                .stream()
                .map(marks -> marks <35 ? "Fail" : "Pass")
                .reduce((result1,result2)-> result1.equals("Fail") || result2.equals("Fail") ? "Fail" : "Pass")
                .orElse("Pass");

        StudentResultDto studentResultDto=new StudentResultDto(student1.getName(),finalResult);

        System.out.println(studentResultDto);


    }
}
