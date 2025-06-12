package org.scoula.board.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.scoula.board.dto.BoardDTO;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;
@Log4j2
class BoardServiceTest {

    private final BoardService boardService;
    private final BoardService service;

    BoardServiceTest(BoardService boardService, BoardService service) {
        this.boardService = boardService;
        this.service = service;
    }

    // 목록 조회 테스트
    @Test
    public void getList() {
        List<BoardDTO> list = boardService.getList();

        assertFalse(list.isEmpty());           // 목록이 비어있지 않은지 확인

        for(BoardDTO board : list) {
            log.info("게시글: {}", board);
            assertNotNull(board.getNo());      // 게시글 번호 존재 확인
            assertNotNull(board.getTitle());   // 제목 존재 확인
        }
    }

    // 단일 조회 테스트
    @Test
    void get() {
        Long testNo = 1L;
        BoardDTO board = service.get(testNo);

        assertNotNull(board);                          // 조회 결과 존재 확인
        assertEquals(testNo, board.getNo());           // 번호 일치 확인

        log.info("조회된 게시글: {}", board);
    }

    // 게시글 등록 테스트
    @Test
    public void create() {
        BoardDTO board = BoardDTO.builder()
                .title("서비스 테스트 제목")
                .content("서비스 테스트 내용")
                .writer("testuser")
                .build();

        boardService.create(board);

        assertNotNull(board.getNo());              // PK가 설정되었는지 확인
        log.info("생성된 게시물 번호: {}", board.getNo());
    }

    // 게시글 수정 테스트
    @Test
    public void update() {
        // 기존 게시글 조회
        BoardDTO board = boardService.get(1L);

        // 데이터 수정
        board.setTitle("수정된 제목");
        board.setContent("수정된 내용");

        boolean result = boardService.update(board);

        assertTrue(result);                           // 수정 성공 확인
        log.info("update RESULT: {}", result);

        // 수정 결과 재조회로 확인
        BoardDTO updatedBoard = boardService.get(1L);
        assertEquals("수정된 제목", updatedBoard.getTitle());
    }


    // 게시글 삭제 테스트
    @Test
    public void delete() {
        Long testNo = 2L;

        // 삭제 전 존재 확인
        assertDoesNotThrow(() -> boardService.get(testNo));

        // 삭제 실행
        boolean result = boardService.delete(testNo);
        assertTrue(result);                       // 삭제 성공 확인

        // 삭제 후 조회 시 예외 발생 확인
        assertThrows(NoSuchElementException.class, () -> {
            boardService.get(testNo);
        });

        log.info("delete RESULT: {}", result);
    }




    // 전체 시나리오 테스트
    @Test
    @DisplayName("게시판 CRUD 전체 시나리오")
    @Transactional
    @Rollback  // 테스트 후 롤백하여 데이터 정리
    public void fullCrudScenario() {
        // 1. Create - 게시글 생성
        BoardDTO newBoard = BoardDTO.builder()
                .title("통합테스트 제목")
                .content("통합테스트 내용")
                .writer("tester")
                .build();

        boardService.create(newBoard);
        Long createdNo = newBoard.getNo();
        assertNotNull(createdNo);

        // 2. Read - 생성된 게시글 조회
        BoardDTO foundBoard = boardService.get(createdNo);
        assertEquals("통합테스트 제목", foundBoard.getTitle());
        assertEquals("tester", foundBoard.getWriter());

        // 3. Update - 게시글 수정
        foundBoard.setTitle("수정된 제목");
        foundBoard.setContent("수정된 내용");
        boolean updateResult = boardService.update(foundBoard);
        assertTrue(updateResult);

        // 4. 수정 결과 확인
        BoardDTO updatedBoard = boardService.get(createdNo);
        assertEquals("수정된 제목", updatedBoard.getTitle());
        assertEquals("수정된 내용", updatedBoard.getContent());

        // 5. Delete - 게시글 삭제
        boolean deleteResult = boardService.delete(createdNo);
        assertTrue(deleteResult);

        // 6. 삭제 확인
        assertThrows(NoSuchElementException.class, () -> {
            boardService.get(createdNo);
        });
    }
}