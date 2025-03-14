package praktikum.modul2;

public class Student {

    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    private static int jumlahObjek;

    public Student(String n, String a, int ag) {
        name = n;
        address = a;
        age = ag;
        jumlahObjek++;
    }

    public Student(double math, double english, double science) {
        mathGrade = math;
        englishGrade = english;
        scienceGrade = science;
        jumlahObjek++;
    }

    public void setName(String n) {
        name = n;
    }

    public void setAddress(String a) {
        address = a;
    }

    public void setAge(int ag) {
        age = ag;
    }

    public void setMath(int math) {
        mathGrade = math;
    }

    public void setEnglish(int english) {
        englishGrade = english;
    }

    public void setScience(int science) {
        scienceGrade = science;
    }

    private double getAverage() {
        average = (mathGrade + scienceGrade + englishGrade) / 3;
        return average;
    }

    //Untuk menentukan status akhir
    public boolean statusAkhir(double average) {
        if (average >= 61) {
            System.out.println("Status : Lulus");
            return true;
        } else {
            System.out.println("Status : Remidi");
            return false;
        }
        
    }

    // Method untuk mengembalikan nilai jumlahObjek
    public static int getJumlahObjek() {
        return jumlahObjek;
    }
    
    public void displayMessage() {
        System.out.println("Siswa dengan nama " + name);
        System.out.println("beramalat di " + address);
        System.out.println("berumur " + age + " tahun");
        System.out.println("mempunyai nilai rata rata " + getAverage());
        statusAkhir(average);

        //Memanggil method jumlahObjek
        System.out.println("Jumlah objek yang telah dibuat: " + getJumlahObjek());
        
    }
}