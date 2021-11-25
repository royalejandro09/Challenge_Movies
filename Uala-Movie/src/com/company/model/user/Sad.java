package com.company.model.user;

import com.company.model.product.Product;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Sad.
 * This class represents the Sad object.
 *
 * @author Roy Alejandro Martinez Valderrama, roymartinezv@gmail.com
 * @since 1.0.0-SNAPSHOT
 */
public class Sad implements IUserStatus {

    /**
     * An User instance.
     */
    private User user;

    /**
     * Constructor.
     *
     * @param user
     */
    public Sad(User user) {
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

        List<Product> filterListProduct = listProduct.stream()
                .filter(product -> product.getDuration() > 2)
                .collect(Collectors.toList());
        return filterListProduct;
    }
}
