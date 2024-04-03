package kr.or.ddit.mybatis.mappers;

import static org.junit.jupiter.api.Assertions.*;

import javax.inject.Inject;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import kr.or.ddit.AbstractRootContextTest;
import kr.or.ddit.vo.BoardVO;

class BoardMapperTest extends AbstractRootContextTest{

	@Inject
	private BoardMapper dao;

	@Test
	void testInsert() {
		fail("Not yet implemented");
	}

	@Test
	void testSelect() {
		BoardVO board = dao.select(1);
		assertNotNull(board);
	}

	@Test
	void testSelectTotalRecord() {
		fail("Not yet implemented");
	}

	@Test
	void testSelectList() {
		fail("Not yet implemented");
	}

	@Test
	void testUdpate() {
		fail("Not yet implemented");
	}

	@Test
	void testDelete() {
		fail("Not yet implemented");
	}

}
