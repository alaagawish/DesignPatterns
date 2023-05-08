package com.example.designpatterns.iterator.social.network.profiles;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}