package domaci17z2;

/*
2.	Napraviti klasu koja predstavlja računar. Računar ima broj procesora, količinu ram memorije i količinu memorije.
Ima toString metodu implementiranu kao "Broj procesora: 4, ram: 16GB, memorija: 512GB". Napraviti klasu laptop koja
nasleđuje računar i ima dodatno polja za veličinu ekrana i enum za tastaturu (da li je internacionalna ili US).
Isto implementirati toString, samo dodati još veličinu ekrana i tastaturu kao:  "Broj procesora: 4, ram: 16GB,
memorija: 512GB, ekran: 15.6", tastatura: INTERNATIONAL" Napraviti klasu mobilni telefon koji nasleđuje računar i
ima dodatno polja za jačinu kamere u megapikselima i enum za mrežu koju podržava (3G, 4G, 5G). Implementirati
toString metodu da ispisuje "Broj procesora: 8, ram: 6GB, memorija: 128GB, kamera: 32Megapixela, mreza: 5G". U
main metodi napraviti listu računara, provući kroz jednu petlju i ispisati klasu kojoj objekat pripada (Da li je
laptop ili mobilni).
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Zadatak2 {
    public static void main(String[] args) {

        Laptop lt1 = new Laptop(8, 32, 1024, 15.4, Tastatura.INTERNATIONAL);
        Laptop lt2 = new Laptop(4, 8, 256, 13.3, Tastatura.US);
        Laptop lt3 = new Laptop(6, 16, 512, 17.1, Tastatura.US);

        MobilniTelefon cell1 = new MobilniTelefon(6, 12, 128, 64, Mreza.CETIRIG);
        MobilniTelefon cell2 = new MobilniTelefon(8, 16, 512, 108, Mreza.PETG);
        MobilniTelefon cell3 = new MobilniTelefon(8, 8, 128, 64, Mreza.TRIG);

        ArrayList<Racunar> uredjaji = new ArrayList<>(Arrays.asList(lt1, lt2, lt3, cell1, cell2, cell3));

        for (int i = 0; i < uredjaji.size(); i++) {
            Racunar device = uredjaji.get(i);
            if (device instanceof Laptop) {
                System.out.println("Laptop: " + device);
            } else if (device instanceof MobilniTelefon) {
                System.out.println("Mobilni telefon: " + device);
            } else {
                System.out.println("Ne znam koji je ovo uredjaj.");
            }
        }

    }
}
