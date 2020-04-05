package ru.geekbrains.hw7;


public class Main {

    public static void main(String[] args) {
	Cat[] Cats = {
	        new Cat("1",15),
            new Cat("2",25),
            new Cat("3",5),
            new Cat("4",30),
            new Cat("5",40),
                };
	Pleet pleet = new Pleet(50);
	for(Cat cat : Cats){
	    cat.eat(pleet);
	    cat.inf();
    }

	pleet.addFood(0);
	pleet.info();
    }
}
