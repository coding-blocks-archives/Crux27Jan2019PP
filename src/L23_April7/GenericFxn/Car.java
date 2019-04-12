package L23_April7.GenericFxn;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 07-Apr-2019
 *
 */

public class Car implements Comparable<Car> {

	int speed;
	int price;
	String color;

	public Car(int speed, int price, String color) {
		this.speed = speed;
		this.price = price;
		this.color = color;
	}

	@Override
	public String toString() {
		return "S:" + this.speed + " P:" + this.price + " C:" + this.color;
	}

	@Override
	public int compareTo(Car o) {
		return this.speed - o.speed;
		// return o.price - this.price;
		// return this.color.compareTo(o.color);

	}

}
