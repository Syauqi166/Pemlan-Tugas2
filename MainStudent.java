package praktikum.modul2;
import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {

    /*Student anna = new Student();
    anna.setName("Anna");
    anna.setAddress("Malang");
    anna.setAge(20);
    anna.setMath(100);
    anna.setScience(89);
    anna.setEnglish(80);
    anna.displayMessage();*/

    //Scanner untuk input data siswa
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan jumlah siswa : ");
    int jumlahSiswa = input.nextInt();
    input.nextLine();
    
    //Array untuk menyimpan banyaknya siswa
    Student[] students = new Student[jumlahSiswa];

    for (int i = 0; i < jumlahSiswa; i++) {
        System.out.println("Masukkan data untuk siswa ke-" + (i + 1));
        System.out.print("Nama : ");
        String name = input.nextLine();
        System.out.print("Alamat : ");
        String address = input.nextLine();
        System.out.print("Umur : ");
        int age = input.nextInt();
        System.out.print("Nilai Matematika : ");
        int math = input.nextInt();
        System.out.print("Nilai Sains : ");
        int science = input.nextInt();
        System.out.print("Nilai Bahasa Inggris : ");
        int english = input.nextInt();
        input.nextLine();

        students[i] = new Student(name, address, age);
        students[i].setMath(math);
        students[i].setScience(science);
        students[i].setEnglish(english);
        students[i].displayMessage();
    }
    /*
    //menggunakan constructor lain
    Student budi = new Student(55, 40, 10);
    budi.setName("Budi");
    budi.setAddress("Jakarta");     
    budi.setAge(19);
    budi.displayMessage();
    
    //menggunakan constructor lain
    System.out.println("===================");
    Student chris = new Student("Chris", "Kediri", 21);
    chris.setMath(30);
    chris.setScience(50);
    chris.setEnglish(40);
    chris.displayMessage();
    
    /*siswa dengan nama anna dirubah informasi alamat dan umurnya melalui constructor
    System.out.println("===================");
    anna = new Student("anna", "Batu", 18);
    anna.displayMessage();

    //siswa denagan nama chris dirubah informasi alamat dan umurnya melalui method
    System.out.println("===================");
    chris.setAddress("Surabaya");
    chris.setAge(22);
    chris.displayMessage();
    */
    input.close();
    } 
}