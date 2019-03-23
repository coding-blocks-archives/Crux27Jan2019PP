package L16_March23.OOPS_Story2;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 23-Mar-2019
 *
 */

public class Bicycle {

	int speed ;
	
	public void incSpeed() {
		this.speed += 2 ;
	}
	
	public void decSpeed() {
		this.speed -= 2 ;
	}
	
	public int getSpeed() {
		return this.speed ;
	}
}
