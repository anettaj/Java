import java.io.*;
class read_add2no
  {
   public static void main(String args[]) throws IOException
     {
       DataInputStream add=new DataInputStream(System.in);
       System.out.println("enter two numbers:");
       String a=add.readLine();
       int aa=Integer.parseInt(a);
       String b=add.readLine();
       int bb=Integer.parseInt(b);
       int tto=aa+bb;
       System.out.println("Answer is " + tto);
     }
}
