import java.util.Arrays;
import java.util.Scanner;

public class ArraysQuiz {
    public static void main(String[] args){
        Scanner keybd = new Scanner(System.in);

        int [] numbers = {25,14,56,15,36,56,77,18,29,49};
        System.out.println("The numbers in the arrays are: "+ Arrays.toString(numbers));

        System.out.println("Please input a number in the array to find the index value: ");
        int userInp = keybd.nextInt();


        for (int i = 0; i<numbers.length; i++){
            if (numbers[i] == userInp){
                System.out.println("This is the " + userInp + " index location in the array " + i);
            }
        }
/////////
        keybd.nextLine();  // adding a buffer
        String [] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        System.out.println("Values in the array are: " + Arrays.toString(month));

        System.out.println("Please input a month to find the index value: ");
        String usermMonth = keybd.nextLine();


        for (int k = 0; k<month.length; k++){
            if(month[k].equalsIgnoreCase(usermMonth)){
                System.out.println("The index value of " + usermMonth + " is " + k);
            }

        }






    }
}
