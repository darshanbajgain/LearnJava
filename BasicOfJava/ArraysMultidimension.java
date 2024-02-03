import java.util.Scanner;

public class ArraysMultidimension {
    public static void main(String[] args) {
        //decalrea multidimesnion array of 3x3;
        int a[][] = new int [3][3];
        Scanner scan = new Scanner(System.in);

        System.out.println("enter the elements of 3x3 matrix");
        for (int i  = 0; i<3; i++){
            for( int j = 0; j<3; j++){
                a[i][j] = scan.nextInt();
            }
        }
        System.out.println("The matrix formed is :");
        for (int i  = 0; i<3; i++){
            for( int j = 0; j<3; j++){
                System.out.print(a[i][j]+ " ");
            }
                System.out.println();
        }
    }
}
