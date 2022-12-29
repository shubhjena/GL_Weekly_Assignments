package src.W1_OOPS_Shapes.dao;

import src.W1_OOPS_Shapes.beans.*;
import java.util.Scanner;

public class SquareDao {

    public static void setDimensions(Square square){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of Square(mm): ");
        square.setSide(sc.nextDouble());
        sc.close();
    }

   public static void getDetails(Square square){
        square.displayDetails();
    }
}
