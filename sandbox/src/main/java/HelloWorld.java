

public class HelloWorld {

	public static void main(String[] args) {
		Date d = new Date();
		d.day = "09";
		d.month = "10";
		d.year="2020";
		Time t = new Time();
		t.hours ="15";
		t.minutes = "10";
		t.seconds = "25";

		String a = "Привет ";
		String b = "World!";
		System.setOut(new java.io.PrintStream(System.out, true, "Cp866"));
		System.out.println("Hello " + wo());
		System.out.println( hello (a,b) );

		System.out.println(nowTime(d,t));

	}
	public static String hello (String c, String d) {
		return c+d;
	}

	public static String wo() {
		return "world !";
	}
	public static String nowTime (Date d, Time t) {
		return d.day + ":" + d.month + ":" + d.year + "\n" + t.hours + ":" + t.minutes + ":" + t.hours;
	}
	}
