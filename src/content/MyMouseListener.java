package content;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MyMouseListener implements MouseListener, MouseMotionListener {

	private final guiHandler gui;
	private Point mousePosition;

	public MyMouseListener(guiHandler gui) {
		this.gui = gui;
	}

	public void mouseDragged(MouseEvent e) {
		
		this.gui.getpCenterPanel().addPoint(e.getX(), e.getY());
		this.gui.getpCenterPanel().setPenSize(this.gui.getPenSize());
		this.gui.getpCenterPanel().setColor(this.gui.getCurrentColor());
		this.gui.getpCenterPanel().repaint();
	}

	public void mouseReleased(MouseEvent e) {
		this.gui.getpCenterPanel().createLineObj();
		this.gui.getpCenterPanel().repaint();

	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		mousePosition = new Point(e.getX(), e.getY());
		if (this.gui.getpCenterPanel().getCopyAndPasteMode() == true) {
			this.gui.getpCenterPanel().copyAndPaste(mousePosition);
		}

	}

	public Point getMousePosition() {
		return mousePosition;
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

}
