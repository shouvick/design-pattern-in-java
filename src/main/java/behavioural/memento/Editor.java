package behavioural.memento;

public class Editor {
    private String content;

    public State createState() {
        return new State(content);
    }

    public void restore(State state) {
        content = state.getContent();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
