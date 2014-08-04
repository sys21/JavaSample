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
 * @author èCïΩ
 * 
 */
public class Sasaki extends Person {
	public Sasaki(final Task... tasks) {
		this(new ArrayList<Task>(Arrays.asList(tasks)));
	}

	public Sasaki(final List<Task> tasks) {
		super("ç≤ÅXñÿ", Post.MANAGER, tasks);
	}

	@Override
	protected String doWork() {
		final StringBuilder b = new StringBuilder();
		for (final Task task : tasks) {
			b.append(task.doTask()).append(" ");
		}
		return b.toString().trim();
	}
}
