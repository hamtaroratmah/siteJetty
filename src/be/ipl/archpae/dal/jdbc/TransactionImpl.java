package be.ipl.archpae.dal.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public class TransactionImpl implements Transaction {

	private Connection con;

	public TransactionImpl(Connection con) {
		try {
			this.con = con;
			con.setAutoCommit(false);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.ITransaction#close()
   */
	@Override
	public void close() {
		try {
			if (!con.isClosed()) {
				commit();
			}
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.ITransaction#commit()
   */
	@Override
  public void commit() {
		try {
			con.commit();
			con.setAutoCommit(true);
			con.close();
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.ITransaction#rollback()
   */
	@Override
  public void rollback() {
		try {
			con.rollback();
			con.setAutoCommit(true);
			con.close();
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}
	
	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.ITransaction#getConnection()
   */
	@Override
  public Connection getConnection() {
		return con;
	}
}
