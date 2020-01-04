 void setup(){
        size(600,600); 
        fill(#D6C9B5);
ellipse(300, 300, 575,575);
fill(#FF0004);
ellipse(300, 300, 550,550);
fill(#E8DC73);
ellipse(300, 300, 525,525);

    }

    void draw(){
if(mousePressed){
  fill(#FF0000);
  ellipse(mouseX, mouseY, 50, 50);
}

}
