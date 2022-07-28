package MyPackage;

import MyPackage1.NonStaticDiffPackage;

public class NonStaticMethod 
{
	
	public void method4()
	{
		System.out.println("Non Static Method4 From Same Class");
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

