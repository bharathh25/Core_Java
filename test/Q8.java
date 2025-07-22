package in.test;

//Constructor Chaining

class Student{
	Student(){
		this("John",98);
		System.out.println("0 Para const");
	}
	
	Student(String name,int marks){
		System.out.println("1 para const");
		System.out.println(name+" "+marks);
	}
	
}
public class Q8 {
	public static void main(String[] args) {
		new Student();
		
	}

}
