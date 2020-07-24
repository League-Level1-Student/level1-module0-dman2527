void setup (){
  size(600,600);
}
int y = 25;
void draw () { 
  background(0,0,0);
  
  fill(0,0,100);
  stroke(0,0,50);
  ellipse(300,y,50,50);
  y += 5;
  if(y>600){
   y=25; 
  }
}
