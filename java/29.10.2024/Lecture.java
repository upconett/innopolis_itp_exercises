import java.io.IOException;

class Lecture {

    static class Test {
        int a, b;
        String str;
        char c = 'd';
        @Override
        public String toString() {
            return String.format("a=%d, b=%d, str=%s, c=%b",a,b,str,c=='\0');
        }
    }
    public static void main(String[] args) throws IOException {
    }
}