package com.example.designpatterns.adapter.fileformatconverter;

public class FormatConverterAdapter implements TargetFormat {
    private AdapteeFormat adaptee;

    public FormatConverterAdapter(AdapteeFormat adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void convertFile(String filename) {
        String fromFormat = "formatA";
        String toFormat = "formatB";
        this.adaptee.convert(filename, fromFormat, toFormat);
    }
}
