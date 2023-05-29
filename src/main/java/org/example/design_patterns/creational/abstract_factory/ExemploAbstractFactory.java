package org.example.design_patterns.creational.abstract_factory;

import org.example.design_patterns.creational.abstract_factory.button.Button;
import org.example.design_patterns.creational.abstract_factory.checkbox.CheckBox;
import org.example.design_patterns.creational.abstract_factory.factory.GUIFactory;
import org.example.design_patterns.creational.abstract_factory.factory.MacOSFactory;
import org.example.design_patterns.creational.abstract_factory.factory.WindowsFactory;

public class ExemploAbstractFactory {
    public static void main(String[] args) {
        GUIFactory windowsFactory = new WindowsFactory();
        Button windowsButton = windowsFactory.createButton();
        CheckBox windowsCheckBox = windowsFactory.createCheckBox();
        windowsButton.render();
        windowsCheckBox.render();

        GUIFactory macOSFactory = new MacOSFactory();
        Button macOSButton = macOSFactory.createButton();
        CheckBox macOSCheckBox = macOSFactory.createCheckBox();
        macOSButton.render();
        macOSCheckBox.render();
    }
}
