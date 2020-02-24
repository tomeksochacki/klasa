package com.company;

public class User {
    //co ma zawierać użytkownik - zastanawiamy się

    //te elementy poniżej to pola klasy-atrybuty i dla każdego elementu zastanawiamy się jaki będzie typ
    String username; //zastanawiamy się jaki bedzie typ?

    String email;

    //liczba mnoga lista bądź inna kolekcja


    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
