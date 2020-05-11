package com.rk.ur;

import javax.swing.*;
import javax.swing.undo.CannotUndoException;
import javax.swing.undo.UndoManager;
import java.awt.event.ActionEvent;

public class UndoAction extends AbstractAction {

    UndoManager undoRedoManager;

    public UndoAction(UndoManager undoRedoManager) {
        this.undoRedoManager = undoRedoManager;
    }

    public void actionPerformed(ActionEvent AE) {
        try {
            if (undoRedoManager.canUndo()) {
                undoRedoManager.undo();
            }
        } catch (CannotUndoException CUE) {
            System.out.println(CUE);
        }
    }
}
