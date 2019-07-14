package esdasdasxca;

 
	import java.util.Scanner;

	/**
	 *
	 * @author Volodunur
	 */
	public class Calculator {

	    

		 private double a,b;
	         private int n;
	 
	          Scanner scanner = new Scanner(System.in);
	         
	   //Scanner action = new Scanner(System.in);
		 
		 public Calculator() {
			 this.a=0;
			 this.b=0;
	                 this.n=0;
	              
			  
		 }
		 public Calculator(double a, double b) {
			 this.a=a;
			 this.b=b;
	                 this.n=n;
	                   
		 }
	         
	         
	         

	          
	         
	         
	public double dod(int a,int b) {
		return a+b;
	}
		 
	public double vid(int a,int b) {
		return a - b;
	}
	public double mn(int a,int b) {
		return a*b;
	}
	public double dil(int a,int b) {
		return a/b;
	}
	public double ost(int a,int b) {
		return a%b;
	}
	public double sin(int a) {
		return Math.sin(a);
	}
	public double cos(int a) {
		return Math.cos(a);
	}
	public double tan(int a) {
		return Math.tan(a);
	}
	public double exp(int a) {
		return Math.exp(a);
	}
	public double pow(int a) {
		return Math.sqrt(a);
	}
	public boolean bil(int a,int b) {
		return a>b;
	}
	public boolean dor(int a,int b) {
		return a==b;
	}
	public boolean men(int a,int b) {
		return a<b;
	}
	 public int bin1(int a ) {  
	      
	 
	        
	        String convert = Integer.toBinaryString((int) a);
	        System.out.println(convert);
	             return 0;
	    }    
	 
	    public int rozr1(int a){
	   String convert = Integer.toBinaryString((int) a>>2);
	        System.out.println(convert);
	              return Integer.parseInt( convert, 2);         
	              
	 // return a>>2;
	        }

	    public int rozr2(int a){
	   String convert = Integer.toBinaryString((int) a<<2);
	       //System.out.println(convert);
	              return Integer.parseInt( convert, 2);         
	              
	 // return a>>2;
	        }

	   /* public  int bin2(){
	    return Integer.parseInt( a, 2);
	    
	    }*/
	     
	    public int or (int a,int b){
	        return a|b;
	    }
	     public int and (int a,int b){
	        return a&b;
	    }
	      
	       
	       
	    public boolean logic (boolean a,boolean b, int n){
	        
	              n=scanner.nextInt();
	                   
	               
	               switch(n){
	                   case 1:    
	        return a||b;
	                       
	                   case 2:    
	        return a&&b;
	                        
	                   case 3:    
	        return a^b;
	                        
	                   case 4:    
	        return a!=b;
	               }
	                return false;
	     
	    }
	   
	 }
}
