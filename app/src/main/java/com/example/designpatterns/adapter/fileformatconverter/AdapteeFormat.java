package com.example.designpatterns.adapter.fileformatconverter;

public class AdapteeFormat {
    public void convert(String filename, String fromFormat, String toFormat) {
        System.out.println("Converted file " + filename + " from " + fromFormat + " to " + toFormat);
    }
}
