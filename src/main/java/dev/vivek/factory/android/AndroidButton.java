package dev.vivek.factory.android;

import dev.vivek.factory.interfaces.Button;

public class AndroidButton implements Button {
    @Override
    public void showBUtton() {
        System.out.println("Android Button");
    }
}
