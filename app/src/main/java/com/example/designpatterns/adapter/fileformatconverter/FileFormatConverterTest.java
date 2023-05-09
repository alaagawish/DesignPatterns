package com.example.designpatterns.adapter.fileformatconverter;

public class FileFormatConverterTest {
    public static void main(String[] args) {
        AdapteeFormat adaptee = new AdapteeFormat();
        TargetFormat target = new FormatConverterAdapter(adaptee);

        target.convertFile("fileA");
    }
}
