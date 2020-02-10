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

    private float laserX1 = 701;
    private float laserY1 = 0;

    private float laserX2 = 701;
    private float laserY2 = 0;

    private float enemyX1 = -70;
    private float enemyY1 = 70;

    private float enemyX2 = -50;
    private float enemyY2 = 70;

    private float enemyX3 = -60;
    private float enemyY3 = 40;

    int score = 0;

    public void settings() {
        size(700, 700);
    }

    public void setup() {

    }

    public void draw() {
        background(0, 0, 0);
        drawPlayer(playerX1, playerY1, playerX2, playerY2, playerX3, playerY3, playerWidth);
        drawEnemy(enemyX1, enemyY1, enemyX2, enemyY2, enemyX3, enemyY3);
        CheckForHit();

        textSize(20);
        fill(255, 0, 0);
        text("Score:", 10, 20);
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

            drawLaser(playerX1, playerY1, playerX1, laserY1);

        } else {
            
            laserX1 = 701;
            laserX2 = 701;
            laserY1 = 0;
            laserY2 = 0;
        }
}

    public void drawLaser(float x1, float y1, float x2, float y2) {

        stroke(0, 255, 0);

        laserX1 = playerX1 + 10;
        laserY1 = playerY1;

        laserX2 = playerX1 + 10;
        laserY2 = laserY1 - 700;

        line(laserX1, laserY1, laserX2, laserY2);
    }

    public void drawEnemy(float x1, float y1, float x2, float y2, float x3, float y3) {

        triangle(x1, y1, x2, y2, x3, y3);
        int speed = (int) ((Math.random() * ((3 - 0) + 1)) + 0);

        enemyX1 += speed;
        enemyX2 += speed;
        enemyX3 += speed;

        if (enemyX1 > 700) {

            enemyX1 = -70;
            enemyX2 = -50;
            enemyX3 = -60;
        }
    }

    private void CheckForHit() {

        if (laserX2 < enemyX2 && laserX2 > enemyX1) {
            enemyX1 = -70;
            enemyX2 = -50;
            enemyX3 = -60;

            score++;
        }
    }  
}