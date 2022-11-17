import Cars.Car;
import Humans.Human;

public class Main {
    public static void main(String[] args) {
        System.out.println("OOP - Object");
        task1_2();
        task3();
    }

    private static void task3() {
        System.out.println("Домашнее задание 3");
        Human maxim = new Human();
        System.out.println(maxim);
        Human anya = new Human(1993);
        System.out.println(anya);
        Human katya = new Human("Катя", -1992, "Калининград");
        System.out.println(katya);

        separator();

        Car lada = new Car( 1.7,"желтый",2015);
        System.out.println(lada);
        Car audi = new Car("Audi", "A8", 3.0, 2020, "Германия");
        System.out.println(audi);
        Car bmw = new Car("BMW", "Z8", -3, "черный", 2021, "Германия");
        System.out.println(bmw);
        Car kia = new Car("Kia", "Sportage 4-го покаления", 2.4, "красный", 0, "Южная Корея");
        System.out.println(kia);
    }

    private static void task1_2() {
        System.out.println("Домашнее задание 1 - 2");
        separator();
        Human maxim = new Human("Максим", 1988, "Минск", "бренд-менеджер");
        Human anya = new Human("Аня", 1993, "Москва", "методист образовательных программ");
        Human katya = new Human("Катя", 1992, "Калининград", "продакт-менеджер");
        Human artem = new Human("Артем", 1995, "Москва", "директор по развитию бизнеса");
        System.out.printf(maxim + "\n" + anya + "\n" + katya + "\n" + artem + "\n");
        separator();
        Car lada = new Car("Lada","Granta", 1.7,"желтый",2015, "Россия");
        Car audi = new Car("Audi", "A8", 3.0, "черный", 2020, "Германия");
        Car bmw = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия");
        Car kia = new Car("Kia", "Sportage 4-го покаления", 2.4, "красный", 2018, "Южная Корея");
        Car hyundai = new Car("Hyundai", "Avante", 1.6,"оранжевый", 2016, "Южная Корея");
        System.out.printf(lada + "\n" + audi + "\n" + bmw + "\n" + kia + "\n" + hyundai + "\n");
        separator();
    }
    private static void separator() {
        System.out.println("=========================================================================================");
    }
}