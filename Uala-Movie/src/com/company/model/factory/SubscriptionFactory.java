package com.company.model.factory;

import com.company.model.subscription.Subscription;
import com.company.model.subscription.SubscriptionClassic;
import com.company.model.subscription.SubscriptionGold;
import com.company.model.subscription.SubscriptionPlatinum;

/**
 * UserFactory.
 * This class represents the userFactory to create user instances.
 *
 * @author Roy Alejandro Martinez Valderrama, roymartinezv@gmail.com
 * @since 1.0.0-SNAPSHOT
 */
public class SubscriptionFactory {

    private static SubscriptionFactory instance;

    /**
     * SubscriptionFactory constructor by default.
     */
    private SubscriptionFactory() {

    }

    /**
     * Get instance SubscriptionFcatory.
     *
     * @return an instance from {@link SubscriptionFactory}
     */
    public static SubscriptionFactory getInstance() {
        if (instance == null) {
            instance = new SubscriptionFactory();
        }
        return instance;
    }

    /**
     * createSubscription.
     *
     * @param typeSubscription
     * @return
     */
    public Subscription createSubscription(String typeSubscription) {
        Subscription subscription;
        switch (typeSubscription) {
            case "Classic":
                subscription = new SubscriptionClassic();
                break;
            case "Gold":
                subscription = new SubscriptionGold();
                break;
            case "Platinum":
                subscription = new SubscriptionPlatinum();
                break;
            default:
                subscription = null;
        }
        return subscription;
    }


}
