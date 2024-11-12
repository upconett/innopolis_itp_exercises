public class ExtremeNum {
    enum Operation {
        PLUS { int eval(int x, int y) { return x+y; }; },
        MINUS{ int eval(int x, int y) { return x+y; }; };

        abstract int eval(int x, int y);
    }

    public static void main(String[] args) {
        Operation op = Operation.PLUS;

        System.out.println(op.eval(1, 4));
    }
    
}
