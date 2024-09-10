public class UnaryOperator {
    public static void main(String[] args) {
        int x = 10;
        //pre-increment
        System.out.println(++x); //buat nambah 1 / nambah value nya = 11
        //post-increment
        System.out.println(++x);

        int y = 10;
        //pre-decrement
        System.out.println(--y); // = 9
        //post-decrement
        System.out.println(y--); //

        //logical NOT
        boolean isTrue = true;
        System.out.println(!isTrue);
    }
}
