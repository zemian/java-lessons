package eventlistener;

import java.util.ArrayList;
import java.util.List;

public class Event {
    List<String> args = new ArrayList<>();

    public Event() {
    }

    public Event(List<String> args) {
        this.args = args;
    }

    public void setArgs(List<String> args) {
        this.args = args;
    }
}
