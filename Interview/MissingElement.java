public class MissingElement {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 6, 7 };
        int n = arr.length + 1;
        int total = n * (n + 1) / 2;
        int predict_sum = 0;

        for (int i : arr) {
            predict_sum += i;

        }

        int missing_element = total - predict_sum;
        System.out.println(missing_element);
    }

}
