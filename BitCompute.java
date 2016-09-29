import java.io.IOException;

/**
 * Created by Gavin on 2016/9/29 14:19
 * 比特数的组合和拆分
 */
public class BitCompute {

    public static void main(String[] args) throws IOException {
        int a = 2;
        int b = 4;
        int c = 8;
        int d = 16;
        int e = 32;

        int f = 32;
        int g = 56;
        int h = 62;

        System.out.println("6:  " + (a | b));
        System.out.println("38:  " +  (a | b | e));
        System.out.println("14:  " +  (a | b | c));

        System.out.println("请输入： " + h);
        decompose(16, 32);

    }


    public static void decompose(int h, int dividend) {
        if(h == 0) {
            return;
        }
        if(dividend == 1) {
            System.out.println(1);
            return;
        }
        int tmp = h / dividend;
        int yu = h % dividend;
        if(tmp != 0) {
            System.out.println(dividend);
        }
        decompose(yu, dividend / 2);
    }

}
