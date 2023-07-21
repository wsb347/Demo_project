//package com;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import com.project.sep.back.Entity.Board;
//import com.project.sep.back.Entity.Article;
//
//@RestController
//@RequestMapping("/api/board")
//public class BoardController {
//
////    @Autowired
////    private BoardService boardService;
////
////    @Autowired
////    private ArticleService articleService;    Related with database implement later
//
//    @GetMapping("/{board_id}")
//    public ResponseEntity<?> viewBoard(@PathVariable Long board_id) {
//        Board board = boardService.getBoardById(board_id);
//        return ResponseEntity.ok(board);
//    }
//
//    @GetMapping("/{board_id}/article/{article_index}")
//    public ResponseEntity<?> viewArticle(@PathVariable Long board_id, @PathVariable Long article_index) {
//        Article article = articleService.getArticleById(article_index);
//        return ResponseEntity.ok(article);
//    }
//
//    @PostMapping("/{board_id}/article")
//    public ResponseEntity<?> writeArticle(@PathVariable Long board_id, @RequestBody Article article) {
//        Article savedArticle = articleService.saveArticle(board_id, article);
//        return ResponseEntity.ok(savedArticle);
//    }
//
//    @PatchMapping("/{board_id}/article/{article_index}")
//    public ResponseEntity<?> modifyArticle(@PathVariable Long board_id, @PathVariable Long article_index, @RequestBody Article article) {
//        Article updatedArticle = articleService.updateArticle(article_index, article);
//        return ResponseEntity.ok(updatedArticle);
//    }
//
//    @DeleteMapping("/{board_id}/article/{article_index}")
//    public ResponseEntity<?> deleteArticle(@PathVariable Long board_id, @PathVariable Long article_index) {
//        articleService.deleteArticle(article_index);
//        return ResponseEntity.ok().build();
//    }
//
//    // 좋아요 기능 및 필터, 검색 기능은 아직 구현되지 않았습니다.
//}
