package com.example.designpatterns.decorator.textformatting;

public class ItalicText implements Text {
    private Text text;

    public ItalicText(Text text) {
        this.text = text;
    }

    public void draw() {
        text.draw();
        String italicContent = "\033[3m" + text + "\033[0m";
        System.out.println(italicContent);
    }
}
