public class MinAndMax {
    public static void main(String[] args) {
        int arr[] = { 12,12,12,12,12  };
        FindMinAndMax(arr);
    }

    public static void FindMinAndMax(int arr[]) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];

            if (arr[i] > max)
                max = arr[i];
        }

        System.out.println("Maxium value : " +max);
        System.out.println("Minimum value : " +min);

    }
}
