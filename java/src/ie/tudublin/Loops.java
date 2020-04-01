package ie.tudublin;

import processing.core.PApplet;

public class Loops extends PApplet {
	private float centerX1 = 250;
	private float centerY1 = 250;

	public void settings() {
		size(500, 500);
	}

	public void setup() {
		// colorMode(HSB);
	}

	public void keyPressed() {

	}

	public void draw() {
		// drawPattern();
		// drawCircle();
		// rainbow();
		// rainbowCircle();
		//drawGrid();
		//drawPyramid();
		//fade();
		checkerBoard();
	}

	public void drawPattern() {

		for (int i = 0; i < 520; i += 20) {

			line(centerX1, centerY1, i, 0);
			line(centerX1, centerY1, 0, i);
			line(centerX1, centerY1, i, 500);
			line(centerX1, centerY1, 500, i);
		}
	}

	public void drawCircle() {

		for (int i = 25; i < 500; i += 50) {

			color(255, 0, 0);
			circle(i, 250, 50);
		}
	}

	public void rainbow() {

		int colorSelection = 0;

		for (int i = 0; i < 500; i += 50) {

			colorSelection(colorSelection++);
			rect(i, 0, 50, 500);
		}
	}

	public void rainbowCircle() {

		int colorSelection = 0;

		for (int i = 25; i < 500; i += 50) {

			colorSelection(colorSelection++);
			circle(i, 250, 50);
		}
	}

	public void colorSelection(int colorSelection) {
		int[][] colors = { { 255, 0, 0 }, { 255, 105, 0 }, { 255, 225, 53 }, { 208, 255, 20 }, { 106, 255, 77 },
				{ 0, 255, 0 }, { 152, 255, 152 }, { 0, 255, 255 }, { 102, 179, 255 }, { 0, 0, 255 } };

		fill(colors[colorSelection][0], colors[colorSelection][1], colors[colorSelection][2]);
	}

	public void drawGrid() {
		
		background(0);
		stroke(0, 255, 0);

		float gap = 40;
		int num = -5;

		for (int i = 40; i < 480; i += 40) {

			line(gap, i, 440, i); // horizontal
			text(num, i - 5, gap - 10);

			line(i, gap, i, 440); // vertical
			text(num, gap-20, i+5);

			num++;
		}
	}

	public void drawPyramid() {

		int ypos = 20;
		int length = 460;
		int width = 50;
		int j=0;

		for(int i=20; j<5; i+=40) {

			rect(i, ypos, length, width);
			ypos += width;
			length -= 80;
			j++;
		}
	}

	public void fade() {

		int colorSelection = 0;
		int ypos = 25;
		int count = 0;

		for(int i=25; count<10; i+=50) {
			
			colorSelection = 0;

			for (int j = 25; j < 500; j += 50) {
				
				colorSelection(colorSelection++);
				circle(j, ypos, 50);
			}
			ypos += 50;
			count++;
		}
	}

	public void checkerBoard() {

		for(int j=0; j<500; j+=25) {

			for(int i=0; i<500; i+=25) {
				
				fill(0, 0, 102);
				square(i, j, 25);
			}
		}

	}
}
