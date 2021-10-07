import java.util.Scanner;

public class Vyskaprogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] categories = {"Trpaslik", "Normal", "Vysoky"};

        System.out.print("Zadej vysku: ");
        int height = sc.nextInt();

        if (height < 150) {
            System.out.println(categories[0]);
        } else if (height >= 150 && height <= 175) {
            System.out.println(categories[1]);
        }
        if (height == 178) {
            System.out.println("Jsi vysoky jako Miklis");
        } else if (height > 175) {
            System.out.println(categories[2]);
        }
    }
}
