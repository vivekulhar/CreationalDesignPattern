package dev.vivek.factory.ios;

import dev.vivek.factory.interfaces.Button;

public class IosButton implements Button {
    @Override
    public void showBUtton() {
        System.out.println("Ios Button");
    }
}
