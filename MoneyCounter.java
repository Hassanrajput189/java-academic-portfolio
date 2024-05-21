//import java.util.Scanner;
//public class MoneyCounter{
//        public static void countMoney(int amount){
//        int count5000=0,count1000=0,count500=0,count100=0,count50=0;
//        while(amount >0){
//         if (amount >= 5000) {
//                amount -= 5000;
//                count5000++;
//            } else if (amount >= 1000) {
//                amount -= 1000;
//                count1000++;
//            } else if (amount >= 500) {
//                amount -= 500;
//                count500++;
//            } else if (amount >= 100) {
//                amount -= 100;
//                count100++;
//            } else if (amount >= 50) {
//                amount -= 50;
//                count50++;
//            }
//
//    System.out.println("5000:"+count5000);
//    System.out.println("1000:"+count1000);
//    System.out.println("500:"+count500);
//    System.out.println("100:"+count100);
//    System.out.println("50:"+count50);
//
//}
//public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the amount: ");
//        int amount = sc.nextInt();
//        countMoney(amount);
//        }
//}