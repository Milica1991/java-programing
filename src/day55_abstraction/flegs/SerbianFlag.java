package day55_abstraction.flegs;

import java.awt.*;

public class SerbianFlag extends Flag {

    @Override
    public void draw() {
        Grid grid = new Grid(10);

        grid.setColor(0, 0, Color.RED);
        for(int col=0;col<grid.getWd();col++){
            for(int row=0;row<grid.getHt();row++){
                if(row<grid.getHt()/3 ){
                    grid.setColor(row, col, Color.RED);
                }else if(row<grid.getHt()/3*2){
                    grid.setColor(row, col, Color.BLUE);
                }else{
                    grid.setColor(row, col, Color.WHITE);
                }
            }
        }
    }
}
