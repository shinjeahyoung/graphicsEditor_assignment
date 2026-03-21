package org.example;

import javax.swing.*;
import java.awt.*;

public class GMainFrame extends JFrame {
    //attributes(속성)
    private int size; // 이런거 JFrame에서 다 만들어 놔서 필요 없음

    // components(부품, 자식)
    private GMenuBar menuBar;
    private GToolBar toolBar;
    private GDrawingPanel drawingPanel;

    // associations(친구)

    // construct 생성자
    public GMainFrame() {
        // set attributes 속성 세팅
        super("GMainFrame");
        this.setSize(600, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        // create aggregation 자식 생성
        this.menuBar = new GMenuBar();
        this.setJMenuBar(menuBar); //GMainFrame 자식 등록

        this.toolBar = new GToolBar();
        this.add(toolBar, BorderLayout.NORTH); //GMainFrame 자식 등록

        this.drawingPanel = new GDrawingPanel();
        this.add(drawingPanel, BorderLayout.CENTER);
    }

    // member functions (함수, 동사(기능))

}
