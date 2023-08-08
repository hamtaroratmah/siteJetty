package be.ipl.archpae.utils;

public class FatalException extends AppException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5926196101906096391L;

	public FatalException() {
		super();
	}

	public FatalException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public FatalException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public FatalException(String arg0) {
		super(arg0);
	}

	public FatalException(Throwable arg0) {
		super(arg0);
	}

}
