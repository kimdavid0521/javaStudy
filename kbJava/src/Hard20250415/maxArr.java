package Hard20250415;

public class maxArr {
    public static void main(String[] args) {
        int [] array = {1,5,3,8,2};
        int max1 = 0;
        for (int i = 0; i < array.length; i++) {
            if (max1 < array[i]) {
                max1 = array[i];
            }
        }

        System.out.println(max1);
    }
}
