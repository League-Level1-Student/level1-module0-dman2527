PImage pictureOfRecord;
int rotation = 0;
void setup(){
  size(600,600);    
  pictureOfRecord= loadImage("spinningRecord.png");
   pictureOfRecord.resize(600,600);
  
}
void draw(){
    if(mousePressed == true){
      
    rotation += 1000000000;
     rotateImage(pictureOfRecord,rotation);       
     image(pictureOfRecord, 0, 0);  
    }
}
void rotateImage(PImage image, int amountToRotate) {
        translate(width/2, height/2);
        rotate(amountToRotate*TWO_PI/360);
        translate(-image.width/2, -image.height/2);
}
