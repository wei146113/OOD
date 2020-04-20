import java.util.Scanner;
import java.text.DecimalFormat;
public class Module_2 {
	
	public static void main(String[] args) {

        String str1, str2, str3;
        double q1,q2,q3;
        double p1,p2,p3;
        double t1,t2,t3;
        double sub,tax,total;
        Scanner scanner = new Scanner(System.in);
     
        System.out.println("Input name of item1");
        str1 = scanner.nextLine();
        
        System.out.println("Input quanity of item1");
        q1 = scanner.nextDouble();
        
        System.out.println("Input price of item1");        
        p1 = scanner.nextDouble();
        
        Scanner scanner1 = new Scanner(System.in);
        
        System.out.println("Input name of item2");
        str2 = scanner1.nextLine();
        
        System.out.println("Input quanity of item2");
        q2 = scanner1.nextDouble();
        
        System.out.println("Input price of item2");        
        p2 = scanner1.nextDouble();
        
        Scanner scanner2 = new Scanner(System.in);
        
        System.out.println("Input name of item3");
        str3 = scanner2.nextLine();
        
        System.out.println("Input quanity of item3");
        q3 = scanner2.nextDouble();
        
        System.out.println("Input price of item3");        
        p3 = scanner2.nextDouble();
       
        t1 = p1*q1;
        t2 = p2*q2;
        t3 = p3*q3;
        
        sub = p1*q1 + p2*q2 + p3*q3;
        
        tax = sub*(0.0625);
        DecimalFormat df = new DecimalFormat("#.##");
        tax = Double.parseDouble(df.format(tax));
        
        total = sub + tax;
        System.out.printf("Your bill\n");
        System.out.printf("Item                Quantity  Price     Total          \n");
        System.out.printf("%-20s%-10.2f%-10.2f%-10.2f\n",str1,q1,p1,t1);
        System.out.printf("%-20s%-10.2f%-10.2f%-10.2f\n",str2,q2,p2,t2);
        System.out.printf("%-20s%-10.2f%-10.2f%-10.2f\n",str3,q3,p3,t3);
        System.out.printf("Subtotal%-37.2f\n",sub);
        System.out.printf("6.25%% sale tax%31.2f\n",tax);		
        System.out.printf("Total%40.2f\n",total);
        
        
        
      
        /*
        System.out.println("Subtotal = "+sub);  
        System.out.println("6.25% sale tax = "+tax); 
        System.out.println("Total = "+total); 
        */

    }


		
		
		
		 
	}


