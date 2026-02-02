package com.DesignPatterns.SmartUniversityLibraryManagementSystem;
import java.util.*;

class NotificationService implements Subject {

    private List<Observer> observers = new ArrayList<>();

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers(String message) {
        for(Observer o : observers) {
            o.update(message);
        }
    }
}
