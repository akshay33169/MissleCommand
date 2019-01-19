public class Spaceship
{
	int x1;
	int y1;
	int xC;
	int yC;
	int y2;
	int x2;
	double slope;
	double yInt;
	boolean dir;
	public Spaceship(int XP1,int YP1,int XP2,int YP2,boolean d)
	{
		x1=XP1;
		y1=YP1;
		xC=x1;
		yC=y1;
		x2=XP2;
		y2=YP2;
		dir=d;
		slope = (YP2-YP1+0.0)/(XP2-XP1);
		yInt=YP2-(slope*XP2);

	}

	public double getSlope()
	{
		return slope;
	}

	public boolean getDirection()
	{
		return dir;
	}

	public void update()
	{
		if(dir)
			yC-=3;
		else yC++;
		xC=(int)((yC-yInt)/slope);

	}



	public int getOX()
	{
		return x1;
	}

	public int getOY()
	{
		return y1;
	}

	public int getX()
	{
		return xC;
	}
	public int getY()
	{
		return yC;
	}
	public int getEndY()
	{
		return y2;
	}

	public int getEndX()
	{
		return x2;
	}
}


