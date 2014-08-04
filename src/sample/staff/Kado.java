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
 * @author �C��
 * 
 */
public class Kado extends Person {
	public Kado(final Task... tasks) {
		this(new ArrayList<Task>(Arrays.asList(tasks)));
	}

	public Kado(final List<Task> tasks) {
		super("��", Post.NONE, tasks);
	}

	@Override
	protected String doWork() {
		final StringBuilder b = new StringBuilder();
		for (final Task task : tasks) {
			b.append(task.doTask()).append("��");
		}
		final String result = b.toString();
		return String.format("%s�����I�I", result.substring(0, result.length() - 1));
	}
}
