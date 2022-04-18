public class fillGrid {
    public static void fiilGrid(int[] LL,int[] UR,int[][] S) {
        int N = S.length;
        int kL,kR;
        kL=kR=0;

        for (int i = 0;i<N;i+=1) {
            for (int j=0;j<i;j++) {
                S[i][j] = LL[kL];
                kL+=1;
            }
            for (int j=i+1;j<N;j++) {
                S[i][j] = UR[kR];
                kR+=1;
            }
        }
    }
    public static void main(String[] args) {
        int[] LL = {1,2,3,4,5,6,7,8,9,10,0,0};
        int[] UR = {11,12,13,14,15,16,17,18,19,20};
        int[][] S = {
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0}
        };
        fillGrid.fiilGrid(LL,UR,S);//fillGrid(LL,UR,S);
        for (int i = 0; i < S.length; i++) {
            for (int j =0;j<S.length;j++) {
                System.out.print(S[i][j]+" ");
            }
            System.out.println();
        }
    }
}
