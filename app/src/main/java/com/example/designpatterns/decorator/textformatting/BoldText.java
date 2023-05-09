package com.example.designpatterns.decorator.textformatting;

public class BoldText implements Text {
    private Text text;

    public BoldText(Text text) {
        this.text = text;
    }

    public void draw() {
        String boldContent = "\033[1m" + text + "\033[0m";
        System.out.println(boldContent);
    }
}
