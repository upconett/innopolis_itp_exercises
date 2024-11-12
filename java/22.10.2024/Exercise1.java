public class Exercise1 {
    public static class Animal {
        protected String name, color;
        protected float height, weight;

        public void eat() {}
        public void sleep() {}
        public void makeSound() {}

        Animal(String name, String color, float height, float weight) {
            this.name = name;
            this.color = color;
            this.height = height;
            this.weight = weight;
        }
    }   

    public static class Cow extends Animal {
        @Override
        public void eat() {System.out.println("Cow " + name + " is eating...");}
        @Override
        public void sleep() {System.out.println("Cow " + name + " is sleeping...");}
        @Override
        public void makeSound() {System.out.println(name + " sais MOOO");}
       
        Cow(String name, String color, float height, float weight) {
            super(name, color, height, weight);
        }
    }

    public static class Cat extends Animal { 
        @Override
        public void eat() {System.out.println("Cat " + name + " is eating...");}
        // @Override
        // public void sleep() {System.out.println("Cat " + name + " is sleeping...");}
        @Override
        public void makeSound() {System.out.println(name + " sais MEOW");}

        Cat(String name, String color, float height, float weight) {
            super(name, color, height, weight);
        }
    }

    public static class Dog extends Animal { 
        @Override
        public void eat() {System.out.println("Dog " + name + " is eating...");}
        @Override
        public void sleep() {System.out.println("Dog " + name + " is sleeping...");}
        @Override
        public void makeSound() {System.out.println(name + " sais BARK");}

        Dog(String name, String color, float height, float weight) {
            super(name, color, height, weight);
        }
    }

    public static void main(String[] args) {
        Animal[] animals = new Animal[3];

        animals[0] = new Cow(
            "Buryonka",
            "white",
            3,
            200
        );

        animals[1] = new Cat(
            "Murka",
            "black",
            (float) 0.4,
            10
        );

        animals[2] = new Dog(
            "Barbos",
            "brown",
            (float) 1,
            30
        );

        System.out.println();

        System.out.println("  Animals eat:");
        for (Animal a : animals) a.eat();
        System.out.println();

        System.out.println("  Animals sleep:");
        for (Animal a : animals) a.sleep();
        System.out.println();

        System.out.println("  Animals makeSounds:");
        for (Animal a : animals) a.makeSound();
        System.out.println();

    }
}
