

public class Bill3 {
    public static void main(String[] args) {
       
        String name1 = args[0];
        String name2 = args[1];
        String name3 = args[2];
        int Bill = Integer.parseInt(args[3]);
        double Personalbill= Bill;
        Personalbill=Math.ceil( Personalbill/3);
        System.out.println("ALL RIGHT! "+ name1 + " , " + name2 + " and " + name3 + " pay " + Personalbill + " each ");

        }
}
