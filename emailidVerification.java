package Practice_projects;

import java.util.Scanner;

public class emailidVerification {
    static  int count=0;
    public static void main(String[] args) {

        String[] emp_email={"abc1@hotmail.com","ijk2@hotmail.com","mno3@hotmail.com","pqr4@hotmail.com","xyz5@hotmail.com"};
        System.out.println("Enter a email id");

        //taking input by the user
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();


        //finding email  in the above array
        for (int i=0;i<emp_email.length;i++){
            if (str.equals(emp_email[i])){
                System.out.println("Got the uses email at index no: "+i+" and email id is : "+emp_email[i]);
                count++;
                break;
            }
        }
        if (count==0){
            System.out.println("Email not found");
        }



    }



}
