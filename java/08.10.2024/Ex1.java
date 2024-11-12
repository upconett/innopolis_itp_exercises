import java.util.Scanner;

class Ex1 {
    public static void main(String[] args) {
        // print the operations to choose from
        printOperations();
        // calculate based on the given operator
        calculate();
    }

    public static void printOperations() {
        System.out.println("Please choose the operation from list:");
        for (Operation i : Operation.values()) {
            System.out.format("%d) %s\n", i.ordinal()+1, i.getOp());
        }
    }

    public static void calculate() {
        Scanner scanner = new Scanner(System.in);
        Operation op = getOperation(scanner);
        int first = readNumber(scanner);
        int second = readNumber(scanner);

        int result = 0;

        switch (op) {
            case ADD:
                result = first + second; break;
            case SUB:
                result = first - second; break;
            case MUL:
                result = first * second; break;
            case DIV:
                if (second != 0) 
                    result = first / second;
                else {
                    System.out.println("Get the hell out of the calculator!");
                    System.exit(1); }
                break;
            default:
                System.out.println("You messed up...");
                System.exit(1);
        }
        System.out.println(result);
    }

    public static Operation getOperation(Scanner scanner) {
        int value = scanner.nextInt();
        return Operation.values()[value-1];
    }
    
    public static int readNumber(Scanner scanner) {
        int num = scanner.nextInt();
        return num;
    }



    public static enum Operation {
        ADD("Addition"),
        SUB("Subtraction"),
        MUL("Multiplication"),
        DIV("Division");

        private String op;

        Operation(String op) {
            this.op = op;
        }

        public String getOp() {
            return this.op;
        }
    }
}