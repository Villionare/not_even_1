package series;

public class Arrays {
    public static void main(String[] args){

        //ONE DIMENSIONAL ARRAYS

        //this is just declared
        int[] arr;

        //this is allocation
        arr =  new int[5]; //by default all the elements will be initialized to 0 ~ [0,0,0,0,0]

        //this is assigning
        arr[3] = 55;

//        System.out.println(arr[2]);


        //It is possible to combine the declaration of the array variable with the allocation of
        //the array itself, as shown here:
        int[] b = new int[5];
        b[0] = 4;

        //array is declared and initialized in one step
        int[] a = {2,4,5,6};

        //run time error
        //System.out.println(a[6]);

        //MULTIDIMENSIONAL ARRAYS
        int[][] arrM = new int[5][5];
        //{
        // {0,0,0,0,0},
        // {0,0,0,0,0},
        // {0,0,0,0,0},
        // {0,0,0,0,0},
        // {0,0,0,0,0}
        // }

        int k = 0;
        for(int i = 0; i<arrM.length; i++){
            for (int j = 0; j < arrM[i].length; j++) {
            arrM[i][j] = k;
            k++;
            }
        };

        for(int i = 0; i<arrM.length; i++){
            for (int j = 0; j < arrM[i].length; j++) {
                System.out.print(arrM[i][j] + ",");
            }
            System.out.println('\n');
        };

        //here we have allocated for the rows only of 3 rows (first dimension)
        //rest we can manually defile the no of columns in each row. (second dimension)
        int[][] ar = new int[3][];
        ar[0] = new int[3];
        ar[1] = new int[7];
        ar[2] = new int[4];

        //THREE DIMENSIONAL ARRAYS
        int[][][] three = new int[2][3][4];
        //{
        // {
        // {{},{},{},{}},
        // {{},{},{},{}},
        // {{},{},{},{}}
        // },
        // {
        // {{},{},{},{}},
        // {{},{},{},{}},
        // {{},{},{},{}}
        // }
        // }

        int l,m,n;
        for (int i = 0; i < three.length; i++) {
                System.out.print("[");
            for (int j = 0; j < three[i].length; j++) {
                System.out.print("[");
                for (int o = 0; o < three[i][j].length; o++) {
                    System.out.print("0,");
                }
                System.out.print("]");
            }
                System.out.print("]");
        }
    }
}
