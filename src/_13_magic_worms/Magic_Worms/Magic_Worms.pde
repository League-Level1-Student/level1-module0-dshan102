 int wormx = (int) random (width-3);
int wormy = (int) random (height-3);

void setup() {
  size(1200,1200);
  background(0,0,0);
}

void draw() {
  makeMagical();
  for(int i=0; i<300; i++) {
    fill(5,232,17);
    ellipse(getWormX(i),getWormY(i),3,3);
      //wormx = (int) random (width-3);
      //wormy = (int) random (height-3);
  }
}

  float frequency = .001;
    float noiseInterval = PI;

    void makeMagical() {
        fill( 0, 0, 0, 10 );
        rect(0, 0, width, height);
        noStroke();
    }

    float getWormX(int i) {
        return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
    }

    float getWormY(int i) {
        return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
    }
