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
 * @author 修平
 * 
 */
public class Kado extends Person {
	public Kado(final Task... tasks) {
		this(new ArrayList<Task>(Arrays.asList(tasks)));
	}

	public Kado(final List<Task> tasks) {
		super("門", Post.NONE, tasks);
	}

	@Override
	protected String doWork() {
		final StringBuilder b = new StringBuilder();
		for (final Task task : tasks) {
			b.append(task.doTask()).append("と");
		}
		final String result = b.toString();
		return String.format("%sっす！！", result.substring(0, result.length() - 1));
	}
}
