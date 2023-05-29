package org.example.design_patterns.creational.abstract_factory.factory;

import org.example.design_patterns.creational.abstract_factory.button.Button;
import org.example.design_patterns.creational.abstract_factory.checkbox.CheckBox;

public interface GUIFactory {
    Button createButton();
    CheckBox createCheckBox();
}
