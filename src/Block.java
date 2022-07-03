import java.awt.Color;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Block{
	public int blocks[][];
	public int brickWidth;
	public int brickHeight;
   public Block(int row, int col) {
	   blocks = new int[row][col];
	   for(int i = 0; i< blocks.length; i++) {
		   for(int j = 0; j< blocks[0].length; j++) {
			   blocks[i][j] = 1;
		   }
	   }
	   
	   brickWidth = 540/col;
	   brickHeight = 150/row;
   }
	   
	   public void draw(Graphics g) {
		   for(int i = 0; i< blocks.length; i++) {
			   for(int j = 0; j< blocks[0].length; j++) {
				   if(blocks[i][j] > 0) {
					   g.setColor(Color.WHITE);
					   g.fillRect(j *brickWidth + 80, i * brickHeight +50, brickWidth, brickHeight);
					  // g.setStroke(new BasicStroke(3));
					   g.setColor(Color.BLACK);
					   g.drawRect(j *brickWidth + 80, i * brickHeight +50, brickWidth, brickHeight);
				   }
			}
	   }
		   
   }
	   public void setBlockValue(int value, int row ,int col) {
		   blocks[row][col] = value;
	   }
	
	

}
