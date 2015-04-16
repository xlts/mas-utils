package mh.masutils;


public class MASUtils {

	public static boolean isNull(Object o) {
		if (o == null) {
			System.err.println("passed a null value");
			return false;
		}
		else {
			return true;
		}
	}
}

