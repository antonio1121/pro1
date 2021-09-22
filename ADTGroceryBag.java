
package project1;
import java.util.ArrayList;
import java.util.Random;

// ADT Grocery Bag Class

public class ADTGroceryBag implements ListInterface {
// Creates random class to implement it.
	Random rand = new Random();
// Max value of the ADT bag.
	private int max = 100 ;
	
//Creates Bag
	
	@Override
	public void createBag() {
		ArrayList<String> groceryBag = new ArrayList<String>();
		
	}
	
/** Inserts a new item into the bag.
 * 	@param item name of the item you want to add
 */

	@Override
	public void insert(String item) {
		groceryBag.add(item);
		
	}
	
// Removes the last item on the list.

	@Override
	public void removeLast() {
		int last = groceryBag.size() - 1 ;
		groceryBag.remove(last);
	}

// Removes a random item off the list.

	@Override
	public void removeRandom() {
		int random = rand.nextInt(groceryBag.size()) + 1 ;
		groceryBag.remove(random);
	}
	
/** Returns the index of the first instance of an item.
 * @param firstItem name of first item
 * @return the index of the first item
 */

	@Override
	public int get(String firstItem) {
	return groceryBag.indexOf(firstItem);
	}

/** Returns name of an item at an index.
 *  @param index the index number
 *  @return the name of the item
 */
	
	@Override
	public String getItem(int index) {
		return groceryBag(index);
	}
	
/** Check the size of the bag.
 *  @return the size of the bag
 */

	@Override
	public int size() {
		return groceryBag.size();
	}
	
/** Checks to see if the bag is empty.
 *  @return if the bag is empty or not
 */
	
	@Override
	public boolean isEmpty() {
		if (groceryBag.isEmpty()) {
			return true;
		} else {
		return false;
		}
	}

// Makes the bag empty.
	
	@Override
	public void makeEmpty() {
		groceryBag.clear();
		
	}

}
