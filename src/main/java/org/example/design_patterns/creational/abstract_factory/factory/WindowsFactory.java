package org.example.design_patterns.creational.abstract_factory.factory;

import org.example.design_patterns.creational.abstract_factory.button.Button;
import org.example.design_patterns.creational.abstract_factory.button.WindowsButton;
import org.example.design_patterns.creational.abstract_factory.checkbox.CheckBox;
import org.example.design_patterns.creational.abstract_factory.checkbox.WindowsCheckBox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
