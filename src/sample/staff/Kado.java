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
public class Kado extends Person {
	public Kado(final Task... tasks) {
		this(new ArrayList<Task>(Arrays.asList(tasks)));
	}

	public Kado(final List<Task> tasks) {
		super("ñÂ", Post.NONE, tasks);
	}

	@Override
	protected String doWork() {
		final StringBuilder b = new StringBuilder();
		for (final Task task : tasks) {
			b.append(task.doTask()).append("Ç∆");
		}
		final String result = b.toString();
		return String.format("%sÇ¡Ç∑ÅIÅI", result.substring(0, result.length() - 1));
	}
}
