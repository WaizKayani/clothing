/**
 * Clothing Kernel interface.
 */
public interface ClothingKernel {

    /**
     * Adds item to outfit and its price to total price.
     *
     * @param item
     *            the item to be added
     * @param price
     *            the price of the item
     * @updates this
     * @requires item is not null
     * @ensures adds item to outfit and its price to total price.
     */
    void add(String item, double price);

    /**
     * Removes the given item from outfit.
     *
     * @param item
     *            the item to be removed.
     * @updates this
     * @ensures the said item is removed
     */
    void remove(String item);

    /**
     * Removes all the items from the outfit.
     *
     * @ensures there are no items in the outfit.
     */
    void clearOutfit();

}
