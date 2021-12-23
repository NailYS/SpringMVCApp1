package ru.nail.model;

public class Person {

    private String name;
    private int id;
    private int age;
    private String email;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person(int id, String name, String email, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;

    }

    public Person() {
    }
}
