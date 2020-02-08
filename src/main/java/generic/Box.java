package generic;

public class Box<Typ> {
    private Typ content;

    public Box(Typ content) {
        this.content = content;
    }

    public Typ getContent() {
        return content;
    }
}
