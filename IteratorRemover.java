//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import static java.lang.System.*;

public class IteratorRemover
{
	private ArrayList<String> list;
	private String toRemove;

	public IteratorRemover(String line, String rem)
	{
		String[] words = line.split(" ");
		list = new ArrayList<String>(Arrays.asList(words));
		toRemove = rem;
	}

	public void setList(String line, String rem) {
		String[] words = line.split(" ");
		list = new ArrayList<String>(Arrays.asList(words));
		toRemove = rem;
	}
	
	public void remove()
	{
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			if (it.next().equals(toRemove)) {
				it.remove();
			}
		}
	}

	public String toString()
	{
		return list + "\n\n";
	}
}