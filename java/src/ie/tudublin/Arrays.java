package ie.tudublin;

import processing.core.PApplet;

public class Arrays extends PApplet
{	
	//float[] rainFall = new float[12];
	float[] rainFall = {45, 47, 55, 27, 38, 50, 79, 48, 104, 31, 100, 58};
	String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

	public void settings()
	{
		size(500, 500);
	}

	public void setup() 
	{
		for(int i=0; i<rainFall.length; i++) {
			System.out.println(months[i] + "\t" + rainFall[i]);
		}

		for (float f : rainFall) {
			println(f);
		}

		for (String s : months) {
			println(s);
		}

		int minIndex = 0;

		for(int i=1; i<rainFall.length; i++) {

			if(rainFall[i] < rainFall[minIndex]) {
				minIndex = i;
			}
		}
	}

	

	float offset = 0;

	
	
	public void keyPressed()
	{
		if (key == ' ')
		{
			
		}
	}	


	public void draw()
	{	
		// background(0);		
		// colorMode(HSB);

		drawBarChart();
	}

	public void drawBarChart() {

		float w = width / rainFall.length;
		float cGap = 0;
		noStroke();
		colorMode(HSB);

		for(int i=0; i<rainFall.length; i++) {

			float x = i * w;
			fill(i * cGap, 255, 255);
			rect(x, height, w, -rainFall[i]);
		}
	}
}
