package MVQ.tableRender;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class ColorTableRender extends DefaultTableCellRenderer { 
		private static final long serialVersionUID = 1L;
		public Component getTableCellRendererComponent(JTable table,Object value
				, boolean isSelected, boolean hasFocus, int row,
				int column) {
			if (isSelected && hasFocus && row == table.getSelectedRow() && column 
					== table.getSelectedColumn()) {
				//2.设置当前Cell的颜色
				Component c = super.getTableCellRendererComponent(table, value, isSelected
						, hasFocus, row, column);
				c.setBackground(Color.CYAN);//设置背景色
				c.setForeground(Color.gray);//设置前景色
				return c;
			} else {
				//3.设置单数行，偶数行的颜色
				if (row % 3 == 0) {//偶数行时的颜色 罗瑶光
					setBackground(new Color(253,233,254));
				}else if (row % 3 == 1) {//设置单数行的颜色
					setBackground(new Color(233,254,234));
				}else if (row % 3 == 2) {//设置单数行的颜色
					setBackground(new Color(255,251,232));
				}
				return super.getTableCellRendererComponent(table, value,
						isSelected, hasFocus, row, column);
			}
		}
	}