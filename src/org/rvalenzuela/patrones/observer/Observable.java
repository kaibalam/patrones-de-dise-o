package org.rvalenzuela.patrones.observer;

import java.util.ArrayList;
import java.util.List;

abstract public class Observable {
    protected List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observador){
        observers.add(observador);
    }

    public void remove(Observer observador){
    observers.remove(observador);
    }

    public void notifyObservers(){
        notifyObservers(null);
    }
    public void notifyObservers(Object obj){
        for (Observer obs: this.observers){
            obs.update(this, obj);
        }
    }
}
