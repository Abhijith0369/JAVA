package abhijith;

import java.util.Scanner;

class Complex
{
	int real;
	int imag;
    Complex(int r,int i)
    {
    	real=r;
    	imag=i;
    }
Complex add(Complex c)
{
	return new Complex(real+ c.real,imag +c.imag);
}
void display()
{
	System.out.println(real + "+" +imag + "i");
}
}
public class Complexaddition
{

	public static void main(String[] args)
	{
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter first Complex number:");
	 System.out.print("Enter real part:");
	 int r1 = sc.nextInt();
	 System.out.print("Enter imaginary part:");
	 int i1 =sc.nextInt();
	 System.out.println("Enter second complex number:");
	 System.out.print("Enter real part:");
	 int r2 =sc.nextInt();
	 System.out.print("Enter imaginary part:");
	 int i2=sc.nextInt();
	 Complex c1 = new Complex(r1,i1);
	 Complex c2 = new Complex(r2,i2);
	 Complex sum = c1.add(c2);
	 System.out.print("sum of complex numbers:");
	 sum.display();
	 sc.close();
	}
}

