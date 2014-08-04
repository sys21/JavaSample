/**
 * 
 */
package sample.staff;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import sample.Post;
import sample.Task;

/**
 * @author C•½
 * 
 */
public class Takano extends Person {
	public Takano(final Task... tasks) {
		this(new ArrayList<Task>(Arrays.asList(tasks)));
	}

	public Takano(final List<Task> tasks) {
		super("‚–ì", Post.NONE, tasks);
	}

	@Override
	protected String doWork() {
		final StringBuilder b = new StringBuilder();
		for (final Task task : tasks) {
			b.append(task.doTask()).append(", ");
		}
		final String result = b.toString();
		return String.format("%s‚ğs‚¢‚Ü‚µ‚½B", result.substring(0, result.length() - 2));
	}
}
