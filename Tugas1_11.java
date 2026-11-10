import java.util.Scanner;
public class Tugas1_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        double rataRata;

        System.out.print("Masukkan nilai yang akan diinput : ");
        int banyakNilai = input.nextInt();
        int nilai[] = new int[banyakNilai];

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilai[i] = input.nextInt();
            total += nilai[i];
        }

        rataRata = total / nilai.length;
        System.out.println("Rata-rata nilai : " + rataRata);

        int tertinggi = nilai[0];
        int terendah = nilai[0];
        for (int i = 1; i < nilai.length; i++) {
            if (nilai[i] > tertinggi) tertinggi = nilai[i];
            if (nilai[i] < terendah) terendah = nilai[i];
        }

        System.out.println("Nilai tertinggi " + tertinggi);
        System.out.println("Nilai terendah : " + terendah);

        for (int i = 0; i < nilai.length; i++) {
            String status = (nilai[i] > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai[i] + " (" + status + ")");
        }
    }
}
