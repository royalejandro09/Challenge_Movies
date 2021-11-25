package com.company.model.product;

/**
 * Series.
 * This class represents the Series object.
 *
 * @author Roy Alejandro Martinez Valderrama, roymartinezv@gmail.com
 * @since 1.0.0-SNAPSHOT
 */
public class ProductSerie extends Product {

    /**
     * The numberOfSeasons refers to the number of seasons of the series.
     */
    private int numberOfSeasons;

    /**
     * Getter and Setter
     */
    public int getNumberOfSeasons() {
        return numberOfSeasons;
    }

    public void setNumberOfSeasons(int numberOfSeasons) {
        this.numberOfSeasons = numberOfSeasons;
    }


    /**
     * Validate if it is interesting content.
     *
     * @return true or false
     */
    @Override
    public boolean validateInterestingContent() {
        Boolean isInteresting = numberOfSeasons >= 4 ? true : false;
        return isInteresting;
    }


}
