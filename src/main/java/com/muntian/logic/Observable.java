package com.muntian.logic;

import java.util.List;

public interface Observable {
	void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers(List<Observer> observers);
}
