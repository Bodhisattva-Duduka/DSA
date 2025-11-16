
import java.util.Arrays;

public class FlippingAnImage {

    public static void main(String[] args) {
        int[][] image = {
            {1, 0, 0},
            {0, 1, 0},
            {1, 1, 1}};
        FlippingAnImage obj = new FlippingAnImage();
        System.out.println(Arrays.deepToString(obj.flipAndInvertImage(image)));
    }

    public int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                image[i][j] = ~(image[i][j]) & 1;
            }
            reverse(image[i]);
        }
        return image;
    }

    public static void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }
}
