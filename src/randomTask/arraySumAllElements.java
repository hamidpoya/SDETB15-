package randomTask;

public class arraySumAllElements {
    public static void main(String[] args) {

        int[][] numArray = {{-5,-2,-3,7},
                            {1,-5,-2, 2},
                            {1,-2, 3,-4}};

        int sum=0;

        for (int i = 0; i < numArray.length; i++) {
            for(int j=0; j< numArray[i].length;j++){
                sum+=numArray[i][j];
            }

        }
        System.out.println(sum);
    }
}
