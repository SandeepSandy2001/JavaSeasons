package d12PolymorphismEncapsulation;

public class Box 
{
	double width,height,depth;
	
	Box()   //1 constructor
	{
	
	/*width =0;
	height = 0;
	depth = 0;*/
	
	width=height=depth=0;
	}
	
	Box(double w, double h, double d)  //2 constructor
	{
		width = w;
		height = h;
		depth = d;
	}
	
	Box(double len)             //3 constructor
	{
		width=height=depth=len;       
	}
	
	double volume()
	{
		return(width*height*depth);
	}
}
