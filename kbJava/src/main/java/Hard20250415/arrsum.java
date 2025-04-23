package Hard20250415;

public class arrsum {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        int [][] array = {
                {95, 86},
                {83,92,96},
                { 78, 83, 93, 87, 88}
        };
        for (int i =0; i<array.length; i++) {
            for (int j = 0; j< array[i].length; j++) {
                sum = sum + array[i][j];
                count = count + 1;
            }
        }

        System.out.println(sum);
        System.out.println(sum/count);
    }
}
