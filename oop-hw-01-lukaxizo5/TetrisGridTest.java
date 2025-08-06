import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TetrisGridTest {
	
	// Provided simple clearRows() test
	// width 2, height 3 grid
	@Test
	public void testClear1() {
		boolean[][] before =
		{	
			{true, true, false, },
			{false, true, true, }
		};
		
		boolean[][] after =
		{	
			{true, false, false},
			{false, true, false}
		};
		
		TetrisGrid tetris = new TetrisGrid(before);
		tetris.clearRows();

		assertTrue( Arrays.deepEquals(after, tetris.getGrid()) );
	}

	@Test
	public void testClear2() {
		boolean[][] before =
		{
			{true, true, false, true, true},
			{false, true, true, true, true},
			{false, true, true, false, true},
			{false, true, true, false, true}
		};
		boolean[][] after =
		{
			{true, false, true, false, false},
			{false, true, true, false, false},
			{false, true, false, false, false},
			{false, true, false, false, false}
		};
		TetrisGrid tetris = new TetrisGrid(before);
		tetris.clearRows();
		assertTrue( Arrays.deepEquals(after, tetris.getGrid()) );
	}

	@Test
	public void testClear3() {
		boolean[][] before =
		{
			{true, true}
		};
		boolean[][] after =
		{
			{false, false}
		};
		TetrisGrid tetris = new TetrisGrid(before);
		tetris.clearRows();
		assertTrue( Arrays.deepEquals(after, tetris.getGrid()) );
	}

	@Test
	public void testClear4() {
		// empty
		boolean[][] before =
				{
						{}
				};
		boolean[][] after =
				{
						{}
				};
		TetrisGrid tetris = new TetrisGrid(before);
		tetris.clearRows();
		assertTrue( Arrays.deepEquals(after, tetris.getGrid()) );
	}

	@Test
	public void testClear5() {
		boolean[][] before =
				{
						{false, false},
						{false, false}
				};
		boolean[][] after =
				{
						{false, false},
						{false, false}
				};
		TetrisGrid tetris = new TetrisGrid(before);
		tetris.clearRows();
		assertTrue( Arrays.deepEquals(after, tetris.getGrid()) );
	}
	
}
