package Enum;

interface Works
{
	public void reflectColor();
}

enum Color implements Works
{
	RED(255, 0, 0) 
	{
		@Override
		public void meaning()
		{
			System.out.println("Red represents happiness");
		}

		@Override
		public void reflectColor()
		{
			System.out.println("Reflects red color");
		}
	},
	BLUE(0, 0, 255) 
	{
		@Override
		public void meaning()
		{
			System.out.println("Blue represents peace");
		}

		@Override
		public void reflectColor()
		{
			System.out.println("Reflects blue color");			
		}
	}, 
	BLACK(0, 0, 0) 
	{
		@Override
		public void meaning()
		{
			System.out.println("Black represents darkness");
		}

		@Override
		public void reflectColor()
		{
			System.out.println("Reflects black color");			
		}
	}, 
	YELLOW(255, 255, 0) 
	{
		@Override
		public void meaning()
		{
			System.out.println("Yellow represents friendship");
		}

		@Override
		public void reflectColor()
		{
			System.out.println("Reflects yellow color");			
		}
	}, 
	GREEN(0, 255, 0) 
	{
		@Override
		public void meaning()
		{
			System.out.println("Green represents nature");
		}

		@Override
		public void reflectColor()
		{
			System.out.println("Reflects green color");			
		}
	};
	
	private final int redValue;
	private final int greenValue;
	private final int yellowValue;
	
	private Color(int redValue, int greenValue, int yellowValue)
	{
		this.redValue = redValue;
		this.greenValue = greenValue;
		this.yellowValue = yellowValue;
	}
	
	@Override
	public String toString()
	{
		return "Red: " + this.redValue + ", Green: " + this.greenValue + 
		", Yellow: " + this.yellowValue;
	}
	
	public abstract void meaning(); 
}