void setup(){
   size(600, 600);
    background(0, 0, 0);
}
float x = 0;
float y = 0;
void click() {

}
int g = 0;
int b = 0;
void draw(){
   for(int i=0;i<300;i++){
    getWormX(i);
    getWormY(i);
    fill(0,g,b);
    ellipse(i+10,i,10,10);
    x = random(600);
    y = random(600);
    if(mousePressed == true){
     g = g +10;
     b = b+10;
    }
  }
 
}

    float frequency = .001;
    float noiseInterval = PI;

 

    float getWormX(int i) {
        return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
    }

    float getWormY(int i) {
        return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
    }
