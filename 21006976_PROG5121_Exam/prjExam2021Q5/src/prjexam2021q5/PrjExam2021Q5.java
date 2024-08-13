
package prjexam2021q5;

import javax.swing.JOptionPane;

public class PrjExam2021Q5 
{

    public static void main(String[] args) 
    {
       
       boolean bStop=false;
       while (bStop==false)
       {
            int iUserInput = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter (1) to display the vowel count"+"\n"
                                                                     +"Enter (2) to display the non vowel count"+"\n"
                                                                     +"Enter (0) to exit","Input",JOptionPane.QUESTION_MESSAGE));
            if(iUserInput==1)
            {
               VowelCount(); //Method call
            }
            else if(iUserInput==2)
            {
               NonVowelCount(); //Method call
            }                 
            else if(iUserInput==0)
            {
               int Selection = JOptionPane.showConfirmDialog(null,"Continue using the applicatiion?","Continue?",JOptionPane.YES_NO_OPTION);
            
               if(Selection==JOptionPane.YES_OPTION)
               {
                 bStop=true;
               }
            }
        }
    }  
    public static void LoadArray()
    {
      String[] arrLetters = {"ABCDE","ZXTYQ","AEIOU","AABBT","WGIOU"};
    }
    public static void VowelCount(String[] arrLetters)
    {
     
        System.out.print("Number of  Vowels in the string: " + count_Vowels(arrLetters[x])+"\n");

        int count = 0;
        for (int x = 0; x < arrLetters[x].length(); x++)
        {
            if (arrLetters[x].charAt(x) == 'a' || arrLetters[x].charAt(x) == 'e' || arrLetters[x].charAt(x) == 'i'
                    || arrLetters[x].charAt(x) == 'o' || str.charAt(x) == 'u')
            {
                count++;
            }
        }
        return count;
        
        
        String strOutput = "Score \t \t \t Result \n";
        strOutput+="------------------------------ \n";
         for(int x=0; x<6; x++)
       {
          strOutput+= "Vowel Score"+ x +"\n";
       }
         
        JOptionPane.showMessageDialog(null,strOutput);
        JOptionPane.showMessageDialog(null,"Score \t \t \t Result"+"\n"
                                           +"");
    }
    public static void NonVowelCount()
    {
        String strOutput = "Score \t \t \t Result \n";
        strOutput+="------------------------------ \n";
         for(int x=0; x<6; x++)
       {
          strOutput+= "Non Vowel Score"+ x +"\n";
       }
         
        JOptionPane.showMessageDialog(null,strOutput);
        JOptionPane.showMessageDialog(null,"Score \t \t \t Result"+"\n"
                                           +"");
    }
}
