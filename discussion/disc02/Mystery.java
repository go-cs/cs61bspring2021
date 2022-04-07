public class Mystery {
    /**Find the smallest item from k.*/
    public static int mystery(int[] inputArray, int k) {
        int x = inputArray[k];
        int answer = k;
        int index = k + 1;
        while (index < inputArray.length) {
            if (inputArray[index] < x) {
                x = inputArray[index];
                answer = index;
            }
            index = index + 1;
        }
        return answer;
    }
    /**Sort inputArray in ascending order.*/
    public static void mystery2(int[] inputArray) {
        int index = 0;
        while (index < inputArray.length) {
            int targetIndex = mystery(inputArray,index);
            int temp = inputArray[targetIndex];
            inputArray[targetIndex] = inputArray[index];
            inputArray[index] = temp;
            index = index + 1;
        }
    }
    public static void main(String[] args) {
//        int[] inputArray = new int[]{3, 0, 4, 6, 3};
//        int k = 2;
//        int ans = mystery(inputArray,k);
//        System.out.print(ans);

        int[] inputArray2 = new int[] {3,0,4,6,3};
        mystery2(inputArray2);
        for (int i = 0;i<inputArray2.length;i++) {
            System.out.print(inputArray2[i]+" ");
        }

    }

}
