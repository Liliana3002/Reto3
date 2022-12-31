import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RetoEje3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);//Creación objeto scanner y el nombre de la clase Scanner
		System.out.println("Digite un número:" );
		int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
        
        if(N%2!=0){
            System.out.println("Weird");
        }
        else if(N%2==0 && N<=5 && N>=2){
             System.out.println("Not Weird");

        }
        else if(N%2==0 && N<=20 && N>=6){
             System.out.println("Weird");
    }
    else if(N%2==0 && N>20){
             System.out.println("Not Weird");
     
	}
	}}

