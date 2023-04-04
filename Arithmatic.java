// class assignment pgm of inheritance 
class arith{
	 public int add(int a, int b) {
	        return a + b;
	    }
	}

	class Adder extends arith {
	    // This class inherits the add method from Arithmetic
	}

	public class Arithmatic {
	    public static void main(String[] args) {
	        Adder adder = new Adder();
	        int sum = adder.add(21, 10);
	        System.out.println("The Sum is: " + sum);
	    }	
}