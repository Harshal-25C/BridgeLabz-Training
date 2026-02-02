package com.DesignPatterns.SmartUniversityLibraryManagementSystem;

interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers(String message);
}
