package com.company;

public class Person {

    private String name;

    private String surname;

    public Person(String name, String surname) {
        setName(name);
        setSurname(surname);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length()>=3){
        this.name = name;
        }
        else {
            System.out.println("Podałeś niepoprawne dane");
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
