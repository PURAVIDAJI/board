package com.example.board_test.Controller;


import com.example.board_test.Entity.Board;
import com.example.board_test.Service.BoardService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/board")
@AllArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/list")
    public String getAllBoards(Model m){
        List<Board> boards = boardService.getAllBoards();
        m.addAttribute("boards",boards);
        return "BoardList";

    }

    @GetMapping("/info/{seq}")
    public String getBoard(@PathVariable Long seq,
                           Model m){
        Optional<Board> board = boardService.getBoard(seq);
        Board boardInfo = board.get();

        m.addAttribute("board",boardInfo);
        return "BoardInfo";

    }

    @GetMapping("/add")
    public String addBoard(){
        return "BoardInsert";
    }

    @PostMapping("/add")
    public String addBoard(Board board){
        boardService.addProduct(board);

        return "redirect:/board/list";
    }

}
