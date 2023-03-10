package PracticeExam1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Objects;

public class Problem4Test {
    Problem4a problem4a;
    Problem4b problem4b;

    int[][] red;
    int[][] green;
    int[][] blue;

    @BeforeEach
    public void setup() {
        this.problem4a = new Problem4a();
        this.problem4b = new Problem4b();
        red = new int[][]{
                {0, 0, 0},
                {1, 1, 1},
                {2, 2, 2},
        };
        green = new int[][]{
                {0, 1, 2},
                {0, 1, 2},
                {0, 1, 2},
        };
        blue = new int[][]{
                {100, 100, 100},
                {100, 100, 100},
                {100, 100, 100},
        };
    }

    @Test
    public void testPixelArrayGeneration() {
        Problem4a.Pixel[][] pix = problem4a.generatePixelArray(red, green, blue);
        for (int i = 0; i < pix.length; i++) {
            for (int j = 0; j < pix[0].length; j++) {
                assert Objects.equals(new Problem4a.Pixel(red[i][j], green[i][j], blue[i][j]).toString(), pix[i][j].toString());
            }
        }
    }

    @Test
    public void testFlipImage() {
        Problem4a.Pixel[][] pix = problem4b.flipImage(problem4a.generatePixelArray(red, green, blue), false);
        for (Problem4a.Pixel[] pixels : pix) {
            for (int j = 0; j < pix[0].length; j++) {
                System.out.print(pixels[j]);
            }
            System.out.println();
        }
    }
}
