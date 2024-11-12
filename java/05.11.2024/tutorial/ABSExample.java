public class ABSExample {
    abstract static class Animal {
        abstract public void say(int times);
    }

    static class Dog extends Animal {
        public void say(int times) {
            for (int i = 0; i < times; i++)
                System.out.println("Bark!");
        }
        @Override
        public String toString() {
            return "this is dog";
        }
    }

    public static void main(String[] args) {
        Animal barbos = new Dog();
        barbos.say(3);
        System.out.println(barbos);
    }

    public interface Moving {
        abstract void move();
    }

    public interface Flying extends Moving {
        default void fall() {
            System.out.println(getClass().getSimpleName() + " is falling");
        }
        abstract void flap_wings();
    }

    public static class Pigeon extends Animal implements Flying {
        @Override
        public void flap_wings() {
            // TODO Auto-generated method stub
        }

        @Override
        public void move() {
            // TODO Auto-generated method stub
        }

        @Override
        public void say(int times) {
            // TODO Auto-generated method stub
        }
    }
}