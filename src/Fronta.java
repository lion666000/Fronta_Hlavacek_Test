import java.security.PrivateKey;

public class Fronta {
    private Node front = null;
    private Node rear = null;
    private int size = 0;


    public void add(Hrac hrac) {
        Node node = new Node(hrac);
        if (front == null) {
            front = node;
            rear = node;
        } else {
            rear.setNext(node);
            node.setPrevious(rear);
            rear = node;
        }
        size++;
    }

    public void removeNext() {
        if (front != null) {
            front = front.getNext();
        }
        else{
            System.out.println("Fronta je prázdná");
        }

    }


    public void printAll() {
        if (front != null) {
            Node current = front;
            while (current != null) {
                System.out.println(current.getHrac());
                current = current.getNext();
            }
        }
        else{
            System.out.println("Fronta je prázdná");
        }


    }

    public void printNext() {
        if (front != null) {
            System.out.println(front.getHrac());
        }
        else{
            System.out.println("Fronta je prázdná");
        }
    }

    public void printAboveMMR(int mmr) {
        if (front != null) {
            Node current = front;
            int amount = 0;
            while (current != null) {
                if (current.getHrac().getSkill() > mmr){
                    System.out.println(current.getHrac());
                    amount++;
                }
                current = current.getNext();
            }
            if (amount == 0) {
                System.out.println("Nenalezen");
            }
        }
        else{
            System.out.println("Fronta je prázdná");
        }


    }

    public void printByName(String name) {
        if (front != null) {
            Node current = front;
            int amount = 0;
            while (current != null) {
                if (current.getHrac().getName().equals(name)) {
                    System.out.println(current.getHrac());
                    amount++;
                }
                current = current.getNext();
            }
            if (amount == 0) {
                System.out.println("Nenalezen");
            }
        }
        else{
            System.out.println("Fronta je prázdná");
        }



    }
}
