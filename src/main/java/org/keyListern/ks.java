package org.keyListern;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ks implements KeyListener {

    @Override
    public void keyTyped(KeyEvent keyEvent) {
        System.out.println(KeyEvent.getKeyText(keyEvent.getKeyCode()));
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        System.out.println(KeyEvent.getKeyText(keyEvent.getKeyCode()));
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
        System.out.println(KeyEvent.getKeyText(keyEvent.getKeyCode()));
    }
}
