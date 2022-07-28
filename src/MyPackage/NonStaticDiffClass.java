package MyPackage;

import MyPackage1.NonStaticDiffPackage;

public class NonStaticDiffClass 
{
public void method5()
{
System.out.println("Non Static Method5 From Different Class");	
}
	public static void main(String[] args) 
	{
		NonStaticDiffClass B = new NonStaticDiffClass();
		B.method5();
		NonStaticMethod A = new NonStaticMethod();
		A.method4();
		NonStaticDiffPackage C = new NonStaticDiffPackage();
		C.method6();
	}
}
