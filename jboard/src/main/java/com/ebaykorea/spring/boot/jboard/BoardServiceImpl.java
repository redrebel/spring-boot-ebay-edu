package com.ebaykorea.spring.boot.jboard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {
    @Autowired
    BoardRepository boardRepository;

    @Override
    @Transactional(readOnly = true)
    public Board getBoard(Long id) {
        return boardRepository.getOne(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Board> getBoards() {
        return boardRepository.findAll();
    }

    @Override
    public Board addBoard(Board board) {
        return boardRepository.save(board);
    }
}
