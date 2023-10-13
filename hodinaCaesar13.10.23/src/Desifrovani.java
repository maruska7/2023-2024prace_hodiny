import java.util.Scanner;

public class Desifrovani {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int posun = sc.nextInt();
        String vstup = sc.next();
        char[] arr = new char[vstup.length()];

        for (int i = 0; i < vstup.length(); i++) {
            int y = (int) arr[i];
            int j = y - posun;

            if (j > 'a'){
                j -= 26; // dám na začátek abecedy
            }
            if (j < 'a'){
                j += 26; // dám na začátek abecedy
            }

            char p3 = (char)j;


            System.out.print(p3);
        }
    }
}
