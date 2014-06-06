public class Main {

    public static void main(String[] args) {

        Object x = new CaseInsenstiveString("abc");
        Object y = new CaseInsenstiveString("Abc");  // y is a String
        if (x.equals(y))  {
            System.out.println("true");}  // evaluates true, so execute
        if (y.equals(x))  {
            System.out.println("print false");}  // evaluates false, so don’t…


        System.out.println("Hello World!");
    }
}
