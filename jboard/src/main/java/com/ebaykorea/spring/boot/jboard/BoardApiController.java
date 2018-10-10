package com.ebaykorea.spring.boot.jboard;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/boards")
public class BoardApiController {
    private BoardService boardService;

    // 생성자 주입
    public BoardApiController(BoardService boardService){
        this.boardService = boardService;
        System.out.println("BoardApiController(boardService)");
    }

    //public BoardApiController(){
    //    System.out.println("BoardApiController()");
    //}

    // get방식
    // http://localhost:8080/boards/1?page=5 /// page파라미터가 없으면 page값은 기본으로 1을 가진다.
    // http://localhost:8080/boards/1?category=free
    @GetMapping("/{id}")
    public Board getBoards(@PathVariable(name="id") Long id,
                           @RequestParam(name= "category", required =false) String category,
                           @RequestParam(name="page", required=false, defaultValue = "1") String page){
        System.out.println("category : " + category);
        System.out.println("page : " + page);
        Board board  = boardService.getBoard(id);
        return board;
    }

    // post방식
    // 메시지컴버터에서 내부적으로 jackson을 사용
    @PostMapping("/{id}")
    public Board write(@PathVariable(name="id") Long id,
                       @RequestBody Board board){
        System.out.println(board.getName());
        System.out.println(board.getContent());
        System.out.println(board.getId());
        return board;
    }

}
