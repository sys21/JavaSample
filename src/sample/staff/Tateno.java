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
public class Tateno extends Person {
	public Tateno(final Task... tasks) {
		this(new ArrayList<Task>(Arrays.asList(tasks)));
	}

	public Tateno(final List<Task> tasks) {
		super("立野", Post.NONE, tasks);
	}

	@Override
	protected String doWork() {
		final StringBuilder b = new StringBuilder();
		for (final Task task : tasks) {
			b.append(task.doTask()).append("、");
		}
		final String result = b.toString();
		return String.format("%sです。", result.substring(0, result.length() - 1));
	}
}
