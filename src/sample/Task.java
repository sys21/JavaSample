/**
 * 
 */
package sample;

/**
 * �d���̃^�X�N��\���񋓌^
 * 
 * @author �C��
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
			return "�Ǘ��Ɩ�";
		}
	}, //
	WEB_DEV() {
		@Override
		public String doTask() {
			return "Web�J��";
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
			return "��c";
		}
	};
	private Task() {
	}

	abstract public String doTask();
}
