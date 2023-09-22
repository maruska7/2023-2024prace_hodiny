import java.lang.reflect.Array;
import java.util.Arrays;

public class MojeTrideni {

    private class (Clovek[] pole, int x, int y){
        Clovek clovek = pole[x];
        pole[x] =
    }

    private boolean
    public static void main(String[] args) {
        Clovek[] arr = {
                new Clovek("Jan", "Komensky",1592),
                new Clovek("Jana", "Komenska",1593),
                new Clovek("Sabina", "Javurkova",2004),
                new Clovek("Mariia", "Gavrylenko",2001),
                new Clovek("Sebastian", "Hermanek",2000),
                new Clovek("Honza", "Capek",1997),
                new Clovek("Julie", "Ivanona",2016),
                new Clovek("Michal", "Kucerov",1845),
                new Clovek("Jakub", "Dvorak",2019),
                new Clovek("Anezka", "Milackova",1235),
        };

        for (int i = 0; i < arr.length; i++) {

            int pomocnaPromena;

            if(arr[i+1].getRokNarozeni() < arr[i].getRokNarozeni()){
                pomocnaPromena = arr[i+1].getRokNarozeni();
                arr[i+1].setRokNarozeni(arr[i].getRokNarozeni());
                arr[i].setRokNarozeni(pomocnaPromena);
            }

        }
    }

        System.out.println(Arrays.toString(arr));
}

