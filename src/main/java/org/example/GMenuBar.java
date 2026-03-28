package org.example;

import javax.swing.*;

public class GMenuBar extends JMenuBar {
    private GFileMenu fileMenu;

    public GMenuBar() {
        // component(부품, 자식)
        this.fileMenu = new GFileMenu();
        this.add(fileMenu);
    }
}
