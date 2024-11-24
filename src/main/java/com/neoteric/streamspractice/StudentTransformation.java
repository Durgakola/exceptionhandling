package com.neoteric.streamspractice;

import java.util.List;

public class StudentTransformation {
    public static void main(String[] args) {
        List<Subject> subjects= List.of(new Subject("Telugu",90),
                                        new Subject("English",85),
                                         new Subject("Hindi",86),
                                          new Subject("Science",89),
                                           new Subject("Mathematics",30),
                                            new Subject("Social",90));
        Student student=new Student("Ambhika",subjects);
        StudentResultDto studentResultDto = student.getSubjects()
                .stream()
                .map(subject -> subject.getMarks()<35 ? "Fail" : "Pass")
                .reduce((result1,result2) -> result1.equals("Fail")||result2.equals("Fail") ? "Fail" : "Pass")
                .map(result -> new StudentResultDto(student.getName(),result))
                .orElse(new StudentResultDto(student.getName(), "Pass"));
                System.out.println(studentResultDto);
    }
}
