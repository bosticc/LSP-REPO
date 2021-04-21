/**
 * 
 */
package org.howard.edu.lsp.exam.question42;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author bostic
 *
 */

public class SongsDatabase {
	private Map<String, Set<String>> map = new HashMap<String, Set<String>>();
	
	 	/* Add a song title to a genre */
    	public void addSong(String genre, String songTitle) {
    		if(map.keySet().contains(genre))
    		{
    			map.get(genre).add(songTitle);
    		}
    		else
    		{
    			Set<String> theseSongs = new HashSet<String>();
    			theseSongs.add(songTitle);
    			map.put(genre, theseSongs);
    		}
			System.out.println(map);
    	}
    
    		/* Return the Set that contains all songs for a genre */
 		public Set<String> getSongs(String genre) {
 			return map.get(genre);
    	}
    		/* Return genre, i.e., jazz, given a song title */
    	public String getGenreOfSong(String songTitle) {
    		for(String key: map.keySet())
    		{
    			if(map.get(key).contains(songTitle)) {
    				return key;
    			}
    		}
    		return null;
    	}
}
