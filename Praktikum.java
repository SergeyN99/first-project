import java.text.DecimalFormat;

final class Hms {
    public String h, m, s;

    public Hms(String h, String m, String s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }
}
class Main {
    public static Hms getDetails(int x)
    {
//       String h = "23", m = "20", s = "10";

       double tmpH = Math.floor(x / 3600); // часы

       double tmp = Math.floor(x - tmpH * 3600);  // остаток секунд
       double tmpMin = Math.floor(tmp / 60);  // минуты
       double tmpSec = Math.floor(tmp - tmpMin * 60); // сек

       String h = new DecimalFormat("#0").format(tmpH);
       String m = new DecimalFormat("#0").format(tmpMin);
       String s = new DecimalFormat("#0").format(tmpSec);

       return new Hms(h,m,s);
    }
        public static void main(String[] args)
        {
            int x = 45867;
            Hms hmss = getDetails(x);
            System.out.println("Время: " + hmss.h + ":" + hmss.m + ":" + hmss.s);

        }
}
