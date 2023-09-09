package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.view;

public class counterListener implements ActionListener{
	private view v;

	public counterListener(view v) {
		this.v = v;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		
		if(src.equals("+")) {
			this.v.cong();
		}else if(src.equals("-")) {
			this.v.tru();
		}else if(src.equals("*")) {
			this.v.nhan();
		}else if(src.equals("/")) {
			this.v.chia();
		}else if(src.equals("^")) {
			this.v.pow();
		}else if(src.equals("%")) {
			this.v.mod();
		}
	}
}
