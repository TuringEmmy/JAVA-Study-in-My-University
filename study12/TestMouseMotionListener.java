package cn.legeyung.study12;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

/**
 * 
 * @author Ӻ���(Lege_Yung)
 * 
 */
public class TestMouseMotionListener extends MouseMotionAdapter {
	public void mouseMoved(MouseEvent e, TextField tf) {
		tf.setText("������꣺X=" + e.getX() + "Y=" + e.getY());
	}
}
