package javaKadai;

public class Example4_1 {
    public static void main(String[] args) {
    	Dog dog = new Dog("ワン");
    	Cat cat = new Cat("ニャー");
    	Lion lion = new Lion("ガオー");
    	dog.sound();
    	cat.sound();
    	lion.sound();
    }
}

class Animal {
	private String nakigoe;
	
	public Animal(String animal) {
		nakigoe = animal;
	}
	void sound() {
		System.out.println(nakigoe);
	}
}

class Dog extends Animal{
	public Dog(String koe) {
		super(koe);
	}
}

class Cat extends Animal {
    public Cat(String koe) {
    	super(koe);
    }
}

class Lion extends Animal{
	public Lion(String koe) {
		super (koe);
	}
}
