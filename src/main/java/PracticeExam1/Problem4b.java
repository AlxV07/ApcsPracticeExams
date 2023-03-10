package PracticeExam1;

public class Problem4b {
    /*
    Write a method called flipImage, which
    takes a 2D array of Pixel objects and a
    boolean direction to flip, true meaning
    horizontally and false meaning vertically.
    flipImage returns a 2D array of the
    flipped Pixel objects.
     */

    //All above this line are provided by the test.

    public Problem4a.Pixel[][] flipImage(Problem4a.Pixel[][] image, boolean horiz) {
        Problem4a.Pixel[][] a = new Problem4a.Pixel[image.length][image[0].length];
        for (int i = 0; i < a.length; i ++) {
            for (int j = 0; j < a[0].length; j++) {
                if(horiz)
                    a[i][j] = image[image.length-1-i][j];
                else
                    a[i][j] = image[i][image.length-1-j];
            }
        }
        return a;
    }
}
