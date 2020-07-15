/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jhw.modules.console;

import com.jhw.swing.material.components.textarea._MaterialTextArea;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

/**
 *
 * @author Jesus Hernandez Barrios (jhernandezb96@gmail.com)
 */
public class Console extends _MaterialTextArea {

    public Console() {
        redirectOut();
    }

    private void redirectOut() {
        OutputStream out = new OutputStream() {
            @Override
            public void write(int b) throws IOException {
                getTextArea().append(String.valueOf((char) b));
            }
        };
        PrintStream ps = new PrintStream(out);
        System.setErr(ps);
        System.setOut(ps);
    }

}
