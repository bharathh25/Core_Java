package in.paper3;
//import java.util.*;
//UserDefined Exception

class MyException extends Exception{
	MyException(String message){
		super(message);
	}
}

public class Q07 {
	public static void main(String[] args) {
		int num = -1;
		try {
			if(num < 0) {
				throw new MyException("Number cant be negative");
			}
		}
		catch(MyException e) {
			System.out.println(e.getMessage());
		}
	}

}
