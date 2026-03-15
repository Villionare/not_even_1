public class Two_dimesional_array {
    public static void main(String[] args) {
//        int[][] arr = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}};
//
////        System.out.println(arr[2][1]);
//
//        for (int[] row: arr){
////            System.out.println(row);
//            for (int col: row){
//                System.out.print(col);
//            }
//            System.out.print("\n");
//        }


        char[][] telephone = {
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'},
                {'*', '0', '#'}
        };

        for (char[] i : telephone) {
            for (char num : i) {
                System.out.printf("%c", num);
            }
            System.out.print("\n");
        }
    }
}
