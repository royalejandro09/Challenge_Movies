package com.company.model.subscription;

import java.time.LocalDate;

/**
 * Subscription.
 * This class represents the Subscription object.
 *
 * @author Roy Alejandro Martinez Valderrama, roymartinezv@gmail.com
 * @since 1.0.0-SNAPSHOT
 */
public abstract class Subscription {

    /**
     * The price attribute refers to the price of subscription.
     */
    private double price;

    /**
     * The subscriptionStarDate attribute refers to the subscription start date.
     */
    private LocalDate subscriptionStartDate;

    /**
     * The numberOfScreens attribute refers to the number of screens of the Subscription.
     */
    private int numberOfScreens;

    /**
     * The paymentMethod attribute refers to the payment Method of the Subscription.
     */
    private String paymentMethod;

    /**
     * Getter & Setter
     */
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getSubscriptionStartDate() {
        return subscriptionStartDate;
    }

    public void setSubscriptionStartDate(LocalDate subscriptionStartDate) {
        this.subscriptionStartDate = subscriptionStartDate;
    }

    public int getNumberOfScreens() {
        return numberOfScreens;
    }

    public void setNumberOfScreens(int numberOfScreens) {
        this.numberOfScreens = numberOfScreens;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * chargeSubscription().
     *
     * @return a value with subscription price
     */
    public double chargeSubscription() {

        double charge = price;
        int numberOfYears = LocalDate.now().getYear() - subscriptionStartDate.getYear();

        if (numberOfYears > 1 && paymentMethod.equals("Paypal")) {
            charge = price - (price * (numberOfYears * 0.05));
        } else if (paymentMethod.equals("Paypal")) {
            charge = price - (price * 0.02);
        } else if (numberOfYears > 1) {
            charge = price - (price * (numberOfYears * 0.03));
        }
        return charge;
    }


}














