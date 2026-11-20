public class Node {
    private Hrac hrac;
    private Node next;
    private Node previous;

    public Node(Hrac hrac) {
        this.hrac = hrac;
        this.next = null;
        this.previous = null;
    }

    public Hrac getHrac() {
        return hrac;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setHrac(Hrac hrac) {
        this.hrac = hrac;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }
}
