package org.howard.edu.lsp.exam.question42.junit;

import static org.junit.Assert.*;

import java.util.Set;

import org.howard.edu.lsp.exam.question42.SongsDatabase;
import org.junit.Test;

public class TestSongsDatabase {

	@Test
	public void testGetGenreOfSong() {
		SongsDatabase db = new SongsDatabase();
		db.addSong("Rap", "Savage");
		db.addSong("Rap", "Gin and Juice");
		db.addSong("Jazz", "Always There");
		
		// We add 3 songs and test to make sure all 3 are returning the right genre
		assertEquals( db.getGenreOfSong("Always There"), "Jazz");
		assertEquals(db.getGenreOfSong("Savage"), "Rap" );
		assertEquals(db.getGenreOfSong("Gin and Juice"), "Rap" );
	}
	
	@Test
	public void testGetSongs() {
		SongsDatabase db = new SongsDatabase();
		db.addSong("Rap", "Savage");
		db.addSong("Rap", "Gin and Juice");
		db.addSong("Jazz", "Always There");
		
		// After we add 3 songs in two different catagories
		// We test to make sure that they are staying in their catagory 
		assertTrue( db.getSongs("Rap").contains("Gin and Juice"));
		assertTrue( db.getSongs("Rap").contains("Savage"));
		assertFalse( db.getSongs("Rap").contains("Always There"));

		assertTrue( db.getSongs("Jazz").contains("Always There"));
		assertFalse( db.getSongs("Jazz").contains("Savage"));
		assertFalse( db.getSongs("Jazz").contains("Gin and Juice"));
	}

}
