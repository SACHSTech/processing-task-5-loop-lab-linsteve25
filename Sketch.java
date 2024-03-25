import processing.core.PApplet;

/*
 * Description: A program that draws eight different segments with different patterns using nested for loops
 * @author: @linsteve25
 */

public class Sketch extends PApplet {
	
  public void settings() {
	// put your size call here
    size(1200, 600);
  }

  public void setup() {
    background(45, 150, 207);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
    draw_section_outlines();
    draw_section1();
    draw_section2();
    draw_section3();
    draw_section4();
	  
    draw_section5();
    draw_section6();
    draw_section7();
    draw_section8();

  }


  /**
   * Draw the outlines for all sections
   */
  public void draw_section_outlines(){
    stroke(0);
    noFill();

    // draw bottom row boxes
    rect(0,300, 300, 300);
    rect(300, 300, 300, 300);
    rect(600, 300, 300, 300);
    rect(900, 300, 300, 300);

    // draw top row boxes
    rect(0,0, 300, 300);
    rect(300, 0, 300, 300);
    rect(600, 0, 300, 300);
    rect(900, 0, 300, 300);
  }
  
  /**
   * draws the bottom left section
   */
  public void draw_section1(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < 30; intColumn++){
        intX = 3 + 10 * intRow;  
        intY = 300 + 3 + 10 * intColumn; 

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);

      }
    }
  }

  public void draw_section2(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < 30; intColumn++){
        intX = 300 + 3 + 10 * intRow; 
        intY = 300 + 3 + 10 * intColumn; 

        if (intRow % 2 == 0) {
          fill(0);

        }

        else {
          fill(255);
          
        }
          noStroke();
          rect(intX, intY, 5, 5);
    
        }
      }

  }

  public void draw_section3(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < 30; intColumn++){
        intX = 3 + 600 + 10 * intRow;  
        intY = 300 + 3 + 10 * intColumn; 
    
        if (intColumn % 2 == 0) {
          fill(0);
       
        }
       
        else {
          fill(255);
                 
        }
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

  public void draw_section4(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < 30; intColumn++){
        intX = 3 + 900 + 10 * intRow; 
        intY = 300 + 3 + 10 * intColumn; 

        if (intColumn % 2 == 0) {
          fill(0);

        }
        else if (intRow % 2 == 1) {
          fill(0);

        }
        else {
          fill(255);

        }
  
        noStroke();
        rect(intX, intY, 5, 5);

      }
    }
  }

  public void draw_section5(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 30 - intRow; intColumn < 30; intColumn++){
        intX = 3 + 10 * intRow;  
        intY = 3 + 10 * intColumn; 

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);

      }
    }
  }

  public void draw_section6(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = intRow; intColumn < 30; intColumn++){
        intX = 3 + 300 + 10 * intRow;  
        intY = 3 + 10 * intColumn; 

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);

      }
    }


  }

  public void draw_section7(){
    int intX = 0;
    int intY = 0;

    for(int intColumn = 1; intColumn < 31; intColumn++){
      for(int intRow = -intColumn+ 30; intRow > -1; intRow--){
        intX = 3 + 600 + 10 * intRow;  
        intY = 3 + 10 * intColumn - 10; 

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);

      }
    }
  }
  
  public void draw_section8(){

  }






}
