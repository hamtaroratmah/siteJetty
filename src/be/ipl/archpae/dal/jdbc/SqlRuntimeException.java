package be.ipl.archpae.dal.jdbc;

public class SqlRuntimeException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5046931867965583119L;

	public SqlRuntimeException() {
		super();
	}

	public SqlRuntimeException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public SqlRuntimeException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public SqlRuntimeException(String arg0) {
		super(arg0);
	}

	public SqlRuntimeException(Throwable arg0) {
		super(arg0);
	}
	
}
