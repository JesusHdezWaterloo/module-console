package com.jhw.modules.console;

import com.clean.swing.app.AbstractSwingApplication;
import com.clean.swing.app.DefaultAbstractSwingMainModule;
import com.clean.swing.app.dashboard.DashBoardSimple;
import com.clean.swing.app.dashboard.DashboardConstants;
import com.jhw.swing.material.standards.MaterialColors;
import com.jhw.swing.material.standards.MaterialIcons;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class ConsoleSwingModule extends DefaultAbstractSwingMainModule {

    public static final ConsoleFrame consoleFrame = new ConsoleFrame();

    private ConsoleSwingModule() {
    }

    public static ConsoleSwingModule init() {
        System.out.println("Iniciando 'Consola'");
        return new ConsoleSwingModule();
    }

    @Override
    public void register(AbstractSwingApplication app) {
        registerConsole(app);
        System.out.println("Bienvenido a la consola..... ☺");
        System.out.println("Aqui se ve todo el trabajo en background del sistema.");
    }

    private void registerConsole(AbstractSwingApplication app) {
        DashBoardSimple dash = app.rootView().dashboard();
        dash.addKeyValue(DashboardConstants.UP_ELEMENT, new AbstractAction("Consola", MaterialIcons.DEVELOPER_BOARD.deriveIcon(MaterialColors.WHITE)) {
            @Override
            public void actionPerformed(ActionEvent e) {
                showConsole();
            }
        });
    }

    public void showConsole() {
        consoleFrame.setVisible(true);
    }

    @Override
    public void closeModule() {
        consoleFrame.dispose();
    }

}
