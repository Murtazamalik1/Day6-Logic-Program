package logicprogram;

import java.util.Random;
import java.util.Scanner;
public class LogicProgram {
    public static void main(String[] args) {
            int winnerCouponNum=123;
            int couponNumber=0;
            int couponCount=0;

            while (couponNumber != winnerCouponNum){
                couponNumber=generateCoupon();
                couponCount++;
                System.out.println(couponNumber);
            }
            System.out.println("winner coupon : "+couponNumber);
            System.out.println("No of coupons to match winner : "+couponCount);
        }
        static int generateCoupon(){
            int num=0;
            Random random=new Random();
            while (num<100){
                num=random.nextInt(999);
            }
            return num;
    }
}
