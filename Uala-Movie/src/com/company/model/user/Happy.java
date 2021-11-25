package com.company.model.user;

import com.company.model.product.Product;

import java.util.List;

/**
 * Happy.
 * This class represents the Happy object.
 *
 * @author Roy Alejandro Martinez Valderrama, roymartinezv@gmail.com
 * @since 1.0.0-SNAPSHOT
 */
public class Happy implements IUserStatus {

    /**
     * An User instance.
     */
    private User user;

    /**
     * Constructor.
     *
     * @param user
     */
    public Happy(User user) {
        this.user = user;
    }

    /**
     * Recommendation according to user status (Happy, Sad and Melancholic).
     *
     * @param listProduct with all products from Uala-Movies.
     * @return a list of {@link Product} with Series, Movies and Documentaries.
     */
    @Override
    public List<Product> recommendationAccordingUserStatus(List<Product> listProduct) {
        return listProduct;
    }
}
