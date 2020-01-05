import java.io.*;
class hi
{
	public static  void main(String arg[]) throws IOException
{
	DataInputStream in=new DataInputStream(System.in);
       	System.out.println("Enter no");
	String st=in.readLine();
                int a=Integer.parseInt(st);
	System.out.println(a);
}
}