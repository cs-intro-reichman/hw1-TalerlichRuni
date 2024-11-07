
public class FVCalc {
public static void main(String[] args) {

        int currentValue = Integer.parseInt(args[0]);
        double interest=Double.parseDouble(args[1]);
        int n = Integer.parseInt(args[2]);
        Double interestP = interest/100;
        double futureValue = currentValue * Math.pow((1+ interestP),(n));
        System.out.println("After "+ n + " years  " + currentValue + "$  saved at " + interest + " % " + " will yield " + ((int)futureValue) + "$");
}
}
