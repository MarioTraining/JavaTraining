package cyborg.trn.basic.flows;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EcoEx {

	public static void main(String[] args) throws IOException {
		BufferedReader standarIn = new BufferedReader (new InputStreamReader(System.in));
		
		String message;
		
		System.out.println("Enter line of text");
		message = standarIn.readLine();
		System.out.println("Entered: \"" + message + "\"");

	}

}
