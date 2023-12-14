public class masking {
    public static void main(String[] args) {
        byte a=9,b=12;
        byte c;
        c=(byte)(a<<4);
        c=(byte)(c/b);
        System.out.println(c);
    }
}
