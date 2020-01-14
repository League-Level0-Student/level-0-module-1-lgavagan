
void setup() {
  size(800,500);
PImage face = loadImage("cat.jpeg");
face.resize(800, 500);
image(face, 0, 0);

}
void draw() {
  if(mousePressed){
    println("x="+mouseX+" y="+mouseY);}
ellipse(516, 206, 65, 65);
ellipse(348, 207, 65, 65);
fill(#FF0000);
}
