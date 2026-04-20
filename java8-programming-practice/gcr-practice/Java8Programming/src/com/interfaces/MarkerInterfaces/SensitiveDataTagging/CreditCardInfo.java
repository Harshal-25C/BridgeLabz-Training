package com.interfaces.MarkerInterfaces.SensitiveDataTagging;

class CreditCardInfo implements SensitiveData {

    String cardNumber;

    CreditCardInfo(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
