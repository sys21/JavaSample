/**
 * 
 */
package sample;

/**
 * ��E��\���񋓌^
 * 
 * @author �C��
 * 
 */
public enum Post {
	MANAGER("����"), //
	LEADER("���[�_�["), //
	NONE("�Ȃ�"), ;
	private Post(final String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	private String label;
}
