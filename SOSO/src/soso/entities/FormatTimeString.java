package soso.entities;

import java.util.Date;

public class FormatTimeString {

	// private static TIME_MAXIMUM{
	public static final int SEC = 60;
	public static final int MIN = 60;
	public static final int HOUR = 24;
	public static final int DAY = 30;
	public static final int MONTH = 12;
	// }

	public static String formatTimeString(Date tempDate) {

		long curTime = System.currentTimeMillis();
		long regTime = tempDate.getTime();
		long diffTime = (curTime - regTime) / 1000;

		String msg = null;
		if (diffTime < SEC) {
			// sec
			msg = "��� ��";
		} else if ((diffTime /= SEC) < MIN) {
			// min
			msg = diffTime + "�� ��";
		} else if ((diffTime /= MIN) < HOUR) {
			// hour
			msg = (diffTime) + "�ð� ��";
		}/* else if ((diffTime /= HOUR) < DAY) {
			// day
			msg = (diffTime) + "�� ��";
		} else if ((diffTime /= DAY) < MONTH) {
			// day
			msg = (diffTime) + "�� ��";
		} else {
			msg = (diffTime) + "�� ��";
		}*/

		return msg;
	}

}
