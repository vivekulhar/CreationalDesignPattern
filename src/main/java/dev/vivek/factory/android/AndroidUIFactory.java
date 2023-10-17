package dev.vivek.factory.android;

import dev.vivek.factory.interfaces.Button;
import dev.vivek.factory.interfaces.Menu;
import dev.vivek.factory.interfaces.UIFactory;

public class AndroidUIFactory implements UIFactory {

    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
