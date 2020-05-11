package com.rk.ur;

import javax.swing.*;
import javax.swing.undo.CannotUndoException;
import javax.swing.undo.UndoManager;
import java.awt.event.ActionEvent;

public class RedoAction extends AbstractAction {

    UndoManager undoRedoManagaer;

    public RedoAction(UndoManager undoRedoManagaer) {
        this.undoRedoManagaer = undoRedoManagaer;
    }

    public void actionPerformed(ActionEvent P) {
        try {
            if (undoRedoManagaer.canRedo()) {
                undoRedoManagaer.redo();
            }
        } catch (CannotUndoException CUE) {
            System.out.println(CUE);
        }
    }
}
