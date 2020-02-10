package ie.tudublin;

import processing.core.PApplet;

class BugZap extends PApplet {

    //starting positions for the triangle player
    private float playerX1 = 350;
    private float playerY1 = 650;

    private float playerX2 = 370;
    private float playerY2 = 650;

    private float playerX3 = 360;
    private float playerY3 = 660;

    private float playerWidth = 50;

    private float laserX1 = 0;
    private float laserY1 = 0;

    private float laserX2 = 0;
    private float laserY2 = 0;


    public void settings() {
        size(700, 700);
    }

    public void setup() {

    }

    public void draw() {
        background(0, 0, 0);
        drawPlayer(playerX1, playerY1, playerX2, playerY2, playerX3, playerY3, playerWidth);
        //drawLaser(laserX1, laserY1, laserX2, laserY2);
    }

    public void drawPlayer(float x1, float y1, float x2, float y2, float x3, float y3, float w) {

        fill(0, 0, 0);
        stroke(255, 255, 255);
        triangle(x1, y1, x2, y2, x3, y3);
    }

    public void keyPressed()
    {
        if (keyCode == LEFT)
        {
            System.out.println("Left arrow pressed");

            if (playerX1 < 10) {
                playerX1 = 10;
                playerX2 = 30;
                playerX3 = 20;

            } else {
                playerX1 -= 6;
                playerX2 -= 6;
                playerX3 -= 6;
            }
        }

        if (keyCode == RIGHT)
        {
            System.out.println("Right arrow pressed");

            if (playerX2 > 690) {
                playerX1 = 670;
                playerX2 = 690;
                playerX3 = 680;

            } else {
                playerX1 += 6;
                playerX2 += 6;
                playerX3 += 6;
            }
        }

        if (key == ' ')
        {
            System.out.println("SPACE key pressed");

            drawLaser(playerX1+10, playerY1, laserX1, laserY1-700);
            // laserX1 = playerX1 + 10;
            // laserX2 = laserX1;

            // laserY1 = playerY1;
            // laserY2 = laserY1 - 700;

        // } else {
        //     laserX1 = 0;
        //     laserX2 = 0;

        //     laserY1 = 0;
        //     laserY2 = 0;
        // }
    }
}

    public void drawLaser(float x1, float y1, float x2, float y2) {

        stroke(0, 255, 0);
        line(x1, y1, x2, y2);
    }
}