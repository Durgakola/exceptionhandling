package com.neoteric.websitedemo;

public abstract class AngularWebsite implements Website {
//implements the website thire is no error because class is abstart .abstart is the abstarct methods and concrete methods.


    @Override
    public String header(){
        return "header";
    }

    @Override
    public String footer(){
        return "footer";
    }

    @Override
    public abstract String body() ;


    public String page(){
        StringBuilder builder =new StringBuilder();
        builder.append(header());
        builder.append( body());
        builder.append(footer());
        return builder.toString();

    }

}
