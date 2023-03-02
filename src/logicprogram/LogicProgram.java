package logicprogram;

public class LogicProgram {
        public void checkPerfectNumber(int n){
            int sum = 0;
            for (int i = 1; i < n; i++){
                if (n % i == 0){
                    sum = sum + i;
                }
            }
            if (sum == n){
                System.out.println(n);
            }
        }

        public static void main(String[] args) {
            LogicProgram perfectNumber = new LogicProgram();
            System.out.println("Perfect Number :");
            for (int i = 1; i < 50; i++){
                perfectNumber.checkPerfectNumber(i);
            }
        }
}
