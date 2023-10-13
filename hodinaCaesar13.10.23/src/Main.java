import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int posun = sc.nextInt();
        String vstup = sc.next();
        char[] arr = new char[vstup.length()];

        for (int i = 0; i < vstup.length(); i++) {
            arr[i] = vstup.charAt(i);
        }

        for (char c : arr) {
            int i = (int) c;
            int j = i + posun;

            if (j > 122) {
                j -= 26; // dám na začátek abecedy
            }

            char c2 = (char) j;

            System.out.println(c2);
        }
        System.out.println();

        for (char c : arr) {
            int i = (int) c;
            int j = i - posun;

            if (j < 'a') {
                j += 26; // dám na začátek abecedy
            }

            char p2 = (char) j;

            //System.out.println(i + " : " + j + " - " + p + " : " + p2);
            System.out.print(p2);
        }
        System.out.println();


    }
}