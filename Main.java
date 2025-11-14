import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //create object to read inputs ,declare variables(Frist number "FN" , second number "SN" and operation "op")
        System.out.println("hello! it is simple calculator you only add two numbers , please add frist number ");
        Scanner input = new Scanner(System.in);
        double FN= input.nextDouble();
        System.out.println("FN is: "+FN+"\n now enter operation between + , - ,*,/ \n or if you need use math library");
        System.out.println(" \n enter \"pow\" for power (x power y )  \n add your operation: ");
        String op = input.next();
        op=op.toLowerCase();
        System.out.println("enter second number");
        //using switch to give user result
        boolean CM=true;
        double result=0;
        while(CM==true) {
            double SN = input.nextDouble();
            switch (op) {
                case "+":
                    System.out.println("result: " + (FN + SN));
                    result=FN + SN;
                    CM=false;
                    break;
                case "-":
                    System.out.println("result: "+(FN - SN));
                    result=FN - SN;
                    CM=false;

                    break;
                case "*":
                    System.out.println("result: " + (FN * SN));
                    result=FN * SN;
                    CM=false;

                    break;
                case "/":
                    if (SN == 0) {
                        System.out.println("Error,try again\n enter second number:");
                        continue;
                    }
                    System.out.println("result: " + (FN / SN));
                    result=FN / SN;
                    CM=false;

                    break;
                case"pow":
                    System.out.println("result: " + Math.pow(FN, SN));
                    result=Math.pow(FN, SN);
                    CM=false;
                    break;
                    default:
                        System.out.println("Invalid input");
                        CM=false;

            }
            //use if else statement
            System.out.println("do you want use absolute Value or square root ?\n enter sqr to use square root \t enter abs to use absolute Value\t enter any value to refuse");
            op = input.next();//Reusing the same variable to save memory
            op=op.toLowerCase();
            if(op.equals("sqr"))
                System.out.println("result: "+Math.sqrt(result));
            else if(op.equals("abs"))
                System.out.println("result: "+Math.abs(result));
            System.out.println("that's your last result: "+result+", thanks for use my calculator");
            //end if else statement





        }




    }}
