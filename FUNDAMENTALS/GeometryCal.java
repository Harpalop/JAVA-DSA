package FUNDAMENTALS;

import java.util.Scanner;

public class GeometryCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== GEOMETRY MASTER CALCULATOR ===");
            System.out.println("1. Circle (Area & Perimeter)");
            System.out.println("2. Triangles (Basic & Isosceles Area)");
            System.out.println("3. Equilateral Triangle (Area & Perimeter)");
            System.out.println("4. Rectangle & Parallelogram (Area & Perimeter)");
            System.out.println("5. Square & Rhombus (Area & Perimeter)");
            System.out.println("6. 3D Volumes (Sphere, Cylinder, Cone, Cube)");
            System.out.println("7. Exit ('x')");
            System.out.print("Choose a shape to calculate: ");
            
            String choice = sc.next();

            if (choice.equalsIgnoreCase("x") || choice.equals("7")) {
                System.out.println("Calculator closed. Great job!");
                break;
            }

            switch (choice) {
                
                case "1": 
                    System.out.print("Enter radius: ");
                    double r = sc.nextDouble();
                    System.out.println("Area of Circle: " + (Math.PI * r * r));
                    System.out.println("Perimeter of Circle: " + (2 * Math.PI * r));
                    break;
                    
                case "2": 
                    System.out.print("Enter base: ");
                    double b = sc.nextDouble();
                    System.out.print("Enter height: ");
                    double h = sc.nextDouble();
                    System.out.println("Area of Triangle / Isosceles: " + (0.5 * b * h));
                    break;
                    
                case "3": 
                    System.out.print("Enter side length: ");
                    double a = sc.nextDouble();
                    System.out.println("Area of Equilateral Triangle: " + ((Math.sqrt(3) / 4) * a * a));
                    System.out.println("Perimeter of Equilateral Triangle: " + (3 * a));
                    break;
                    
                case "4": 
                    System.out.print("Enter length / base: ");
                    double length = sc.nextDouble();
                    System.out.print("Enter width / height: ");
                    double width = sc.nextDouble();
                    System.out.println("Area: " + (length * width));
                    System.out.println("Perimeter: " + (2 * (length + width)));
                    break;
                    
                case "5": 
                    System.out.print("Enter side length: ");
                    double side = sc.nextDouble();
                    System.out.print("Enter diagonal 1 (for Rhombus area): ");
                    double d1 = sc.nextDouble();
                    System.out.print("Enter diagonal 2 (for Rhombus area): ");
                    double d2 = sc.nextDouble();
                    System.out.println("Perimeter of Square/Rhombus: " + (4 * side));
                    System.out.println("Area of Rhombus: " + (0.5 * d1 * d2));
                    break;
                    
                case "6": 
                    System.out.print("Enter radius (for Sphere, Cylinder, Cone): ");
                    double rad = sc.nextDouble();
                    System.out.print("Enter height (for Cylinder, Cone): ");
                    double height = sc.nextDouble();
                    System.out.print("Enter side length (for Cube): ");
                    double cubeSide = sc.nextDouble();
                    
                    System.out.println("Volume of Sphere: " + ((4.0 / 3.0) * Math.PI * Math.pow(rad, 3)));
                    System.out.println("Volume of Cylinder: " + (Math.PI * rad * rad * height));
                    System.out.println("Volume of Cone: " + ((1.0 / 3.0) * Math.PI * rad * rad * height));
                    System.out.println("Curved Surface Area of Cylinder: " + (2 * Math.PI * rad * height));
                    System.out.println("Total Surface Area of Cube: " + (6 * cubeSide * cubeSide));
                    break;
                    
                default:
                    System.out.println("Invalid input. Please type a number from 1 to 7.");
            }
        }
        
        sc.close();
    }
}