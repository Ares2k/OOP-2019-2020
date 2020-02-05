package ie.tudublin;

import processing.core.PApplet;

class BugZap extends PApplet {

    private float playerX = 250;
    private float playerY = 480;
    private float playerWidth = 50;

    public void settings() {
        size(500, 500);
    }

    public void setup() {

    }

    public void draw() {
        background(0, 255, 0);
        drawPlayer(playerX, playerY, playerWidth);
    }

    public void drawPlayer(float x, float y, float w) {

        float h = w/2;
        w = w/2;

        fill(0, 0, 0);
        ellipse(x, y, w, h);
    }

    public void keyPressed()
    {
        if (keyCode == LEFT)
        {
            System.out.println("Left arrow pressed");
            playerX -= 6;
        }
        if (keyCode == RIGHT)
        {
            System.out.println("Right arrow pressed");
            playerX = playerX + 6;
        }
        if (key == ' ')
        {
            System.out.println("SPACE key pressed");
        }
    }
}