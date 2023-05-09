package com.example.designpatterns.decorator.textformatting;

public class UnderlineText implements Text {
    private Text text;

    public UnderlineText(Text text) {
        this.text = text;
    }

    public void draw() {
        String underlineContent = "\033[4m" + text + "\033[0m";
        System.out.println(underlineContent);
    }
}
