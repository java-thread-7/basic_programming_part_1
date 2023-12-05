public class MeanMedian {
    public static double[] meanMedian(double[] arr) {
        double sum = 0;
        for (double val : arr) {
            sum += val;
        }

        double mean = sum / arr.length;

        double median;
        int n = arr.length;
        if (n % 2 == 0) {
            median = (arr[n/2-1] + arr[n/2]) / 2;
        } else {
            median = arr[n / 2];
        }
        return new double[]{mean, median};
    }

    public static void main(String[] args) {
        double[] result1 = meanMedian(new double[]{1, 2, 3, 4});
        System.out.println(result1[0] + " " + result1[1]); // 2.5 2.5

        double[] result2 = meanMedian(new double[]{1, 2, 3, 4, 5});
        System.out.println(result2[0] + " " + result2[1]); // 3.0 3.0

        double[] result3 = meanMedian(new double[]{7, 8, 9, 13, 15});
        System.out.println(result3[0] + " " + result3[1]); // 10.4 9.0

        double[] result4 = meanMedian(new double[]{10, 20, 30, 40, 50});
        System.out.println(result4[0] + " " + result4[1]); // 30.0 30.0

        double[] result5 = meanMedian(new double[]{15, 20, 30, 60, 120});
        System.out.println(result5[0] + " " + result5[1]); // 49.0 30.0
    }
}