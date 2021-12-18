//كتب بواسطة غتدة واسرار ووفاء وليان 
package project;
import java.util.Scanner;
public class Project {// Start class 
    public static void main(String[] args) {// Start main
     // calling 
     Scanner input= new Scanner (System.in);
     int []array=new int[5];//The size array
    System.out.print("Please Enter Five numbers :");//Ask ueser input 5 num
    for (int i=0;i<array.length;i++){// start for 
    boolean isNumUeser; 
    if(input.hasNextInt())//Check if ueser input numbers 
    { //Start if 
    array[i]=input.nextInt();//ueser input num
     isNumUeser=true;// it is mean a ueser input num
    }//End if
    else{//Start else
    System.out.println("I Donâ€™t Understand You  Pleas Try Again (with only integer num)");
    isNumUeser=false;// it is mean a ueser donâ€™t input num
    input.next();//to try again
    if(!isNumUeser)//ues to check input num 
     {//Start if
     array[i]=input.nextInt(); //a size  to corract 5 
     } //End if   
     }//End else    
     }//end for 
     System.out.println("Choose a Numbers 1-(if you want method of  Squareroot )"+"2-(if you want method of pow)"+"3-((if you want method of DivBy5And6)"+"4-(if you want method MultiplyBy3Method");
     //Ask ueser what oparation he/she want
     char h;//ues character to do if statment to ask dowan 
     do{
     int num =input.nextInt();//Aske ueser to input num of oparation he/she want
     switch(num){// start switch to choice
     case 1:System.out.println("The result is:");
         Squareroot(array);//calling opration Squareroot
     break;//stop
     case 2: System.out.println("Please Enter the Exponent: ");//if ueser input 2 the ask about Exponent he/she want 
     int Exponent=input.nextInt();//to mean input Exponent
     System.out.println("The result is:");
     pow(array, Exponent);//calling oparation pow
     break;//stop
      case 3:System.out.println("The result is:");
          DivBy5And6(array);//calling oparation DivBy5And6
      break;//stop 
      case 4:System.out.println("The result is:");
         for(int i=0;i<array.length;i++){
             int Multiply =array[i];
             System.out.println("The Multiply of "+array[i]+" the array by 3 is " +  MultiplyBy3Method(Multiply));
         }//end for 
      break; 
      default:System.out.println("Invalid choice ");//if ueser enter another num 
     }//End switch
     System.out.println("");//to space 
     System.out.println("If You want to ues another  method enter y or n if you want to end the programing ");//Ask ueser if he/she want to use another opration or not
     h=input.next().charAt(0);//we are ues character 
     if (h=='n'||h=='N'){//if not uese chr n or N
         break;}//stop
    System.out.println("Please Enter numbers of method you want to use:");//enter num of opraction ypu want 
     }while(h=='y'||h=='Y') ; //if yes enter y or Y 
    }// End main
    public static void  Squareroot (int []array){// Start Squareroot 
    double result=0;
    for (int i=0;i<array.length;i++){// start for
     result= Math.sqrt(array[i]);
    
     System.out.printf("The Squareroot of %d is %.2f\n",array[i],+result);
     }// End for 
    }// End Squareroot
    public static void  pow (int []array,int Exponent ){// Start pow   
      int result =0;
    for (int i=0;i<array.length;i++){// Start for 
     result=(int)Math.pow(array[i], Exponent);
      System.out.println("The Pow of  "+array[i]+"is"+result);
    } //End for
    }// End pow 
     public static void  DivBy5And6(int []array){// start  DivBy5And6
     for ( int i=0;i<array.length;i++){//start for
     if (array[i]%5==0 && array[i]%6==0) {//start if
     System.out.println("The numbers is divisible by 5 and 6 is "+array[i]);
     }//end if
     else{//start eles 
     System.out.println(array[i]+"This  numbers is not divisible by 5 and 6 ");
     }//end else 
     } //End for 
     }//End  DivBy5And6 
     public static int MultiplyBy3Method(int m){//start multiplyBy3Method 
         int result = m*3;
         return result ;
     }//end multiplyBy3Method    
     
}// End class