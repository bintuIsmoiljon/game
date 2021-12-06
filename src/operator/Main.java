package operator;

import java.util.Scanner;


public class Main {
	
public static void main(String[] args) {
	while(true) {
	Scanner kalkulyator=new Scanner(System.in);
	int raqam1=0;
	int raqam2=0;
	char amal;
	double javob=0.0;
	System.out.println("Birinchi raqamni kiriting:");
	raqam1=kalkulyator.nextInt();
	System.out.println("Ikkinchi raqamni kiriting:");
	raqam2=kalkulyator.nextInt();
	System.out.println("Tanlangan amalni kiriting:");
	amal=kalkulyator.next().charAt(0);
	
	switch(amal) {
	case'-':{
		System.out.println(raqam1-raqam2);
		break;
	}
	case'+':{
		System.out.println(raqam1+raqam2);
		break;
	}
	case'*':{
		System.out.println(raqam1*raqam2);
		break;
	}
	case'/':{
		System.out.println(1.0*raqam1/raqam2);
		break;
	}
	case'%':{
		System.out.println(raqam1%raqam2);
		break;
	}
	
	    default:{
		System.out.println("Bunday buyruq mavjud emas!");
	    }
	}
	String s;
	  System.out.println("Yana ishlatasizmi? (yes/no)");
	  s=kalkulyator.next();
	  if(s.equals("no"))break;
   
	   }
        
   }

}


