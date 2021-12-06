package operator;

import java.util.*;

public class LocalTime{
	
    public static void main(String []args){
    	
    	 Scanner scan = new Scanner(System.in);
    	 Random random = new Random();
    	 
    	   int s=0;
    	   long startTime=0,endTime=0;
    	   boolean t=true;
    	 
            while (true){
        	//int a=0;
            if(t){
            s = random.nextInt(50);
            startTime=System.currentTimeMillis();
            t=false;
            }
            //System.out.print("Komp tahmin qilgan son: "+s);
            int b = scan.nextInt();
               if (s==b) {
                	endTime= System.currentTimeMillis();
                    System.out.println("To'g'ri raqam!TABRIKLAYMIZ(" + (endTime-startTime)/1000 + " soniyada toptingiz)!");
                    t=true;
                }
                else if (b>s) {
                    System.out.println("Katta raqam kirittingiz!");
                }
                else if (b<s) {
                    System.out.println("Kichik raqam kirittingiz!");
                } 
                if(t) {
                    System.out.println("Yana urinib ko'rasizmi?(ha/yo'q):");
                    String string=scan.next();
                    if(string.equals("yo'q"))break;
                }
        }
    }
}


