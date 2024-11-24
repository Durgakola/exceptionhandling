package com.neoteric.streamspractice;

public class StudentResultDto {
    private String name;
    private String result;

    public StudentResultDto(String name, String result) {
        this.name = name;
        this.result = result;
    }

    @Override
    public String toString() {
        return "StudentResultDto{" +
                "name='" + name + '\'' +
                ", result='" + result + '\'' +
                '}';
    }
}
