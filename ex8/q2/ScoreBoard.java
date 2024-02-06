import java.util.ArrayList;
import java.util.List;


public class ScoreBoard {
    private List<Observer> observers = new ArrayList<>();

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers(String result) {
        for (Observer observer : observers) {
            observer.update(result);
        }
    }
}
