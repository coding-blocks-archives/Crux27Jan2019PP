package L23_April7.GenericFxn;

import java.util.Comparator;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 13-Apr-2019
 *
 */

public class CarPriceComparator implements Comparator<Car>{

	@Override
	public int compare(Car t, Car o) {
		return o.price - t.price ;
	}

	
}
