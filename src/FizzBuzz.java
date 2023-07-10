
public class FizzBuzz {

	public static void main(String[] args) {
		// 1. Let i = 0
		// 2. Loop if i is smaller or equal to 30
		// 3. Each time i+1
		for(int i=1; i<=30; i++) {
			// 4. If i can divide by 3 and 5, print FizzBuzz
			if(i%3==0 && i%5==0) {
				System.out.println("FizzBuzz");
				// 5. If i can divide by 3, print Fizz
			} else if (i%3==0) {
				System.out.println("Fizz");
				// 6. If i can divide by 5, print Buzz
			} else if (i%5==0) {
				System.out.println("Buzz");
				// 7. Else, print i
			} else {
				System.out.println(i);
			}
		}
		
	}

}
