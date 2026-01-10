package com.day1.TabHistoryManager;

public class Driver {
    public static void main(String[] args) {
        BrowserBuddy browser=new BrowserBuddy();

        browser.visitPage("www.google.com");
        browser.visitPage("www.github.com");
        browser.visitPage("www.stackoverflow.com");
        browser.visitPage("www.titfees.com");

        browser.back();
        browser.back();
        browser.forward();

        browser.closeTab();
        browser.restoreTab();
    }
}
