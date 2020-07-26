package Recomeco;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Data {

	public static void main(String[] args) {
		SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date data = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		System.out.println(d.format(data));
		Calendar c = Calendar.getInstance();
		c.setTime(data);
		c.add(Calendar.HOUR_OF_DAY, 4);
		data = c.getTime();
		System.out.println(d.format(data));
		
		int minutos = c.get(Calendar.MINUTE);
		int mes = 1 + c.get(Calendar.MONTH);
		System.out.println("Minutos: "+minutos);
		System.out.println("Mês: "+mes);

	}

}
   