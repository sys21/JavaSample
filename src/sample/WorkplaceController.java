/**
 * 
 */
package sample;

import java.util.ArrayList;
import java.util.List;
import sample.staff.Person;

/**
 * �E���\���N���X
 * 
 * @author �C��
 * 
 */
public class WorkplaceController {
	final public List<Person> staffMembers = new ArrayList<Person>();

	public void addStaff(final Person person) {
		staffMembers.add(person);
	}

	public void removeStaff(final int i) {
		staffMembers.remove(i);
	}

	public void allRemoveStaff() {
		staffMembers.clear();
	}

	void start(final List<StartArgument> args) {
		for (final StartArgument arg : args) {
			arg.controll(this);
		}
		if (args.isEmpty()) {
			System.out.println("set argment: [introduction], [work]");
		}
	}

	/**
	 * �E���Љ�
	 */
	void staffIntroduction() {
		System.out.println("-- �E���Љ� --");
		for (final Person staff : staffMembers) {
			staff.doSelfIntroduction();
		}
	}

	/**
	 * �d��
	 */
	void work() {
		System.out.println("-- �Ɩ��J�n --");
		for (final Person staff : staffMembers) {
			staff.startWork();
		}
	}
}
