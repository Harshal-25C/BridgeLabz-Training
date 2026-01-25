package com.day2.MessagingPatternAnalyzer;

public interface MessageFilter<T> {
    boolean allow(T message);
}
