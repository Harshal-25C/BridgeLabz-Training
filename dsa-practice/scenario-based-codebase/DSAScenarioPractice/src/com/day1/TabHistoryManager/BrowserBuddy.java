package com.day1.TabHistoryManager;

import java.util.*;

public class BrowserBuddy{
    private Tab activeTab;
    private Stack<Tab> closedTabs;

    public BrowserBuddy() {
        activeTab = new Tab();
        closedTabs = new Stack<>();
    }

    public void visitPage(String url) {
        activeTab.visit(url);
    }

    public void back() {
        activeTab.back();
    }

    public void forward() {
        activeTab.forward();
    }

    public void closeTab() {
        closedTabs.push(activeTab);
        activeTab = new Tab();
        System.out.println("Tab closed");
    }

    public void restoreTab() {
        if(!closedTabs.isEmpty()) {
            activeTab = closedTabs.pop();
            System.out.println("Tab restored. Current page: " + activeTab.getCurrentPage());
        }else{
            System.out.println("No tabs to restore");
        }
    }
}
