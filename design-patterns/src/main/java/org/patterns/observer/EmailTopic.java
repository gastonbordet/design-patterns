package org.patterns.observer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EmailTopic implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String message;

    @Override
    public void register(Observer observer) {
        if (observer == null) throw new NullPointerException("Null observer");
        if (!observers.contains(observer)) observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    @Override
    public Object getUpdate(Observer observer) {
        return this.message;
    }

    public void postMessage(String msg) {
        System.out.println(String.format("Message posted to my topic: %s", msg));
        this.message = msg;
        notifyObservers();
    }
}
