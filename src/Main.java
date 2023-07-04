import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // variable

        int i, j; // tipe data integer i dan j, digunakan sebagai tempat penyimapanan data input yang user masukan yang ada didalam perulangan do while loop
                     // tepatnya dalam bagian for loop

        int oddNumbers = 0; // bilangan ganjil(odd Numbers)
                                // program ini sebagai inisialisasi variable.

        // Input user
        Scanner input = new Scanner(System.in); // kelas Scanner, sebagai tool yang digunakan untuk mendapatkan input dari user.
        System.out.print("Input odd number, Please: ");
        int prime = input.nextInt(); // variable prime menunjukan bahwa dia(prime) sebagai tempat penyimpanan dari user input.


        // loop

            // star program

        do {   // Jika memakai DO-WHILE, maka Jalankan hasil program dulu baru setelah itu dijalankan while loopNya.

            while (prime % 2 == 0) { // jika selagi program hasilnya adalah bilangan ganjil,

                // if input user = odd numbers, then print if

                if (prime % 2 == 1) {
                    prime = input.nextInt(); // variable penyimpanan input user akan di teruskan programnya, membentuk menjadi sebuah proram segitiga piramid dalam program piramid.
                }

                // if input user = non-odd numbers, then print else-if

                else if (prime % 2 == 0) {
                    System.out.print("Input odd number, Please: ");
                    input = new Scanner(System.in); // variable kelas ini berfungsi untuk membuat input berjalan.

                    prime = input.nextInt();
                }

            }

            // star pattern: pyramid
                // Program

            System.out.println("[OUTPUT]------> Pyramid: \n");

            for (i = 1; i <= prime; i++) {
                for (j = i; j <= prime; j++) {
                    System.out.print("  ");
                }

                for (j = 1; j < i; j++) {
                    if ( i==prime || j==1 )
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }

                for (j = 1; j <= i; j++) {
                    if ( i==prime || j==i )
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
                System.out.println();
            }

            // while loop program:

        }  while (prime == oddNumbers); // if  while variable prime equals odd Numbers.
                                            // berarti jika variable prime sebagai tempat menyimpannya user input/input user sama dengan odd Numbers(bilangan Ganjil)
                                            // maka while loop dijalankan.
    }
}
