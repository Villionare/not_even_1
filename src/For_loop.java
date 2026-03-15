//public class For_loop {
//    public static void main(String[] args) {
//
//        for (int i = 0; i<=9; i++){
//
//            for (int j = 0; j <=9; j++){
//
//                for (int k = 0; k <=9; k++){
//
//                    if (i!=j && j!=k && k!=i){
//                        if ((i + j + k) % 5 == 0){
//                            System.out.printf("%d%d%d", i,j,k);
//                            System.out.printf("\n");
//                        }
//                    }
//                }
//            }
//        }
//    }
//}

import java.util.Scanner;

public class For_loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Pascle Triangle Genrator:");
//        System.out.println("Enter the no of rows in the triangle:");
//        int rows = scanner.nextInt();
//
//        for (int i = 1; i <= rows; i++){
//            for (int j = 1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.print("\n");

        System.out.println("Enter the no of rows and columns:");
        System.out.println("rows");
        int rows = scanner.nextInt();

        System.out.println("Columns");
        int columns = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= columns; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        scanner.close();
    }
}