package Humans;

public class Human {
    int yearOfBirth;
    String name;
    String town;
    String jobTitle;

    public Human() {
        this("Информация не указана",0,"Информация не указана","Информация не указана");
    }
    public Human(int yearOfBirth) {
        this("Информация не указана",yearOfBirth,"Информация не указана","Информация не указана");
    }
    public Human( String name, int yearOfBirth, String town) {
        this(name,yearOfBirth,town,"Информация не указана");
    }

    public Human( String name, int yearOfBirth, String town, String jobTitle ) {
        this.name = name;

        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
//            throw new RuntimeException("Год рождения не может быть отрицательным!");
            this.yearOfBirth = 0;
        }

        this.town = town;
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return String.format("Привет! Меня зовут %s. Я из города %s. Я родился в %d году. Я работаю на должности %s. Будем знакомы!",name,town,yearOfBirth,jobTitle);
    }
}
