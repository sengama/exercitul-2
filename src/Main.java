public class Main {
    public static void main(String[] args) {
        int[] unidimensional = {1, 2, 3, 4, 5};
        int[][] bidimensional = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        calculeaza(unidimensional);
        for (int[] arr : bidimensional) {
            calculeaza(arr);
        }
    }

    public static void calculeaza(int[] array) {
        int suma = 0;
        int pare = 0;
        int impare = 0;

        for (int i : array) {
            suma += i;
            if (i % 2 == 0) {
                pare++;
            } else {
                impare++;
            }
        }

        double medie = (double) suma / array.length;

        System.out.println("Suma: " + suma);
        System.out.println("Media: " + medie);
        System.out.println("Numărul de elemente pare: " + pare);
        System.out.println("Numărul de elemente impare: " + impare);
    }
}
