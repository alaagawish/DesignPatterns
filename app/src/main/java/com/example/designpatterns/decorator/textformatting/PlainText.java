package com.example.designpatterns.decorator.textformatting;

public class PlainText implements Text {
    private String content;

    public PlainText(String content) {
        this.content = content;
    }

    public void draw() {

        System.out.println(content);
    }

}
