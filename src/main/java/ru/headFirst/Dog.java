package main.java.ru.headFirst;

public class Dog {
    String name;
    public static void main(String args[]) {
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Барт";
        Dog[] myDogs = new Dog[3];
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        myDogs[0].name = "Фред";
        myDogs[1].name = "Джордж";

        int x = 0;
        while (x<myDogs.length) {
            myDogs[x].bark();
            x =x +1;
        }
    }

    private void bark() {
        System.out.println(name + " сказал Гав!");
    }
}
