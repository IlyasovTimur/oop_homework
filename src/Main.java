import transport.Car;
import Flowers.Bouquet;
import Flowers.Flower;
import Humans.Human;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("ООП");
        separator();
        System.out.println("Введение - Object");
        task1_2();
        task3();
        separator();
        System.out.println("Инкапсуляция");
        task4();
        task5();
        task6();
        task7();
    }

    private static void task7() {
        separator();
        System.out.println("Урок 2. Домашнее задание 3");

        Car.Key key1 = new Car.Key(true,false);
        Car.Key key2 = new Car.Key(true,true);
        Car.Key key3 = new Car.Key();


        Car lada = new Car("Lada","Granta", 1.7,"желтый",2015, "Россия");
        Car audi = new Car("Audi", "A8", 3.0, "черный", 2020, "Германия");
        Car bmw = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия");
        Car kia = new Car("Kia", "Sportage 4-го покаления", 2.4, "красный", 2018, "Южная Корея");
        Car hyundai = new Car("Hyundai", "Avante", 1.6,"оранжевый", 2016, "Южная Корея");

        System.out.println();
        System.out.println("Задание/ключ");
        System.out.println();

        lada.setKey(key1);
        System.out.println(lada.getKey());
        audi.setKey(key2);
        System.out.println(audi.getKey());
        bmw.setKey(key3);
        System.out.println(bmw.getKey());


        separatorTwo();
        System.out.println("Задание/страховка");
        System.out.println();

        Car.Insurance insuranceOne = new Car.Insurance(LocalDate.now(), 14568.32,  "907388198923");
        Car.Insurance insuranceTwo = new Car.Insurance(null, 0,  "6753АС2РР");


        System.out.println(kia.getInsurance());
        kia.setInsurance(insuranceOne);
        System.out.println(kia.getInsurance());
        hyundai.setInsurance(insuranceTwo);
        System.out.println(hyundai.getInsurance());
        System.out.println();
        Car.Insurance.checkValidityPeriod(insuranceOne);
        Car.Insurance.checkValidityPeriod(insuranceTwo);
        Car.Insurance.checkNumber(insuranceOne);
        Car.Insurance.checkNumber(insuranceTwo);

    }

    private static void task6() {
        separator();
        System.out.println("Урок 2. Домашнее задание 2");

        Car lada = new Car("Лада","2114 Самара",2011,"Россия","седан",4,1.6,"черный","механическая","x101ее154","зимняя");
        Car lada2 = new Car("Лада","Vesta",2018,"Россия","седан",4,1.6,"синий","автоматическая","x00sk","летняя");
        Car lada3 = new Car("Лада","Vesta",2018,"Россия","седан",
                4,1.6,"синий","автоматическая","000000000",
                "летняя",null,null);


        System.out.println();
        System.out.println("Задание/замена шин");
        System.out.println();
        System.out.println(lada);
        System.out.println(lada.getTypeOfTires());
        Car.tireReplacement(lada);
        System.out.println(lada.getTypeOfTires());
        System.out.println(lada);
        Car.tireReplacement(lada);
        System.out.println(lada.getTypeOfTires());

        separatorTwo();
        System.out.println("Задание/проверка номера");
        System.out.println();
        Car.registrationNumberVerification(lada);
        Car.registrationNumberVerification(lada2);
        Car.registrationNumberVerification(lada2);
        Car.registrationNumberVerification(lada3);
    }

    private static void task5() {
        separator();
        System.out.println("Урок 2. Домашнее задание 1. Дополнительная часть задания");
        System.out.println();

        Flower rose = new Flower("Роза обыкновенная", "красный", "Голландия", 35.59, 0);
        Flower chrysanthemum = new Flower("Хризантема", null, "", 15, 5);
        Flower pion = new Flower("Пион", "розовый", "Англия", 69.9, 1);
        Flower gypsophila = new Flower("Гипсофила", "", "Турция", 19.5, 10);

        Flower[] flowers = new Flower[5];
        flowers[0] = chrysanthemum;
        flowers[1] = pion;
        flowers[2] = gypsophila;
        flowers[3] = rose;
        flowers[4] = rose;

        Bouquet bouquet = new Bouquet(flowers);
        System.out.println(bouquet);
        System.out.printf("Стоимость букета равна %.2f рублей. \n", Bouquet.costBouquet(flowers));
        System.out.printf("Срок стояния букета равен %d дней.\n",Bouquet.shelfLifeOfTheBouquet(flowers));
    }

    private static void task4() {
        separator();
        System.out.println("Урок 2. Домашнее задание 1");
        System.out.println();

        System.out.println("Задание/безработный Владимир");
        System.out.println();
        Human vladimir = new Human("Владимир", 0, null, "безработный");
        vladimir.setTown("Казань");
        vladimir.setYearOfBirth(LocalDate.now().getYear() - 21);
        System.out.println(vladimir);

        separatorTwo();
        System.out.println("Задание/цветы");
        System.out.println();
        Flower rose = new Flower("Роза обыкновенная", "красный", "Голландия", 35.59, 0);
        Flower chrysanthemum = new Flower("Хризантема", null, "", 15, 5);
        Flower pion = new Flower("Пион", "розовый", "Англия", 69.9, 1);
        Flower gypsophila = new Flower("Гипсофила", "", "Турция", 19.5, 10);
        System.out.println(rose + "\n" + chrysanthemum + "\n" + pion + "\n" + gypsophila);
    }

    private static void task3() {
        separator();
        System.out.println("Урок 1. Домашнее задание 3");
        System.out.println();
        Human maxim = new Human(" ",1988,null,"бренд-менеджер");
        System.out.println(maxim);
        Human anya = new Human("Аня", 1993, "     ", null);
        System.out.println(anya);
        Human katya = new Human("Катя", -1992, "Калининград", "продакт-менеджер");
        System.out.println(katya);
        System.out.println();
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
        separator();
        System.out.println("Урок 1. Домашнее задание 1 - 2");
        System.out.println();
        Human maxim = new Human("Максим", 1988, "Минск", "бренд-менеджер");
        Human anya = new Human("Аня", 1993, "Москва", "методист образовательных программ");
        Human katya = new Human("Катя", 1992, "Калининград", "продакт-менеджер");
        Human artem = new Human("Артем", 1995, "Москва", "директор по развитию бизнеса");
        System.out.printf(maxim + "\n" + anya + "\n" + katya + "\n" + artem + "\n");
        System.out.println();
        Car lada = new Car("Lada","Granta", 1.7,"желтый",2015, "Россия");
        Car audi = new Car("Audi", "A8", 3.0, "черный", 2020, "Германия");
        Car bmw = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия");
        Car kia = new Car("Kia", "Sportage 4-го покаления", 2.4, "красный", 2018, "Южная Корея");
        Car hyundai = new Car("Hyundai", "Avante", 1.6,"оранжевый", 2016, "Южная Корея");
        System.out.printf(lada + "\n" + audi + "\n" + bmw + "\n" + kia + "\n" + hyundai + "\n");
    }
    private static void separator() {
        System.out.println("=========================================================================================");
    }
    private static void separatorTwo() {
        System.out.println("_______________");
    }
}