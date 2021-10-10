//import java.util.Scanner;

//Application for printing out the useful information about Java integer primitives
public class PrimitivesinformationAppl {

	public	static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);//input data from the console
		while(true) {
			System.out.println("enter primitive type(long, int, short, char, byte) or exit");
			String line = scanner.nextLine();
			if (line.equals("exit")) {
				break;
			}
			printInformationByType(line);
		}
		System.out.println("thanks for using our application & bye");
	}

	private static void printInformationByType(String line) {
		// your homework should contain switch by the given type(long, int, short, char, byte)
		//for default there should be out: wrong primitive type
		//for each type there should be an appropriate method of printing information of the type
		//for example, printCharInformation - method printing out the info about type "char"
	    byte minValue = 1;
		byte maxValue = 1;
		int nBits = 1;
		while(minValue > 0) {
			minValue = (byte)  (minValue * 2);//compiler casts minValue to int,multiplies on2
			nBits = nBits + 1;
		}
		maxValue = (byte) (minValue - 1);
		System.out.printf("minimal value is %d, maximal value is %d, number of bytes is %d\n",(int)minValue, (int)maxValue,nBits / 8);
	}
}
