package view;

import model.Toy;

import java.io.FileWriter;
import java.io.IOException;

public class ToyView {
    public void writeToFile(Toy toy, String filename) {
        try {
            FileWriter writer = new FileWriter(filename, true);
            writer.write("Выпавшая игрушка: " + toy.getName() + " (ID: " + toy.getId() + ")\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Произошла ошибка при записи в файл.");
            e.printStackTrace();
        }
    }
}

