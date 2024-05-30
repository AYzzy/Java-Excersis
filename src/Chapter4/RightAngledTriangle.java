package Chapter4;

import java.util.Scanner;

public class RightAngledTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base of the triangle(from 1-10): ") ;
        int triangleBase = input.nextInt() ;

        if (triangleBase<1 ||triangleBase>10){
            System.out.println("The value entered as Exceeded base length");
        }else {
            for( int i =1; i <= triangleBase;i++){
                for(int j =1; j <= i ; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }

    }
}
