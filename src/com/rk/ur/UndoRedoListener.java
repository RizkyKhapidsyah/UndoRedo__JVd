package com.rk.ur;

import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.undo.UndoManager;

public class UndoRedoListener implements UndoableEditListener {

    UndoManager undoRedoManager;

    public UndoRedoListener(UndoManager X) {
        this.undoRedoManager = X;
    }

    public void undoableEditHappened(UndoableEditEvent Z) {
        undoRedoManager.addEdit(Z.getEdit());
    }
}
