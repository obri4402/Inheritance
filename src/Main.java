public class Main {
    public static void main(String[] args){

        //Inheritance = One class inherits the attributes and methods
        //              from another class
        //              Child <- Parent <- Grand Parent


        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        System.out.println("Is it alive?: " + dog.isAlive); //Inheriting to another class

        System.out.println("The cat's name is: " + Cat.name);
        System.out.println("Is it alive?: " + cat.isAlive);
        System.out.println("The cat lives is " + cat.lives);
        cat.eat();
        cat.speak();

        System.out.println();

        System.out.print("While the ");
        System.out.println("dog name is: " + Dog.name);
        System.out.println("Is it alive?: " + dog.isAlive);
        System.out.println("The dog's lives is " + dog.lives);
        dog.eat();
        dog.speak();

        System.out.println();

        System.out.println("Are plants living organism?: " + plant.isAlive);
        plant.photosynthesize();


    }
}
