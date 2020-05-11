package com.rk.ur;

import javax.swing.*;
import javax.swing.undo.UndoManager;
import java.awt.*;
import java.awt.event.KeyEvent;

public class FormUtama extends JFrame {

    JTextArea textArea;
    final UndoManager undoRedoManager = new UndoManager();

    public FormUtama() {
        super("Undo/Redo Text");
        Inisialisasi_Komponen();
    }

    private void Inisialisasi_Komponen() {
        textArea = new JTextArea();
        textArea.getDocument().addUndoableEditListener(new UndoRedoListener(undoRedoManager));
        textArea.setPreferredSize(new Dimension(300, 200));
        setUndo();
        setRedo();
        getContentPane().add(textArea, BorderLayout.CENTER);

        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void setRedo() {
        textArea.getActionMap().put("Redo", new RedoAction(undoRedoManager));
        textArea.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_Y, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()), "Redo");
    }

    private void setUndo() {
        textArea.getActionMap().put("Undo", new UndoAction(undoRedoManager));
        textArea.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_Z, Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()), "Undo");
    }
}
