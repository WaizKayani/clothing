/**
 * Clothing Secondary interface.
 */
public interface ClothingSecondary {

    /**
     * Calculates the total cost of the outift.
     *
     * @updates this
     * @requires there should be more than one item in outfit.
     * @ensures adds the price of all the items and return it.
     * @return total cost
     */
    void outfitCost();

    /**
     * Acts like a recipt tells us all the items added to outfit.
     *
     * @updates this
     * @ensures lists all the items added.
     */
    void outFitSummary();

}
