import java.util.Scanner;

public class Runner {

    public static int[] takeInput(){

    	int[] input = {60 ,70 ,80 ,100 ,90 ,75 ,80 ,120};

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