package mh.masutils;


public class MASUtils {

	public static boolean isNull(Object o) {
		if (o == null) {
			System.err.println("passed a null value");
			return true;
		}
		else {
			return false;
		}
	}
	
}

