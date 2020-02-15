int dropY = 25;
int randomNumber = (int) random(width);
int dropX = randomNumber;
int score = 0;

void setup() {
  size(700,500);
  background(143,172,158);
  
  
}

void draw() {
    background(143,172,158);

  fill(47,35,245);
  stroke(47,35,245);
  ellipse(dropX,dropY, 25,25);
  dropY++;
  if (dropY >= height) {
    dropY = 25;
    checkCatch(dropX);
  }
  fill(175,175,175);
  stroke(175,175,175);
  rect(mouseX,450, 50, 65);
  fill(0,0,0);
  textSize(16);
  text("Score: " + score, 20,20);
  
}

void checkCatch(int x){
         if (x > mouseX && x < mouseX+100) 
            score++;
         else if (score > 0) 
            score--;
        println("Your score is now: " + score);
    }
