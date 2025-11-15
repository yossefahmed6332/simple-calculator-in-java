import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //create object to read inputs ,declare variables(Frist number "FN" , second number "SN" and operation "op")
        System.out.println("hello! it is simple calculator you only add two numbers , please add frist number ");
        Scanner input = new Scanner(System.in);
        boolean FNB=true;
        double FN=0;
        //check frist number
        while(FNB){
        if(input.hasNextDouble()){//make sure frist number is a number
            FN=input.nextDouble();
            FNB=false;}
        else{
            System.out.println("it is not a number! , try again");
            input.next();
            continue;}
        }
//frist number completed
        System.out.println("yours is: "+FN+"\n now enter operation between + , - ,*,/ \n or if you need use math library");
        System.out.println(" \n enter \"pow\" for power (x power y )  \n add your operation: ");

        //using switch to give user result
        boolean CM=true;
        double result=0;
            String op ="";


            //check input operation
            while(CM){
                op=input.next().toLowerCase();
                if (!op.equals("*") && !op.equals("-") && !op.equals("+") && !op.equals("/") && !op.equals("pow")) {
                    System.out.println("it is not operation !,enter your operation: ");
                    continue;
            }
            //second number
            System.out.println("enter second number");
            double SN=0;
            boolean SNB=true;

        //give result and check operation
                    while(CM==true) {


                        while(SNB){ //loop to check second number
                            if(input.hasNextDouble()) {
                                SN=input.nextDouble();
                                SNB=false;
                            }
                            else {
                                System.out.println("it is not a number! , try again");
                                input.next();
                                continue;
                            }}

                        //second number completed !


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
                    boolean iffordivision=true;
                    if (SN == 0||!input.hasNextDouble()) {

                        System.out.println("Error,try again\n enter second number:");
                        SN = input.nextDouble();
                        continue;
                        //check second number user input zero
                    }
                    else {
                        System.out.println("result: " + (FN / SN));
                        result = FN / SN;
                        iffordivision = false;
                    }
                    break;
                case"pow":
                    System.out.println("result: " + Math.pow(FN, SN));
                    result=Math.pow(FN, SN);
                    CM=false;
                    break;

                    default:
                        System.out.println("Invalid input, enter operation and second number again");
                        continue;

            }}
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
