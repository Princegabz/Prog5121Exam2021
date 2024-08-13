
package prjexam2021q4;

import java.util.Scanner;

public class PrjExam2021Q4 
{    
    public static Scanner Keyboard;
    //Variable Declaration
    String strSalonName;
    //Array Declaration
    private static String[] Months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"}; 
    private static double[] count= new double[11];
    public static void main(String[] args) 
    {
        UserInput(); //Method call
        Report(); //Method call
    }
    public static void UserInput() ////Method that requests for user input
    {
        
        Scanner Keyboard = new Scanner(System.in);
        System.out.print("Enter the hair salon name: ");
        String strSalonName  = Keyboard.nextLine();
        
         for(int x=0; x<12; x++)
         {
           System.out.print("Enter customer count for "+Months[x]+" >> " );
           count[x] = Keyboard.nextDouble();
           
           //if statement to test weather or not incorrect values were entered
           if(count[x]<0)
           {
              System.out.print("an incorrect number has been entered please try again");
              System.exit(0); 
           }
         }
        
    }
    public double Average() //Method that calculates the average
    {
        Double Average = (count[0]+count[1]+count[2]+count[3]+count[4]+count[5]+count[6]+count[7]+count[8]+count[9]+count[10]+count[11])/12;
        return Average;
    }
    public void Report()
    {
         System.out.println("------------------------------------------------ \n");
         System.out.println(strSalonName+" Report"+"\n");
         System.out.println("------------------------------------------------ \n");       
         for(int x=0; x<12; x++)
         {
          System.out.print(Months[x]+" >> "+count[x]+" \t "+"(R "+count[x]*120+")"+"\n");
         }
         System.out.println("------------------------------------------------ \n");
         System.out.println("CUSTOMER COUNT: \t "+count[0]+count[1]+count[2]+count[3]+count[4]+count[5]+count[6]+count[7]+count[8]+count[9]+count[10]+count[11]+"\n");
         System.out.println("AVERAGE CUSTOMERS:   \t"+Average()+"\n");        
         System.out.println("------------------------------------------------ \n");        
    }
}
