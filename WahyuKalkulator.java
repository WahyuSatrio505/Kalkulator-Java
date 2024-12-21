Berikut adalah codingan Pemrograman Java  saya , jika anda ingin mencobanya di teks editor anda.

import java.util.*;

public class WahyuKalkulator {

    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        float a, b, hasil;
        char operator;

        // Input nilai pertaman anda
        System.out.print("Masukan Nilai Pertaman Kamu : ");
        a = inputUser.nextFloat();

        // Input operator
        System.out.print("Operator (+, -, *, /): ");
        operator = inputUser.next().charAt(0);

        // Input nilai kedua anda
        System.out.print("Masukan Nilai Ke Dua Kamu: ");
        b = inputUser.nextFloat();

        // Menampilkan input dari pengguna
        System.out.println("Input user: " + a + " " + operator + " " + b);

        // Penghitungan berdasarkan operator
        if (operator == '+') {
            hasil = a + b;
            System.out.println("Hasil = " + hasil);

        } else if (operator == '-') {
            hasil = a - b;
            System.out.println("Hasil = " + hasil);

        } else if (operator == '*') {
            hasil = a * b;
            System.out.println("Hasil = " + hasil);

        } else if (operator == '/') {
            if (b != 0) {
                hasil = a / b;
                System.out.println("Hasil = " + hasil);

            } else {
                System.out.println("Kesalahan : Pembagian dengan nol tidak diperbolehkan.");
            }
        } else {
            System.out.println("Operator hasil yang anda input tidak ditemukan.");
        }
    }
}
