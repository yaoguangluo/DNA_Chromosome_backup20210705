package OP.SM.AOP.MEC.SIQ.SM.reflection;
public class Cell{
	public Object getCellValue() {
		return cellValue;
	}

	public void I_CellValue(Object cellValue) {
		this.cellValue = cellValue;
	}

	private Object cellValue;
}