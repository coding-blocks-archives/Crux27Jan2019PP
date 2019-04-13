package L23_April7.GenericFxn;

import java.util.Comparator;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 13-Apr-2019
 *
 */

public class CarColorComparator implements Comparator<Car>{

	@Override
	public int compare(Car t, Car o) {
		return t.color.compareTo(o.color) ;
	}

	
}
