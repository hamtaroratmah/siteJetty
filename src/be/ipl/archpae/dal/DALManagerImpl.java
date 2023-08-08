package be.ipl.archpae.dal;

import java.lang.ref.WeakReference;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.commons.dbcp2.BasicDataSourceFactory;

import be.ipl.archpae.dal.jdbc.PreparedStatement;
import be.ipl.archpae.dal.jdbc.PreparedStatementImpl;
import be.ipl.archpae.dal.jdbc.SqlRuntimeException;
import be.ipl.archpae.dal.jdbc.Transaction;
import be.ipl.archpae.dal.jdbc.TransactionImpl;

public class DALManagerImpl implements DALManager {

	private BasicDataSource datasource;
	private final ThreadLocal<WeakReference<Transaction>> transactions;

	public DALManagerImpl(Properties properties) {
		transactions=new ThreadLocal<>();
		try {
			this.datasource = BasicDataSourceFactory.createDataSource(properties);
		} catch (Exception e) {
			throw new SqlRuntimeException("Unable to connect to DB ", e);
		}
	}
	

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.IDalManager#startTransaction()
   */
	@Override
  public Transaction startTransaction() {
		try {
			Transaction transaction=new TransactionImpl(this.datasource.getConnection());
			transactions.set(new WeakReference<Transaction>(transaction));
			return transaction;
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}
	
	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.IDalManager#getTransaction()
   */
	@Override
  public Transaction getTransaction() {
		return transactions.get().get();
	}


	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.IDalManager#prepareStatement(java.lang.String)
   */
	@Override
  public PreparedStatement prepareStatement(String ps) {
		try {
			return new PreparedStatementImpl(getTransaction().getConnection().prepareStatement(ps));
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}
	
	

}
