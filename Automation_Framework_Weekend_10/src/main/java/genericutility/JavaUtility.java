package genericutility;

import java.time.LocalDateTime;
import java.util.Random;
/**
 * @author abhijith
 */
public class JavaUtility {
	/**
	 * This method is used to capture current system date and time and replace : with -
	 * @return System date and time
	 */
	public String getSystemTime() {
		return LocalDateTime.now().toString().replace(":", "-");
	}
	
	/**
	 * This method will return random numbers within 1000
	 * @return random numbers
	 */
	public int getRandomNumbers() {
		Random ran=new Random();
		return ran.nextInt(1000);
	}
}
