package cyborg.trn.basic.flows;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardEx {
	
	public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	
	public static String readString(){
		String cadena = "";
		try{
			cadena = new String(entrada.readLine());
		}catch(IOException e){
			System.out.println("E/S Error:" + e.toString());
		}
		
		return cadena;
	}

	public static int readInt(){
		int entero = 0;
		boolean error = false;
		
		do{
			try{
				error = false;
				entero = Integer.valueOf(entrada.readLine()).intValue();		
			}catch(NumberFormatException e1){
				error = true;
				System.out.println("Error en el formato del numero, intentelo de nuevo");
			}catch(IOException e){
				System.out.println("E/S Error");
			}
			
		}while(error);
		
		return entero;
	}
}
