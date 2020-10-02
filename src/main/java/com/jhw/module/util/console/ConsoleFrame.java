/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jhw.module.util.console;

import com.jhw.swing.material.standards.MaterialIcons;
import com.jhw.swing.util.Utils;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import javax.swing.JFrame;

/**
 *
 * @author Jesus Hernandez Barrios (jhernandezb96@gmail.com)
 */
public class ConsoleFrame extends JFrame {

    private static final Console console = new Console();

    public ConsoleFrame() throws HeadlessException {
        initComponents();
    }

    private void initComponents() {
        this.setLayout(new BorderLayout());
        this.add(console);

        this.setTitle("Consola");
        this.setIconImage(MaterialIcons.DEVELOPER_BOARD.getImage());

        Rectangle screen = Utils.getScreenSize();
        this.setSize(new Dimension((int) screen.getWidth() - 200, (int) screen.getHeight() / 2));
        this.setResizable(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }
}
