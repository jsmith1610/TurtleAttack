//Name: Jacob Smith
//Date: 9/11/20
//Descriptions: This is the class that has the math and tells program how
//to move the turtle throughout the screen
class Model
{
	int turtle_x;
	int turtle_y;
	int dest_x;
	int dest_y;

	Model()
	{
	}

	public void update()
	{
		// Move the turtle
		if(this.turtle_x < this.dest_x)
			this.turtle_x += Math.min(4, dest_x - turtle_x);
		else if(this.turtle_x > this.dest_x)
			this.turtle_x += Math.min(4, dest_x - turtle_x);
		if(this.turtle_y < this.dest_y)
			this.turtle_y += Math.min(4, dest_y - turtle_y);
		else if(this.turtle_y > this.dest_y)
			this.turtle_y += Math.min(4, dest_y - turtle_y);
	}

	public void setDestination(int x, int y)
	{
		this.dest_x = x;
		this.dest_y = y;
	}
}