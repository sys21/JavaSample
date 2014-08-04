/**
 * 
 */
package sample;

import java.util.ArrayList;
import java.util.List;

/**
 * @author èCïΩ
 * 
 */
public enum StartArgument {
	INTRODUCTION() {
		@Override
		void controll(final WorkplaceController controller) {
			controller.staffIntroduction();
		}
	}, //
	WORK() {
		@Override
		void controll(final WorkplaceController controller) {
			controller.work();
		}
	}, //
	;
	private StartArgument() {
	}

	static public List<StartArgument> parse(final String[] args) {
		final List<StartArgument> list = new ArrayList<StartArgument>();
		for (final String arg : args) {
			list.add(parse(arg));
		}
		return list;
	}

	static public StartArgument parse(final String label) {
		return StartArgument.valueOf(label.toUpperCase());
	}

	abstract void controll(final WorkplaceController controller);
}
