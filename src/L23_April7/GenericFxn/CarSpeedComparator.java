package L23_April7.GenericFxn;

import java.util.Comparator;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 13-Apr-2019
 *
 */

public class CarSpeedComparator implements Comparator<Car>{

	@Override
	public int compare(Car t, Car o) {
		return t.speed - o.speed ;
	}

	
}
