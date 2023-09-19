package group4618.pozdnyakov.exercise2;

import java.util.PriorityQueue;

public class ShopToy {
    private PriorityQueue<Toy> queueToy;

    public ShopToy() {
        queueToy = new PriorityQueue<Toy>(new ToyComparator());
    }

    public void put(int id, String name, double frequency) {
        Toy toy = new Toy(id, name, frequency);
        queueToy.add(toy);
    }

    public Toy get() {
        return queueToy.poll();
    }

}
