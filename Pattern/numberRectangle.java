package Pattern;

public class numberRectangle {
    public static void main(String[] args) {
        int n = 4;
        int size = 2 * n - 1;

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {

                int layer = n;  // Start from outermost layer

                if (i < layer) layer = i;
                if (j < layer) layer = j;
                if ((size - i + 1) < layer) layer = size - i + 1;
                if ((size - j + 1) < layer) layer = size - j + 1;

                System.out.print(layer);
            }
            System.out.println();
        }
    }
}
