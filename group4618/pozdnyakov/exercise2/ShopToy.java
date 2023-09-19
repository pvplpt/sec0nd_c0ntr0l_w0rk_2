package group4618.pozdnyakov.exercise2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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

    public void saveToFile(String filename, Toy toy) {
        File resultFile = new File(filename);
        try (FileWriter fileWriter = new FileWriter(resultFile)) {
            String text = "";
            if (toy == null) {
                text = "Очередь пуста";
            } else {
                text = toy.toString();
            }
            fileWriter.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
