package com.snook.gol.model;

public interface SimulationRule {
    CellState getNextState(int x, int y, Board board);
}
