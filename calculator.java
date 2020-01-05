import java.io.*;
class calculator
 {
   public static void main(String args[]) throws IOException
    {
     DataInputStream cal=new DataInputStream(System.in);
     System.out.println("Enter ur choice:");
     System.out.println("1- add  2- multiplication  3- divide 4- subtraction");
     String pp=cal.readLine();
     String ans;
     int choice=Integer.parseInt(pp);
     do
       {
       
      switch(choice)
         {
            case 1:System.out.println("ADDITION");
                   System.out.println("Enter two numbers:");
                   String a=cal.readLine();
                   int aa=Integer.parseInt(a);
                   String b=cal.readLine();
                   int bb=Integer.parseInt(b);
                   int tto=aa+bb;
                   System.out.println("Answer is " + tto);
            case 2:System.out.println("MULTIPLICATION");
                   System.out.println("Enter two numbers:");
                   String c=cal.readLine();
                   int cc=Integer.parseInt(c);
                   String d=cal.readLine();
                   int dd=Integer.parseInt(d);
                   int mul=cc*dd;
                   System.out.println("Answer is " + mul);
            case 3:System.out.println("DIVISION");
                   System.out.println("Enter two numbers:");
                   String e=cal.readLine();
                   int ee=Integer.parseInt(e);
                   String f=cal.readLine();
                   int ff=Integer.parseInt(f);
                   int div=ee*ff;
                   System.out.println("Answer is " + div);
            case 4:System.out.println("SUBTRACTION");
                   System.out.println("Enter two numbers:");
                   String g=cal.readLine();
                   int gg=Integer.parseInt(g);
                   String h=cal.readLine();
                   int hh=Integer.parseInt(h);
                   int sub=gg*hh;
                   System.out.println("Answer is " + sub);


         }
//System.out.println("Do u want to continue:y/n:");
 //ans=cal.readLine();
}while( choice!=5);


}
 }
