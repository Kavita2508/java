package Test;

import java.util.Scanner;

public class Circle {

		
	static final double PI=3.14;
	void Perimeter(double r)
    {
        double P = 2*PI * r ;
  
        System.out.println("Perimeter of the circle is :" + P);
    }

	 void Area(float r)
	    {
	        double A = PI * r * r;
	  
	        System.out.println("Area of the circle is :" + A);
	    }
	
	    public static void main(String[] args)
	    {
	    	Circle obj=new Circle();
	    	 obj.Perimeter(15);
	         obj.Area(5);
	    }
}