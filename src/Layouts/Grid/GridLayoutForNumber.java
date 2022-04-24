package Layouts.Grid;

import java.awt.GridLayout;

public class GridLayoutForNumber extends GridLayout{

	public GridLayoutForNumber(int columns,int rows) {
		// TODO Auto-generated constructor stub
		this.setColumns(columns);
		this.setHgap(5);
		this.setRows(rows);
		this.setVgap(5);
	}

}
