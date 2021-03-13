import java.util.Scanner;

public class Runner {

    public static int[] takeInput(){
	Scanner sc = new Scanner(System.in);
	int size = sc.nextInt();
    	int[] input = new int[size];

    	if (size == 0) {
    		return input;
    	}

    	for(int i = 0; i < size; i++) {
    		input[i] = sc.nextInt();
    	}

    	return input;
    }

    public static void printArray(int[] arr) {
    	for (int i = 0 ; i < arr.length; i++) {
    		System.out.print(arr[i] + " ");
    	}

    	System.out.println();
    }

    public static void main(String[] args) {
    	int[] input = takeInput();

    	int[] output = Solution.stockSpan(input);

    	printArray(output);

    }
}