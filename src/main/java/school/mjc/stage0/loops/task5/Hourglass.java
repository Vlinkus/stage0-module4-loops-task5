package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        int middle = height%2 == 0? height/2 : height/2+1;
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height ; j++) {
                if( i == 1 || i == height ){
                    System.out.print(8);
                } else if ( (i > j && j <= height-i)){
                    System.out.print(" ");
                } else if( i > middle && j > middle && i < j){
                    System.out.print(" ");
                } else if( i <= middle && j > middle && (height-(i-1)) < j){
                    System.out.print(" ");
                } else {
                    System.out.print(8);
                }
            }
            System.out.println();
        }
    }
}
