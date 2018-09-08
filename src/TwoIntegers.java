
public class TwoIntegers 
{
	private int integer1;
	private int integer2;
	
	public TwoIntegers(int integer1, int integer2)
	{
		this.integer1 = integer1;
		this.integer2 = integer2;
	}
	public int getInteger1()
	{
		return integer1;
	}
	public void setInteger1(int integer1)
	{
		this.integer1 = integer1;
	}
	public int getInteger2()
	{
		return integer2;
	}
	public void setInteger2(int integer2)
	{
		this.integer2 = integer2;
	}
	public String Arithmetic()
	{
		return integer1 + " + " + integer2 + " = " + (integer1 + integer2) + " , "
		+ integer1 + " - " + integer2 + " = " + (integer1 - integer2) + " , "
		+ integer1 + " * " + integer2 + " = " + (integer1*integer2) + " , "
		+integer1 + " / " + integer2 + " = " + (integer1/integer2) + " , "
		+ integer1 + " % " + integer2 + " = " + (integer1%integer2);
		
	}
	public int Larger()
	{
		if(integer1 > integer2)
		{
			return integer1;
		}
		else if(integer1 < integer2)
		{
			return integer2;
		}
		else
		{
			return integer1;
		}
	}
	public boolean isEven()
	{
		if((integer1 + integer2) % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean isMultiple()
	{
		if(integer2 % integer1 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
