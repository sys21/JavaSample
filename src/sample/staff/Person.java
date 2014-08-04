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
 * �l��\���N���X
 * 
 * @author �C��
 * 
 */
abstract public class Person {
	private String name;
	private Post post;
	protected List<Task> tasks;

	public Person(final String name, final Post post, final Task... tasks) {
		this(name, post, new ArrayList<Task>(Arrays.asList(tasks)));
	}

	public Person(final String name, final Post post, final List<Task> tasks) {
		this.name = name;
		this.post = post;
		this.tasks = tasks;
	}

	public void doSelfIntroduction() {
		System.out.println(String.format("����%s�ł��B��E��%s�ł��B", name, post.getLabel()));
	}

	public void startWork() {
		System.out.println(String.format("%s : %s", name, doWork()));
	}

	abstract protected String doWork();
}