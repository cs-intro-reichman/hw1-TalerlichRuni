public class Ascend {
    public static void main(String[] args) {
       int lim = Integer.parseInt(args[0]);
       double a = Math.random()*lim;
       double b = Math.random()*lim;
       double c = Math.random()*lim;
       double min = Math.min(a,Math.min(c,b));
       double max = Math.max(a,Math.max(c,b));
       double middle = a+b+c-min-max ; 
       System.out.println((int) min + " " +(int) middle + " " +(int) max);
    }

}
