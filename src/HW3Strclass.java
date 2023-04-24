package classe2;

import java.util.Scanner;

//Write a program that reads two people's first
//names and if they expecting boy or girl?
//Based on the input suggests a name for a baby:
//Example Output:
//Mom’s first name? Mary
//Dad’s first name? Daniel
//Boy or Girl? boy
//Suggested baby name: DANRY
public class HW3Strclass {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter mom first name?");
        String mom= scanner.next();
        System.out.println(" Enter dad first name?");
        String dad= scanner.next();
        System.out.println("Enter gender name");
        String gender= scanner.next();
        String babyname;
        if (gender.equalsIgnoreCase("boy")){
           babyname=(dad.substring(0,3)+mom.substring(mom.length()-2));
        } else if (gender.equalsIgnoreCase("girl")) {
            babyname=(mom.substring(0,2)+dad.substring(dad.length()-3));
            System.out.println("Suggested baby name: "+babyname);

        }


    }

}
