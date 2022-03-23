

public class Student {
  int id;
  String name;
  
  Student(int id, String name)
  {
	 this.id=id;
	 this.name=name;
  }
  public void Print() {
	  System.out.println(id+" "+name);
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(21,"Kavita");
		Student s2=new Student(22,"Swati");
		
        s1.Print();
        s2.Print();

	}

}
