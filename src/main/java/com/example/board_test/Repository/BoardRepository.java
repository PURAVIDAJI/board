package com.example.board_test.Repository;

import com.example.board_test.Entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board,Long> {


}
