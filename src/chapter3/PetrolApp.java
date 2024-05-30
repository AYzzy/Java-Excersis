package chapter3;

import java.util.Scanner;

public class PetrolApp {
    public static void main(String[] args) {
        Petrol petrol = new Petrol ("Ikeja", "Diesel", 10, 980.00, 2.00) ;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the location: ") ;
        String location = input.nextLine() ;
        petrol.setLocation(location);

        System.out.print("Enter the type of Petrol: ") ;
        String type = input.nextLine();
        petrol.setType(type);

        System.out.print("Enter quantity of litres you bought: ") ;
        int quantity = input.nextInt();
        petrol.setQuantity(quantity);

        System.out.print("Enter price per litre: ") ;
        double pricePerLitre = input.nextDouble();
        petrol.setPricePerLitre(pricePerLitre) ;

        System.out.print("How many percent discount did you get? ") ;
        double percentageDiscount = input.nextDouble() ;
        petrol.setPercentageDiscount(percentageDiscount) ;

        System.out.printf("I went to %s, and i bought %d litres of %s sold for %.2f per litre and i was given %.0f percent discount", petrol.getLocation(), petrol.getQuantity(), petrol.getType(), petrol.getPricePerLitre(), petrol.getPercentageDiscount());

        System.out.printf("%n%nTotal amount to be paid = #%.2f", petrol.getNetAmount()) ;


    }
}
