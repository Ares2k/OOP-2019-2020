package ie.tudublin;

import java.util.Arrays; 
import java.util.Collections; 

import processing.core.PApplet;

import ddf.minim.*;
import ddf.minim.analysis.*;

public class Sound1 extends PApplet
{	

	Minim minim;
	AudioInput ai;

	public void settings()
	{
		size(1024, 500);
	}

	public void setup() 
	{
		minim = new Minim(this);
		ai = minim.getLineIn(Minim.MONO, width, 44100, 16);
	}

	public void keyPressed()
	{
		if (key == ' ')
		{
			
		}
	}	

	public void draw()
	{	
		background(0);
		stroke(255);
		
		float cy = height/2;
		float sum = 0;

		for(int i=0; i<ai.bufferSize(); i++) {

			stroke(
				map(i, 0, ai.bufferSize(), 0, 255)
				, 255
				, 255
			);

			//line(i, cy, i, cy + ai.left.get(i) * cy);
			sum += ai.left.get(i);
		}

		float average = sum / ai.bufferSize();
		float width = average * 1000;

		ellipse(width/2, cy, width, width);
	}
}
