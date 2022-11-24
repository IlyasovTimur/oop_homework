package Humans;

public class Human {
    private int yearOfBirth;
    String name;
    private String town;
    String jobTitle;

    public Human( String name, int yearOfBirth, String town, String jobTitle ) {
        if (name == null || name.isEmpty() || name.isBlank()) {
        this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
//            throw new RuntimeException("Год рождения не может быть отрицательным!");
            this.yearOfBirth = 0;
        }
        if (town == null || town.isEmpty() || town.isBlank()) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
        if (jobTitle == null || jobTitle.isEmpty() || jobTitle.isBlank()) {
            this.jobTitle = "Информация не указана";
        } else {
            this.jobTitle = jobTitle;
        }
    }
    public int getYearOfBirth() {
        return yearOfBirth;
    }
    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }
    }
    public String getTown() {
        return town;
    }
    public void setTown(String town) {
        if (town == null || town.isEmpty() || town.isBlank()) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
    }

    @Override
    public String toString() {
        return String.format("Привет! Меня зовут %s. Я из города %s. Я родился в %d году. Я работаю на должности %s. Будем знакомы!",name,town,yearOfBirth,jobTitle);
    }
}
