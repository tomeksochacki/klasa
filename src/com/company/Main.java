package com.company;

public class Main {

    //klasa = definicja dla obiektów o podobnych właściwościach
    //obiekt = konkretny obiekt - konkretna rzecz
    //klasa = nowy typ - czyli ta klasa którą utowrzyliśmy może być typem

    public static void main(String[] args) {
	// write your code here

        Person person = new Person ("A", "Kowalski");
        person.setName("W");
        System.out.println(person.getName());


        //person.name = "W";
        //LOMBOK

        User tom = new User("tomek", "tomeksochacki@gmail.com");

        User just = new User("justyna", "justyna@wp.pl");
    System.out.println(just);
    System.out.println(tom.email);
    }
}
