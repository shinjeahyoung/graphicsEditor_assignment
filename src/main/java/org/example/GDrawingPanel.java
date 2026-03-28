package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GDrawingPanel extends JPanel {
    public GDrawingPanel() {
        super();
        this.setBackground(Color.CYAN);
    }

    private void startDrawing(int x, int y) {
        Graphics graphics = this.getGraphics();
    }
    private void keepDrawing(int x, int y) {

    }
    private void stopDrawing(int x, int y) {

    }

    private class MouseHandler implements MouseListener, MouseMotionListener {

        @Override
        public void mouseClicked(MouseEvent e) {
        }
        @Override
        public void mousePressed(MouseEvent e) {
            startDrawing(e.getX(), e.getY());
        }
        @Override
        public void mouseDragged(MouseEvent e) {
            keepDrawing(e.getX(), e.getY());
        }
        @Override
        public void mouseReleased(MouseEvent e) {
            stopDrawing(e.getX(), e.getY());
        }
        @Override
        public void mouseEntered(MouseEvent e) {
        }
        @Override
        public void mouseExited(MouseEvent e) {
        }

        @Override
        public void mouseMoved(MouseEvent e) {
        }
    }

}
