package Lab04;

/*
    @author Saurabh Saraswat
    @Version 1.0

* */

public class Person {

    private String name;
    private int age;
    private char gender;

    // Parameterised Constructor

    public Person(int age, String name, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        StringBuilder response = new StringBuilder();
        response.append("Name = " + getName() + " /n ");
        response.append("Age = " + getAge());
        response.append("Gender = " + getGender());
        return response.toString();

    }
}
