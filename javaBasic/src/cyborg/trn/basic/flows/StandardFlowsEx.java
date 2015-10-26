package cyborg.trn.basic.flows;

import java.io.*;

public class StandardFlowsEx {

	public static void main(String[] args) throws IOException{
		int c;
		int counter = 0;
		
		while( (c = System.in.read()) != '\n'){
			counter++;
			System.out.print((char)c);
		}
		
		System.out.println();
		System.err.println( "Counter " + counter + " bytes in total");		
	}

}
