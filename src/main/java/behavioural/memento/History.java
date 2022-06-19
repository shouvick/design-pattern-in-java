package behavioural.memento;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<State> states = new ArrayList<>();

    public void push(State state) {
        states.add(state);
    }

    public State pop() {
        var lastIndex = states.size() - 1;
        var lastState = states.get(lastIndex);
        states.remove(lastState);
        return lastState;
    }
}
