import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("String daxil edin:");
//        String metn = sc.nextLine();

        //Sual 1.

//        String herfler = "";
//        String reqemler = "";

//        for (int i = 0; i < metn.length(); i++) {
//            char herf1 = metn.charAt(i);
//            if (Character.isLetter(herf1)) {
//                herfler += herf1;
//            } else if (Character.isDigit(herf1)) {
//                reqemler += herf1;
//            }
//        }
//        System.out.println("Stringdəki hərflər: "+herfler);
//        System.out.println("Stringdəki rəqəmlər: "+reqemler);


        //Sual 2.

//     String reqemsizMetn=metn.replaceAll("[0-9]","");
//        System.out.println("Rəqəmləri silinmiş mətn: "+reqemsizMetn);


        //Sual 3.

//    public final class Person{
//        private final String name;
//        private final String surname;
//        private  final int age;
//
//        public Person(String name, String surname, int age) {
//            this.name = name;
//            this.surname = surname;
//            this.age = age;
//        }
//        public String getName() {
//            return name;
//        }
//
//        public String getSurname() {
//            return surname;
//        }
//
//        public int getAge() {
//            return age;
//        }
//
//        public Person withName(String newName){
//            return new Person(newName,this.surname,this.age);
//        }
//
//        public Person withSurname(String newSurname){
//            return new Person(this.name,newSurname,this.age);
//        }
//
//        public Person withAge(int newAge){
//            return new Person(this.name,this.surname,newAge);
//        }
//    }

        //Sual 4.

        Scanner sc=new Scanner(System.in);
        System.out.println("Texti daxil edin: ");
        String a1=sc.nextLine();
        String processedText=processText(a1);
        System.out.println("Proses olunmuş text: "+processedText);
    }

    public static String processText(String text) {
        String[] words = text.split("[\\s.,!?]+");
        Set<String> uniquewords = new HashSet<>(Arrays.asList(words));
        String newText = String.join(",", uniquewords);
        return newText;
    }
        //Sual 5

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Tarixi İl-Ay-Gün formatında girin: ");
//        String tarixStr = sc.nextLine();
//        //DateTimeFormatter ile stringi LocalDateTime donustururuk.
//        DateTimeFormatter tarixFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        LocalDate dogumTarix = LocalDate.parse(tarixStr, tarixFormatter);
//        //Gunumuz tarix
//        LocalDate bugununTarixi=LocalDate.now();
//        //Adgunu listi
//        List<LocalDate> adGunleri=new ArrayList<>();
//        //adgunu tapma
//        while (!dogumTarix.isAfter(bugununTarixi)){
//            adGunleri.add(dogumTarix);
//            dogumTarix=dogumTarix.plusYears(1);
//        }
//        //adgununun hansi gun olmasi
//        for (LocalDate brithday:adGunleri){
//            DayOfWeek dayOfWeek=brithday.getDayOfWeek();
//            System.out.println("Ad günü: "+brithday.format(tarixFormatter)+" | "+"Gün: "+dayOfWeek.toString());
//        }
//        sc.close();

        //Sual 6.

//        public static void main(String[] args) {
//
//            LocalDate baslangicTarixi = LocalDate.of(2023, 1, 1);
//            LocalDate bitisTarixi = LocalDate.of(2023, 12, 31);
//
//
//            long isGunuSayisi = IsGunleriHesaplama.isGunleriSayisiHesapla(baslangicTarixi, bitisTarixi);
//            System.out.println("İş günü sayı : " + isGunuSayisi);
//        }
//    }
//
//    class IsGunleriHesaplama {
//
//
//        private static final List<String> bayramlar = new ArrayList<>();
//
//
//        static {
//            bayramlar.add("08/03/2023");
//
//        }
//
//        // İki tarix arasındakı iş günü sayısını hesablayan metod
//        public static long isGunleriSayisiHesapla(LocalDate baslangicTarixi, LocalDate bitisTarixi) {
//            long isGunleri = 0;
//            LocalDate indikiTarix = baslangicTarixi;
//
//            while (!indikiTarix.isAfter(bitisTarixi)) {
//                if (isIsGunu(indikiTarix)) {
//                    isGunleri++;
//                }
//                indikiTarix = indikiTarix.plusDays(1);
//            }
//
//            return isGunleri;
//        }
//
//        // Verilmish tarixin is günü olub-olmadıgını yoxlayan metod
//        public static boolean isIsGunu(LocalDate tarix) {
//            DayOfWeek gun = tarix.getDayOfWeek();
//
//            // Sənbə və bazar günü false qaytarır
//            if (gun == DayOfWeek.SATURDAY || gun == DayOfWeek.SUNDAY) {
//                return false;
//            }
//
//            // Bayram tarixləri List-də varsa false qaytarır
//            String tarixStr = tarix.toString();
//            if (bayramlar.contains(tarixStr)) {
//                return false;
//            }
//
//
//            return true;
//        }
//    }

}