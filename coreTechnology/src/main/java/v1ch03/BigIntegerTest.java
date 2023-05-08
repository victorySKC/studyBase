package v1ch03;

/**
 * @author SiVincent
 * @description TODO
 * @date 2023/5/8
 */
public class BigIntegerTest {
    public static void main(String[] args)
    {
//        Scanner in = new Scanner(System.in);
//
//        System.out.print("How many numbers do you need to draw? ");
//        int k = in.nextInt();
//
//        System.out.print("What is the highest number you can draw? ");
//        int n = in.nextInt();
//
//        /*
//         * compute binomial coefficient n*(n-1)*(n-2)*...*(n-k+1)/(1*2*3*...*k)
//         */
//
//        BigInteger lotteryOdds = BigInteger.valueOf(1);
//
//        for (int i = 1; i <= k; i++) {
//            lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(n - i + 1)).divide(
//                    BigInteger.valueOf(i));
//        }
//
//        System.out.println("Your odds are 1 in " + lotteryOdds + ". Good luck!");


        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ch");
        stringBuilder.append("chdd");
        stringBuilder.append("w");
        System.out.println(stringBuilder);
        stringBuilder.setCharAt(2,'w');
        int i = stringBuilder.length();
        String s = stringBuilder.toString();
        System.out.println(s);
        System.out.println(i);
        System.out.println(stringBuilder);

    }

}
