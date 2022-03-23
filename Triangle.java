package Test;

public class Triangle {
	
	void Area(double b, double h)
	 {
       double A = 0.5*(h * b);
       System.out.println("Area of the triangle is :" + A);

 
   }

	 void Perimeter(double a, double b, double c)
	    {
	        double P =   a+b+c;
	        System.out.println("Perimeter of the triangle is :" + P);

	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle obj=new Triangle();
	  	  obj.Perimeter(15,10,7);
	        obj.Area(5,8);
	}

}
