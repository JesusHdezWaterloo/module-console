package com.jhw.modules.console;

import com.clean.swing.app.AbstractSwingApplication;
import com.clean.swing.app.AbstractSwingMainModule;
import com.clean.swing.app.dashboard.DashBoardSimple;
import com.clean.swing.app.dashboard.DashboardConstants;
import com.jhw.swing.material.standards.MaterialColors;
import com.jhw.swing.material.standards.MaterialIcons;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class ConsoleSwingModule implements AbstractSwingMainModule {

    public static final ConsoleFrame consoleFrame = new ConsoleFrame();

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

    /**
     * Dont need navigation
     *
     * @param string
     * @param o
     */
    @Override
    public void navigateTo(String string, Object... o) {
    }

}
