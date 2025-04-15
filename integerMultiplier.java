// Question: Given two integers a and b, return the result after multiplying the 2 numbers without using the operator (*). 
//  Constraints: 0 <= a <= 100000
//  Constraints: 0 <= b <= 100000
public class integerMultiplier{
    public static void main(String[] args){
     int a = 12345;
     int b = 34567;
     long c = mutiplyIntegers(a , b);
     System.out.println(c);
 }
 public static int mutiplyIntegers(int a, int b){
     int finalResult = 0;
     int countOfZero = 0;
     while(b!=0){
         int lastDigitB = b % 10;
         b = b / 10;
         int tempA = a;
         StringBuilder stepResult = new StringBuilder();
         int carryForward = 0;     
         long partialProduct= getPartialProduct(countOfZero, lastDigitB, tempA, stepResult,carryForward);
         finalResult += partialProduct;
         countOfZero++;
     }
 
     return finalResult;
 }
 public static long getPartialProduct(int countOfZero, int lastDigitB, int tempA, StringBuilder stepResult,int carryForward ){
    while(tempA!=0){
        int lastDigitA = tempA % 10;
        tempA = tempA / 10;
        stepResult.insert(0, (lastDigitA * lastDigitB + carryForward) % 10);
        carryForward = (lastDigitA * lastDigitB + carryForward)/10;
    }
    if (carryForward > 0) {
        stepResult.insert(0, carryForward);
    }
    for (int i = 0; i < countOfZero; i++) {
        stepResult.append("0");
    }
    long partialProduct = Long.parseLong(stepResult.toString());
    return partialProduct;

 }

}
