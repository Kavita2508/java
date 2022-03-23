package Test;

public class Square {
	void Perimeter(double l)
	 {
       double P = 4*l ;
 
       System.out.println("Perimeter of the square is :" + P);
   }

	 void Area(double l)
	    {
	        double A =   l * l;
	  
	        System.out.println("Area of the square is :" + A);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square obj=new Square();
  	  obj.Perimeter(15);
        obj.Area(5);
	}

}
