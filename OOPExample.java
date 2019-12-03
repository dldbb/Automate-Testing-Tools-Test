public class OOPExample {
    static int a;
    int b;
    InnerClass cl;

    public class InnerClass {
        int c;
        public InnerClass(int c) {
            this.c = c;
        }
    }

    public static String ifPositive(int n) {
        if (n > 0) {
            return "Positive";
        } else {
            return "Non-positive";
        }
    }

    public OOPExample(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.cl = new InnerClass(c);
    }
}