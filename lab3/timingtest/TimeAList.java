package timingtest;
import edu.princeton.cs.algs4.Stopwatch;

/**
 * Created by hug.
 */
public class TimeAList {
    private static void printTimingTable(AList<Integer> Ns, AList<Double> times, AList<Integer> opCounts) {
        System.out.printf("%12s %12s %12s %12s\n", "N", "time (s)", "# ops", "microsec/op");
        System.out.printf("------------------------------------------------------------\n");
        for (int i = 0; i < Ns.size(); i += 1) {
            int N = Ns.get(i);
            double time = times.get(i);
            int opCount = opCounts.get(i);
            double timePerOp = time / opCount * 1e6;
            System.out.printf("%12d %12.2f %12d %12.2f\n", N, time, opCount, timePerOp);
        }
    }

    public static void main(String[] args) {
        timeAListConstruction();
    }

    public static void timeAListConstruction() {
        // TODO: YOUR CODE HERE
        System.out.println("Timing table for addLast");
        Stopwatch sw = new Stopwatch();
        AList<Integer> Ns= new AList();
        int num = 1000;
        for (int i = 0;i<8;i++) {
            Ns.addLast(num);
            num*=2;
        }
        AList opCount=Ns;
        AList<Double> times = new AList<>();
        //double[] times = new double[8];
        AList al = new AList();
        for(int i = 0;i<Ns.size();i++) {
            int j = 0;
            while (j<Ns.get(i) ){
                al.addLast(j);
                j+=1;
            }
            double timeInSecond = sw.elapsedTime();
            times.addLast(timeInSecond);
        }
        printTimingTable(Ns, times, opCount);

    }
}
