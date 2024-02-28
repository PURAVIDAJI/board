package com.example.board_test.Service;

import com.example.board_test.Entity.Board;
import com.example.board_test.Entity.BoardDto;
import com.example.board_test.Repository.BoardRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class BoardService{
    private final BoardRepository boardRepository;

    public List<Board> getAllBoards(){
        List<Board> all = boardRepository.findAll();
        return all;
    }

    public Optional<Board> getBoard(Long id){
        return boardRepository.findById(id);

    }

    public String addProduct(Board board){
        boardRepository.save(board);
        return "추가완료";
    }

    public String updateProduct(BoardDto boardupdate){
        Optional<Board> byId = boardRepository.findById(boardupdate.getSeq());
        Board board = byId.get();
        board.setTitle(boardupdate.getTitle());
        board.setContent(boardupdate.getContent());
        boardRepository.save(board);
        return "수정 완료";
    }
    public String deleteProduct(long id){
        boardRepository.deleteById(id);
        return "삭제 완료";
    }

}
