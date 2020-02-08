int dropY = 25;
int randomNumber = (int) random(width);
int dropX = randomNumber;

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
  if (dropY >= 500) {
    dropY = 25;
    dropX = (int) random(width);
  }
}
