package interfaces;
import java.awt.Dimension;

import entities.Cell;
import exceptions.OutOfWaffleException;

public interface BoardInterface {
	public Dimension getSize();
	public Cell getCell(int x, int y) throws OutOfWaffleException;
	public void setCell(int x, int y, Cell c) throws OutOfWaffleException;
}