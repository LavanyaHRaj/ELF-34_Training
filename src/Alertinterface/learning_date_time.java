package Alertinterface;

import java.text.SimpleDateFormat;
import java.util.Date;

public class learning_date_time {
public static void main(String[] args) {
	/*LocalDateTime sysdate=LocalDateTime.now();
	String date=sysdate.toString().replaceAll(":", "-");
	System.out.println(date);*/
	
	Date thisdate=new Date();
	SimpleDateFormat dateform=new SimpleDateFormat();
	System.out.println(dateform.format(thisdate));
}
}
