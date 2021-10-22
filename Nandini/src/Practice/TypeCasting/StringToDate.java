package Practice.TypeCasting;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {
    public static void main(String[] args) throws ParseException {
        
        String s = "29/07/2007";

        SimpleDateFormat formatter1=new SimpleDateFormat("dd/MM/yyyy"); 

        Date d = formatter1.parse(s);

        System.out.println(s+"\t"+d);
    }
    
}
