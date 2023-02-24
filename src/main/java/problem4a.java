public class problem4a {
    /*
    Given three arrays (reds, greens, blues) and
    the Pixel and AlterImage classes, implement
    the generatePixelArray method that converts
    the raw information in the arrays into a rows
    by columns array of Pixel objects.
     */

    public static class Pixel {
        int x, y, z;
        public Pixel(int x, int y, int z){
            this.x = x;
            this.y = y;
            this.z = z;
        }

        @Override
        public String toString() {
            return "red: " + this.x +", green: "+ this.y + ", blue: "+this.z+" ";
        }
    }

    //All above this line are provided by the test.

    public Pixel[][] generatePixelArray(int[][] reds, int[][] greens, int[][] blues) {
        Pixel[][] a = new Pixel[reds.length][reds[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++)
                a[i][j] = new Pixel(reds[i][j], greens[i][j], blues[i][j]);
        }
        return a;
    }
}
