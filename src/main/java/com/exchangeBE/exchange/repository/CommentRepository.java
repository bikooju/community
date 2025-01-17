package com.exchangeBE.exchange.repository;

import com.exchangeBE.exchange.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByBoardId(Long boardId);
}
