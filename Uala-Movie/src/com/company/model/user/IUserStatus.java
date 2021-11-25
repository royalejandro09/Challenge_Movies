package com.company.model.user;

import com.company.model.product.Product;

import java.util.List;

/**
 * StrategyUserStatus.
 * This class represents the StrategyUserStatus Interface.
 *
 * @author Roy AlejandroMartinez Valderrama, roymartinezv@gmail.com
 * @since 1.0.0-SNAPSHOT
 */
public interface IUserStatus {

    /**
     * Recommendation according to user status ( Happy, Sad and Melancholic).
     *
     * @param listProduct with all products from Uala-Movies.
     * @return a list {@link Product} with Series, Movies and Documentaries.
     */
    List<Product> recommendationAccordingUserStatus(List<Product> listProduct);

}
