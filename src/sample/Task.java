/**
 * 
 */
package sample;

/**
 * 仕事のタスクを表す列挙型
 * 
 * @author 修平
 * 
 */
public enum Task {
	SAP() {
		@Override
		public String doTask() {
			return "SAP";
		}
	}, //
	MANAGEMENT() {
		@Override
		public String doTask() {
			return "管理業務";
		}
	}, //
	WEB_DEV() {
		@Override
		public String doTask() {
			return "Web開発";
		}
	}, //
	DOT_NET() {
		@Override
		public String doTask() {
			return ".NET";
		}
	}, //
	MEETING() {
		@Override
		public String doTask() {
			return "会議";
		}
	};
	private Task() {
	}

	abstract public String doTask();
}
