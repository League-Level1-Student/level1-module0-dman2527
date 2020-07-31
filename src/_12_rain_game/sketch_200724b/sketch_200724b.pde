int randomNumber = (int) random(width);
int y = 25;
int score = 0;
void setup (){
  size(600,600); 
  


}

void draw () { 
  
  background(0,0,0);
  fill(0,0,100);
  rect(mouseX, 550, 150, 150);
  fill(0,0,100);
  stroke(0,0,50);
  
      fill(0, 0, 100);
    textSize(16);
    text("Score: " + score, 20, 20);
   fill(0,0,100);
  y += 5;
  if(y>600){
    y=25;
    randomNumber = (int) random(width);
  }
  if( randomNumber <= mouseX +150 && 599 < y && randomNumber > mouseX ){
   score ++; 
  }
  if(score < 0) {
   score = 0; 
  }
ellipse(randomNumber,y,50,50);
}
