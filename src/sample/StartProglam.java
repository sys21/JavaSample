package sample;

import sample.staff.Kado;
import sample.staff.Sasaki;
import sample.staff.Takano;
import sample.staff.Tateno;

/**
 * 
 */
/**
 * @author �C��
 * 
 */
public class StartProglam {
	public static void main(final String[] args) {
		System.out.println("StartProglam");
		// �E��I�u�W�F�N�g����
		final WorkplaceController wc = new WorkplaceController();
		{
			wc.addStaff(new Sasaki(Task.MANAGEMENT, Task.SAP, Task.MEETING));
			wc.addStaff(new Takano(Task.SAP, Task.MEETING));
			wc.addStaff(new Kado(Task.DOT_NET, Task.MEETING));
			wc.addStaff(new Tateno(Task.WEB_DEV, Task.MEETING));
		}
		wc.start(StartArgument.parse(args));
	}
}
