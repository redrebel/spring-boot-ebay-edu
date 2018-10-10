package com.ebaykorea.spring.boot.jboard;

import java.util.List;

public interface BoardService {
    public Board getBoard(Long id);
    public List<Board> getBoards();
    public Board addBoard(Board board);
}
