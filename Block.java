package Blocks;

public class Block
{
	static
	{
		System.out.println("I am static block"); // execute first
	}
	{
		System.out.println("I am instance block");  // execute secondly
	} 
	public Block()
	{
		System.out.println("I am default constrctor");  //execute when object is created
	}
	public int Block1(int i)
	{
		System.out.println("I am parameterized constructor"); //we have pass argument in constructor
		return 10;
	}
	public void Block2()
	{
		System.out.println("I am block method");  // we have call method through objects
	}
	public static void main(String[] args) 
	{
		Block b= new Block();  // default constructor called
		b.Block1(200);  // parameterized constructor
		b.Block2();   //method calls
	}

}
