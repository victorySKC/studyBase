package gaoxiaosuanfa.prime;

/**
 * @author: Vincent
 * @description: 使用遍历获取素数
 * @date: 2020-08-21 10:33
 **/
public class Prime {
    public static void main(String[] args) {
        final int NUMBER_OF_PEIMES = 50 ;
        final int NUMBER_OF_PEIMES_PER_LINE = 10 ;
        int count = 0;
        int number = 2;
        System.out.println("50以内的素数是 \n");
        while (count < NUMBER_OF_PEIMES){
            boolean isPrime = true;
            for (int divisor = 2; divisor <= number/2; divisor++){
                if (number % divisor == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                count++;

                if (count % NUMBER_OF_PEIMES_PER_LINE == 0){
                    System.out.println(number);
                }else {
                    System.out.print(number + " ");
                }

            }
            number++;
        }

    }
}
