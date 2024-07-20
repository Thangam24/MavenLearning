package concept1;

interface Details	{
public void name();
	public void pincode();
	
}
 
public class ParentClass extends ChildClass {
 public void name() {
	System.out.println("My name is Raj");

}
 
 public static void main(String[] args) {
	ParentClass a= new ParentClass();
	a.name();
	a.Hobby();
}
}
