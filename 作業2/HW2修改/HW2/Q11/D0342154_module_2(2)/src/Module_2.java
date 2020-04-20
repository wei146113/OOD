import java.util.Scanner;
import java.text.DecimalFormat;
import java.math.BigDecimal; 
public class Module_2 {
	
	public static void main(String[] args) {

        String str1, str2, str3;
        int q1,q2,q3;
        int p1,p2,p3,total,score;
        
        double percent;
        Scanner scanner = new Scanner(System.in);
     
        System.out.println("Name of excercise 1:");
        str1 = scanner.nextLine();
        
        System.out.println("Score received for excercise 1:");
        q1 = scanner.nextInt();
        
        System.out.println("Total points possible for excercise 1:");        
        p1 = scanner.nextInt();
        
        Scanner scanner1 = new Scanner(System.in);
        
        System.out.println("Name of excercise 2");
        str2 = scanner1.nextLine();
        
        System.out.println("Score received for excercise 2:");
        q2 = scanner1.nextInt();
        
        System.out.println("Total points possible for excercise 2:");        
        p2 = scanner1.nextInt();
        
        Scanner scanner2 = new Scanner(System.in);
        
        System.out.println("Name of excercise 3");
        str3 = scanner2.nextLine();
        
        System.out.println("Score received for excercise 3");
        q3 = scanner2.nextInt();
        
        System.out.println("Total points possible for excercise 3");        
        p3 = scanner2.nextInt();
       
       
        score = q1+q2+q3;
        total = p1+p2+p3;
        //percent = (score/total)*100;
        
       percent=((float)score/total)*100;

        
         /*System.out.printf( ""+(score/total));
       
       percent = new BigDecimal(percent)
                .setScale(2, BigDecimal.ROUND_HALF_UP)
                .doubleValue();
      
        
        DecimalFormat df = new DecimalFormat("#.##");
        percent = Double.parseDouble(df.format(percent));
        */
      
       
       
        
        System.out.println ( String.format("%-10s %-10s %-15s", "Excercise","Score","Total Possible") );
        
        System.out.println(String.format("%-10s %-10d %-15d",str1,q1,p1));
        System.out.println(String.format("%-10s %-10d %-15d",str2,q2,p2));
        System.out.println(String.format("%-10s %-10d %-15d",str3,q3,p3));
        System.out.println(String.format("%-10s %-10d %-15d","Total",score,total));
        System.out.printf("Your total is %d out of %d ,or %.2f",score,total,percent);		
       
        
      
       

    }


		
		
		
		 
	}


