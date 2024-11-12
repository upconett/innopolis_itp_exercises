import java.util.Scanner;

public class BetterCalculator {
    public static class Calculator {
        public enum Operations {
            ADD("+"),
            SUB("-"),
            MUL("*"), 
            DIV("/"),
            ERR("");

            private String op;
            Operations(String op) { this.op = op; }

            public String getOp() {return op;}
            public static Operations choose(String sop) {
                switch (sop) {
                    case "+": return Operations.ADD;
                    case "-": return Operations.SUB;
                    case "*": return Operations.MUL;
                    case "/": return Operations.DIV;
                    default: return Operations.ERR;
                }
            }
        }

        int a, b, result;
        Operations op;

        public Calculator setInput(Scanner scanner) {
            System.out.println("Enter infix expression with one operation (only +,-,*,/):");
            a = scanner.nextInt();
            op = Operations.choose(scanner.next());
            b = scanner.nextInt();
            return this;
        }

        public Calculator calculate() { 
            switch (op) {
                case ADD: result = a + b; break;
                case SUB: result = a - b; break;
                case MUL: result = a * b; break;
                case DIV: result = a / b; break;
                case ERR: break;
            }; return this; 
        }

        @Override
        public String toString() {
            if (op == Operations.ERR)
                return "Invalid operation!";
            else 
                return String.format("%d", result);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       

        Calculator calc = new Calculator();
        calc.setInput(scanner).calculate();
        System.out.println("Result: " + calc);
    }
}
