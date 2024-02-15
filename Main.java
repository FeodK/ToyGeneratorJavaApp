import controller.ToyController;
import model.Toy;
import view.ToyView;

public class Main {
    public static void main(String[] args) {
        ToyView toyView = new ToyView();
        ToyController toyController = new ToyController(toyView);

        Toy teddyBear = new Toy("001", "Конструктор", 2);
        Toy doll = new Toy("002", "Робот", 2);
        Toy car = new Toy("003", "Кукла", 6);

        toyController.addToy(teddyBear);
        toyController.addToy(doll);
        toyController.addToy(car);

        toyController.selectToys(10, "output.txt");
        System.out.println("Вывод был записан в output.txt");
    }
}
