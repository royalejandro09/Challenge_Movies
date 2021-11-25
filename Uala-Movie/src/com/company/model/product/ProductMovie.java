package com.company.model.product;

/**
 * Movie.
 * This class represents the Movie object.
 *
 * @author Roy Alejandro Martinez Valderrama, roymartinezv@gmail.com
 * @since 1.0.0-SNAPSHOT
 */
public class ProductMovie extends Product{


    /**
     * The numberOfAwards attribute refers to the number of oscar awards tha the film won.
     */
    private int numberOfAwards;

    /**
     * Getter & Setter
     */
    public int getNumberOfAwards() {
        return numberOfAwards;
    }

    public void setNumberOfAwards(int numberOfAwards) {
        this.numberOfAwards = numberOfAwards;
    }

    /**
     * Validate if it is interesting content.
     *
     * @return true or false.
     */
    @Override
    public boolean validateInterestingContent() {
       boolean isInteresting = numberOfAwards > 0 ? true : false;
       return isInteresting;
    }
}
