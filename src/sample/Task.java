/**
 * 
 */
package sample;

/**
 * dÌ^XNð\·ñ^
 * 
 * @author C½
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
			return "ÇÆ±";
		}
	}, //
	WEB_DEV() {
		@Override
		public String doTask() {
			return "WebJ­";
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
			return "ïc";
		}
	};
	private Task() {
	}

	abstract public String doTask();
}
