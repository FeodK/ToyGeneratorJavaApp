package controller;

import model.Toy;
import view.ToyView;

import java.util.PriorityQueue;

public class ToyController {
    private ToyView toyView;
    private PriorityQueue<Toy> toyQueue;

    public ToyController(ToyView toyView) {
        this.toyView = toyView;
        this.toyQueue = new PriorityQueue<>((t1, t2) -> Integer.compare(t2.getFrequency(), t1.getFrequency()));
    }

    public void addToy(Toy toy) {
        for (int i = 0; i < toy.getFrequency(); i++) {
            toyQueue.add(toy);
        }
    }

    public void selectToys(int numberOfToys, String filename) {
        for (int i = 0; i < numberOfToys; i++) {
            Toy selectedToy = toyQueue.poll();
            if (selectedToy != null) {
                toyView.writeToFile(selectedToy, filename);
            }
        }
    }
}
