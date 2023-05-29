package org.example.design_patterns.creational.abstract_factory.factory;

import org.example.design_patterns.creational.abstract_factory.button.Button;
import org.example.design_patterns.creational.abstract_factory.button.MacOSButton;
import org.example.design_patterns.creational.abstract_factory.checkbox.CheckBox;
import org.example.design_patterns.creational.abstract_factory.checkbox.MacOSCheckBox;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacOSCheckBox();
    }
}
