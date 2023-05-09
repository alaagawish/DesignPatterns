package com.example.designpatterns.decorator.textformatting;

public class TextFormattingTest {
    public static void main(String[] args) {
        Text plainText = new PlainText("Hello, world!");
        Text boldText = new BoldText(new PlainText("Hello, world!"));
        Text italicText = new ItalicText(new PlainText("Hello, world!"));
        Text underlineText = new UnderlineText(new PlainText("Hello, world!"));

        plainText.draw();
        boldText.draw();
        italicText.draw();
        underlineText.draw();

//        Text underlineBoldText = new ItalicText(new UnderlineText(new PlainText("Hello, world!")));
//        underlineBoldText.draw();
    }
}
