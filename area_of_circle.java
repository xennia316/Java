/**
 * Scanning the radius of a circle and finding its corresponding area.
 * by xennia316@github.com
 */

import java.util.Scanner;

 public class  AreaOfcircle
 {
    public class void main(string arg[])
    {
        scanner s = new Scanner(System.in);

        System.out.println("Enter radius of the circle: ");
        double r = s.nextDouble();
        double area = (22 * r * r) / 7;

        System.out.println("Area of circle is: "+area);
        
    }
 }     