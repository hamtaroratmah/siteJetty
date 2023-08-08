package be.ipl.archpae.utils;

public class AppException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9192732907858398961L;

	public AppException() {
		super();
	}

	public AppException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public AppException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public AppException(String arg0) {
		super(arg0);
	}

	public AppException(Throwable arg0) {
		super(arg0);
	}

}
