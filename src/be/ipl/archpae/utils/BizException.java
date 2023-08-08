package be.ipl.archpae.utils;

public class BizException extends AppException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7326237860827882401L;

	public BizException() {
		super();
	}

	public BizException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public BizException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public BizException(String arg0) {
		super(arg0);
	}

	public BizException(Throwable arg0) {
		super(arg0);
	}


}
