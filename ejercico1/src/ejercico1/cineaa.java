package ejercico1;

import java.util.Scanner;

public class cineaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
    char  [][] silla=new char[10][10];
  
    int fila;
    int con;
    String conti;
    boolean segur = true;
   
     for (int i =0; i<10;i++) {
    	 
    	 for (int j=0;j<10;j++){
      silla[i][j]='L';
    	 }
     }
     for(int i=0;i<10;i++) {
    	 
    	 for(int j=0;j<10;j++) {
    		 System.out.print(silla[i][j] + " ");
    		 
    		 }
    	 System.out.println("");
    		 
    	 }
     try {
     do {
    	 System.out.println("para resevar mas entradas di seguir si no poner terminar");
    	 conti=scanner.next();
    	if (conti.equalsIgnoreCase("Seguir")) {
       System.out.println("dime que fila quieres");
       fila= scanner.nextInt();
       System.out.println("dime la comuna");
       con = scanner.nextInt();
       if(silla[fila][con]=='L') {
       silla[fila][con]='O';
       }
       else {
    	  System.out.println("ocupado");
       }
    	   }else {
    		   System.out.println("terminado");
    		   segur = false;
    	   }
       
    	
	for(int i=0;i<10;i++) {
   	 
   	 for(int j=0;j<10;j++) {
   		 System.out.print(silla[i][j] + " ");
   	 }
   	 System.out.println("");
	}
	
	
     }while(segur);
	}catch(Exception e) {
	  System.out.println("ERROR");
	}
	
   		 }
     }
	


