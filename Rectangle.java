package Test;

public class Rectangle {
	
	void Perimeter(double l, double b)
	 {
        double P = 2*(l + b);
  
        System.out.println("Perimeter of the reactangle is :" + P);
    }

	 void Area(double l, double b)
	    {
	        double A =   l * b;
	  
	        System.out.println("Area of the rectangle is :" + A);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle obj=new Rectangle();
  	  obj.Perimeter(15,10);
        obj.Area(5,10);
	}

}
