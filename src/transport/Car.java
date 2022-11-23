package transport;

import java.time.LocalDate;

public class Car {
    public static class Key {
        private final boolean remoteEngineStart; // "Удаленный запуск двигателя"

        private final boolean keylessAccess; //  "Бесключевой доступ"

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }
        public Key() {
            this(false, false);
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }

        @Override
        public String toString() {
            return String.format("Ключ от вашего автомобиля, имеет следующие функции: 1 - " + (isRemoteEngineStart()? "удаленный запуск двигателя" : "ручной запуск двигателя")
                    + " 2 - " + (isKeylessAccess()? "бесключевой доступ" : "обычный доступ"));
        }
    } // класс ключ

    public static class Insurance {
        private final LocalDate validityPeriod; // срок действия
        private final double cost; // стоимость
        private final String number; // номер

        public Insurance(LocalDate validityPeriod, double cost, String number) {
            if (validityPeriod == null) {
                this.validityPeriod = LocalDate.now().plusDays(365);
            } else {
                this.validityPeriod = validityPeriod;
            }

            if (cost <= 0) {
                this.cost = 6500.50;
            } else {
                this.cost = cost;
            }

            if (number == null) {
                this.number = "987АK33P1";
            } else {
                this.number = number;
            }
        }

        public Insurance() {
            this(null, 0, null);
        }

        public static void checkValidityPeriod(Insurance insurance) {
            if (insurance.getValidityPeriod().isBefore(LocalDate.now()) || insurance.getValidityPeriod().isEqual(LocalDate.now())) {
                System.out.println("Внимание, ваша страховка просрочена, нужно срочно ехать оформлять новую страховку!");
            } else {
                System.out.println("Ваша страховка ещё действительна !");
            }
        }

        public static void checkNumber(Insurance insurance) {
            if (insurance.getNumber().length() != 9) {
                System.out.println("Страховой номер состоит из 9 символов, ваш номер некорректный.");
            } else {
                System.out.println("Страховой номер корректный.");
            }
        }

        public LocalDate getValidityPeriod() {
            return validityPeriod;
        }

        public double getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }

        @Override
        public String toString() {
            return "Страховка на автомобиль: " +
                    "может использоваться до - " + validityPeriod +
                    " года , стоимость " + cost +
                    " рублей, номер страховки " + number + '\'';
        }
    } // класс страховка
    private final String brand; //марка

    private final String model; //модель
    private final int year; // год производства
    private final String country; // страна сборки
    private final String bodyType; // тип кузова
    private final int numberOfSeats; // количество мест
    private double engineVolume; // объем двигателя
    private String color; // цвет кузова
    private String transmission; // коробка передач
    private String registrationNumber; // регистрационный номер
    private String typeOfTires; // тип шин
    private Key key; // ключ с доп. возможностями
    private Insurance insurance; // страховка
    public Car(double engineVolume,String color, int year) {
        this(null,null,year,null,null,
                0,engineVolume,color,null,null,null,null,null);
    }
    public Car(String brand, String model, double engineVolume, int year, String country) {
        this(brand,model,year,country,null,0,engineVolume,null,
                null,null,null,null,null);
    }

    public Car(String brand, String model, double engineVolume,String color, int year, String country) {
        this(brand,model,year,country,null,0,engineVolume,color,
                null,null,null,null,null);
    }
    public Car(String brand, String model, int year, String country, String bodyType, int numberOfSeats,
               double engineVolume, String color, String transmission,
               String registrationNumber, String typeOfTires) {
        this(brand, model, year, country, bodyType, numberOfSeats, engineVolume, color, transmission, registrationNumber
                , typeOfTires, null, null);
    }

    public Car(String brand, String model, int year, String country, String bodyType, int numberOfSeats,
               double engineVolume, String color, String transmission,
               String registrationNumber, String typeOfTires, Key key, Insurance insurance) {
        // неизменяемые параметры
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = "Марка не определена";

        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "Модель не определена";
        } else {
            this.model = model;
        }
        if ( year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if ( country == null || country.isEmpty() || country.isBlank()) {
            this.country = "Мордор";
        } else {
            this.country = country;
        }
        if ( bodyType == null || bodyType.isEmpty() || bodyType.isBlank()) {
            this.bodyType = "cедан";
        } else {
            this.bodyType = bodyType;
        }
        if ( numberOfSeats <= 0 ) {
            this.numberOfSeats = 4;
        } else {
            this.numberOfSeats = numberOfSeats;
        }
        // далее, изменяемые параметры
        if ( engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if ( color == null || color.isEmpty() || color.isBlank()) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if ( transmission == null || transmission.isEmpty() || transmission.isBlank()) {
            this.transmission = "автоматическая";
        } else {
            this.transmission = transmission;
        }
        if ( registrationNumber == null || registrationNumber.isEmpty() || registrationNumber.isBlank()) {
            this.registrationNumber = "x000xx000";
        } else {
            this.registrationNumber = registrationNumber;
        }
        if ( typeOfTires == null || typeOfTires.isEmpty() || typeOfTires.isBlank()) {
            this.typeOfTires = "летняя";
        } else {
            this.typeOfTires = typeOfTires;
        }
        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }
        if (insurance == null) {
            this.insurance = new Insurance();
        } else {
            this.insurance = insurance;
        }
    }

    public static void tireReplacement(Car car) {
        if (car.getTypeOfTires() == "летняя") {
            car.typeOfTires = "зимняя";
        }else{
            car.typeOfTires = "летняя";
        }
    } // замена шин
    public static void registrationNumberVerification(Car car) {
        boolean verification = Verification(car);
        if (verification) {
            System.out.println("Номер вашего автомобиля " + car.getBrand()+ " " + car.getModel() + ", соответствует стандарту.");
        } else {
            System.out.println("Номер вашего автомобиля " + car.getBrand() + " " + car.getModel() + ", не соответствует стандарту, номер был заменен.");
            car.registrationNumber = "x000xx000";
        }
    } // проверка знака
    private static boolean Verification(Car car) {
        if (car.registrationNumber.length() != 9) {
           return false;
        }
        char[] chars = car.registrationNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])) {
            return false;

        }
        return Character.isDigit(chars[1]) && Character.isDigit(chars[2]) && Character.isDigit(chars[3]) && Character.isDigit(chars[6]) &&
                Character.isDigit(chars[7]) && Character.isDigit(chars[8]);
    }
    // геттеры для всех параметров

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getTypeOfTires() {
        return typeOfTires;
    }

    public Key getKey() {
        return key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    // сеттеры для изменяемых параметров

    public void setEngineVolume(double engineVolume) {
        if ( engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public void setColor(String color) {
        if ( color == null || color.isEmpty() || color.isBlank()) {
            this.color = "белый";
        } else {
            this.color = color;
        }
    }

    public void setTransmission(String transmission) {
        if ( transmission == null || transmission.isEmpty() || transmission.isBlank()) {
            this.transmission = "автоматическая";
        } else {
            this.transmission = transmission;
        }
    }

    public void setRegistrationNumber(String registrationNumber) {
        if ( registrationNumber == null || registrationNumber.isEmpty() || registrationNumber.isBlank()) {
            this.registrationNumber = "x000xx000";
        } else {
            this.registrationNumber = registrationNumber;
        }
    }

    public void setTypeOfTires(String typeOfTires) {
        if ( typeOfTires == null || typeOfTires.isEmpty() || typeOfTires.isBlank()) {
            this.typeOfTires = "летняя";
        } else {
            this.typeOfTires = typeOfTires;
        }
    }

    public void setKey(Key key) {
        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }
    }

    public void setInsurance(Insurance insurance) {
        if (insurance == null) {
            this.insurance = new Insurance();
        } else {
            this.insurance = insurance;
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s, %d год выпуска, производство %s, цвет %s, объем двигателя %s," +
                " коробка передач %s, тип кузова %s, количество посадочных мест %d, резина %s," +
                " регистрационный номер %s",brand,model,year,country,color,engineVolume,transmission,
                bodyType,numberOfSeats,typeOfTires,registrationNumber);
    } // строка вывода
}
