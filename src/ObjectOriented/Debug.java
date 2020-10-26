package ObjectOriented;

public class Debug extends B implements A
{
	public void pX()
	{
		//System.out.println(x);
		System.out.println(super.x);
		System.out.println(A.x);
	}
	
	public static void main(String[] args)
	{
		new Debug().pX();
		Ball.ball.play();
	}
}

interface A
{
	int x = 0;
}

class B
{
	int x = 1;
}

//----------------------------------------------------

interface Playable
{
	void play();
}

interface Bounceable
{
	void play();
}

interface Rollable extends Playable, Bounceable
{
	Ball ball = new Ball("Ping Pong");
}

class Ball implements Rollable
{
	private String name;
	
	public String getName()
	{
		return name;
	}
	
	public Ball(String name)
	{
		this.name = name;
	}

	public void play()
	{
		//ball = new Ball("Football");
		System.out.println(ball.getName());
	}
}