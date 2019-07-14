package esdasdasxca;
import java.util.Scanner;
public class Class {
	 

		public static void main (String[] str) {
			 int a, b;
             a=0;
             b=0;
            
              
             
	
            
            System.out.println("1. Арифметика");
            System.out.println("2. Тригонометрія");
            System.out.println("3. Логіка");
            System.out.println("4. Розрядність ");
             
            
	 Scanner action = new Scanner(System.in);
             int n= action.nextInt();
             
             
             Calculator calculator = new Calculator (a, b);
             
            switch (n){
                
                case 1:
                   
            
            do {
                System.out.println ("Input first number : ");
	a = action.nextInt();
	 System.out.println ("Input second number : ");
	
            b = action.nextInt();		 
	
	
	
	System.out.println("Choose action:");

	System.out.println("1. Add");
	System.out.println("2. Subs");
	System.out.println("3. Multi");
	System.out.println("4. Div");
	System.out.println("5. Ostacha");
	System.out.println("0");
	
	System.out.println("Input punct number : ");
	
	  //action = (int) readClass.readNextDouble();
	n = (int)  action.nextInt();
	switch(n) {
                
		case 1 : System.out.println (calculator.dod(a, b));
                        break;
		case 2 : System.out.println (calculator.vid(a, b));
                        break;
		case 3 : System.out.println (calculator.mn(a, b));
                        break;
		case 4 : System.out.println (calculator.dil(a, b));
                        break;
		case 5 : System.out.println (calculator.ost(a, b));
                        break;
		case 6 : 
                        break;
		case 7 : System.out.println ("Choose punct number"); 
		default :  System.out.println ("Not real punct");
}
} while(n != 0);
            break;
           case 2:  
                do{
                System.out.println ("Input number : ");
	a = action.nextInt();
	 
            
                  System.out.println("Choose action:");

	 System.out.println("1. sin");
	 System.out.println("2. cos");
             System.out.println("3. tg");
             System.out.println("4. exp");
             System.out.println("5. sqrt");
             System.out.println("0");
             n = (int)  action.nextInt();
                 switch (n) {
                    case 1 : System.out.println (calculator.sin(a));
                        break;
		case 2 : System.out.println (calculator.cos(a));
                        break;
                     case 3 : System.out.println (calculator.tan(a));
                        break;
                     case 4 : System.out.println (calculator.exp(a));
                        break;
                     case 5 : System.out.println (calculator.pow(a));
                 } }while(n != 0);
                        break;
                 
           case 3 :
               do {
               System.out.println ("Input first number : ");
	a = action.nextInt();
	   System.out.println ("Input second number : ");
	b = action.nextInt();
	 
	
	
	
            
	System.out.println("Choose action:");

	System.out.println("1. >");
	System.out.println("2. =");
	System.out.println("3. <");
  
            System.out.println("4. des => dv");
            System.out.println("5. >>");
            System.out.println("6. <<");
            
            System.out.println("7. a|b");
            System.out.println("8. a&b");
            
           
             System.out.println("0");
           n = (int)  action.nextInt(); 
            switch (n) {
                    case 1 : System.out.println (calculator.bil(a, b));
                        break;
		case 2 : System.out.println (calculator.dor(a, b));
                        break;
                     case 3 : System.out.println (calculator.men(a, b));
                        break;
                         case 4 : System.out.println (calculator.bin1(a));
                        break;
                    case 5 : System.out.println (calculator.rozr1(a));
                        break;
                    case 6 : System.out.println (calculator.rozr2(a));
                        break;
                    case 7 : System.out.println (calculator.or( a,b));
                        break;
                    case 8 : System.out.println (calculator.and(a,b));
                        break;
                     
                    
            } } while(n != 0);
                break;
           
               
        
               
             case 4 :
                 do{
                     boolean bool, bool1;
                 System.out.println ("Input first number : ");
	bool = action.nextBoolean();
                 System.out.println ("Input second number : ");
	bool1 = action.nextBoolean();
                 
            
            System.out.println("Choose action:");

	System.out.println("1. a||b");
            System.out.println("2. a&&b");
            System.out.println("3. a!");
             System.out.println("4. a^b");
 
              System.out.println("Result ="+calculator.logic(bool ,bool1,n));
                 
                 } while(n != 0);
}
}
}