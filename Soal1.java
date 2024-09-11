import java.util.Scanner;

public class Soal1 {
    /**
     * buatlah sebuah program yg mengambil 2 input number dari user
     * program tersebut akan print out nilai yang paling besar
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int angka1 = scanner.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angka2 = scanner.nextInt();

        if (angka1 > angka2) {
            System.out.println("Angka terbesarnya adalah: " + angka1);
        } else {
            System.out.println("Angka terbesarnya adalah: " + angka2);
        }
    }
}
