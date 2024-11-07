public class TimeFormat {
public static void main(String[] args) {

    String time = args[0];
    String[] parts = time.split(":");
    int hours = Integer.parseInt(parts[0]);
    int minutes = Integer.parseInt(parts[1]);
    int updatehour = hours;
    String updateminutes = String.valueOf(minutes);

    if (minutes<10)
    {
    updateminutes = "0" + updateminutes; 
    }
    
    if (hours >= 12)
     {
        updateminutes = updateminutes + " PM"; 
        updatehour = hours-12;
    }
     else 
     {
        updateminutes = updateminutes + " AM";
    }
    if (hours==0 )
    {
    updatehour = updatehour +12;
    }
System.out.println(updatehour +":"+ updateminutes);

}
}
