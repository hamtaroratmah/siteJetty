package be.ipl.archpae.dal.jdbc;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Date;
import java.sql.NClob;
import java.sql.Ref;
import java.sql.ResultSetMetaData;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLXML;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;

public class PreparedStatementImpl implements PreparedStatement {

	private final java.sql.PreparedStatement preparedStatement;

	public PreparedStatementImpl(java.sql.PreparedStatement preparedStatement) {
		this.preparedStatement = preparedStatement;
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.PreparedStatement#executeQuery()
   */
	@Override
  public ResultSet executeQuery() {
		try {
			return new ResultSetImpl(this.preparedStatement.executeQuery());
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.PreparedStatement#getMetaData()
   */
	@Override
  public ResultSetMetaData getMetaData() {
		try {
			return this.preparedStatement.getMetaData();
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.PreparedStatement#executeUpdate()
   */
	@Override
  public int executeUpdate() {
		try {
			return this.preparedStatement.executeUpdate();
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.PreparedStatement#clearParameters()
   */
	@Override
  public void clearParameters() {
		try {
			this.preparedStatement.clearParameters();
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.PreparedStatement#isClosed()
   */
	@Override
  public boolean isClosed() {
		try {
			return this.preparedStatement.isClosed();
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}
	
	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.PreparedStatement#close()
   */
	@Override
  public void close() {
		try {
			this.preparedStatement.close();
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}		
	}
	
	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.PreparedStatement#setArray(int, java.sql.Array)
   */
	@Override
  public void setArray(int idx, Array o) {
		try {
			this.preparedStatement.setArray(idx, o);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.PreparedStatement#setAsciiStream(int, java.io.InputStream)
   */
	@Override
  public void setAsciiStream(int idx, InputStream o) {
		try {
			this.preparedStatement.setAsciiStream(idx, o);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.PreparedStatement#setAsciiStream(int, java.io.InputStream, long)
   */
	@Override
  public void setAsciiStream(int idx, InputStream i, long o) {
		try {
			this.preparedStatement.setAsciiStream(idx, i, o);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.PreparedStatement#setAsciiStream(int, java.io.InputStream, int)
   */
	@Override
  public void setAsciiStream(int idx, InputStream is, int o) {
		try {
			this.preparedStatement.setAsciiStream(idx, is, o);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.PreparedStatement#setBigDecimal(int, java.math.BigDecimal)
   */
	@Override
  public void setBigDecimal(int idx, BigDecimal o) {
		try {
			this.preparedStatement.setBigDecimal(idx, o);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.PreparedStatement#setBinaryStream(int, java.io.InputStream)
   */
	@Override
  public void setBinaryStream(int idx, InputStream o) {
		try {
			this.preparedStatement.setBinaryStream(idx, o);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.PreparedStatement#setBinaryStream(int, java.io.InputStream, long)
   */
	@Override
  public void setBinaryStream(int idx, InputStream is, long o) {
		try {
			this.preparedStatement.setBinaryStream(idx, is, o);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.PreparedStatement#setBinaryStream(int, java.io.InputStream, int)
   */
	@Override
  public void setBinaryStream(int idx, InputStream is, int o) {
		try {
			this.preparedStatement.setBinaryStream(idx, is, o);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.PreparedStatement#setBlob(int, java.io.InputStream)
   */
	@Override
  public void setBlob(int idx, InputStream o) {
		try {
			this.preparedStatement.setBlob(idx, o);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.PreparedStatement#setBlob(int, java.sql.Blob)
   */
	@Override
  public void setBlob(int idx, Blob o) {
		try {
			this.preparedStatement.setBlob(idx, o);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.PreparedStatement#setBlob(int, java.io.InputStream, long)
   */
	@Override
  public void setBlob(int idx, InputStream is, long o) {
		try {
			this.preparedStatement.setBlob(idx, is, o);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.PreparedStatement#setBoolean(int, boolean)
   */
	@Override
  public void setBoolean(int idx, boolean o) {
		try {
			this.preparedStatement.setBoolean(idx, o);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.PreparedStatement#setByte(int, byte)
   */
	@Override
  public void setByte(int idx, byte o) {
		try {
			this.preparedStatement.setByte(idx, o);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.PreparedStatement#setBytes(int, byte[])
   */
	@Override
  public void setBytes(int idx, byte[] o) {
		try {
			this.preparedStatement.setBytes(idx, o);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.PreparedStatement#setCharacterStream(int, java.io.Reader)
   */
	@Override
  public void setCharacterStream(int idx, Reader o) {
		try {
			this.preparedStatement.setCharacterStream(idx, o);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.PreparedStatement#setCharacterStream(int, java.io.Reader, long)
   */
	@Override
  public void setCharacterStream(int idx, Reader r, long o) {
		try {
			this.preparedStatement.setCharacterStream(idx, r, o);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.PreparedStatement#setCharacterStream(int, java.io.Reader, int)
   */
	@Override
  public void setCharacterStream(int idx, Reader r, int o) {
		try {
			this.preparedStatement.setCharacterStream(idx, r, o);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.PreparedStatement#setClob(int, java.sql.Clob)
   */
	@Override
  public void setClob(int idx, Clob o) {
		try {
			this.preparedStatement.setClob(idx, o);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.PreparedStatement#setClob(int, java.io.Reader)
   */
	@Override
  public void setClob(int idx, Reader o) {
		try {
			this.preparedStatement.setClob(idx, o);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.PreparedStatement#setClob(int, java.io.Reader, long)
   */
	@Override
  public void setClob(int idx, Reader r, long o) {
		try {
			this.preparedStatement.setClob(idx, r, o);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.PreparedStatement#setCursorName(java.lang.String)
   */
	@Override
  public void setCursorName(String o) {
		try {
			this.preparedStatement.setCursorName(o);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.PreparedStatement#setDate(int, java.sql.Date)
   */
	@Override
  public void setDate(int idx, Date o) {
		try {
			this.preparedStatement.setDate(idx, o);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.PreparedStatement#setDate(int, java.sql.Date, java.util.Calendar)
   */
	@Override
  public void setDate(int idx, Date d, Calendar o) {
		try {
			this.preparedStatement.setDate(idx, d, o);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.PreparedStatement#setDouble(int, double)
   */
	@Override
  public void setDouble(int idx, double o) {
		try {
			this.preparedStatement.setDouble(idx, o);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.PreparedStatement#setEscapeProcessing(boolean)
   */
	@Override
  public void setEscapeProcessing(boolean o) {
		try {
			this.preparedStatement.setEscapeProcessing(o);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.PreparedStatement#setFetchDirection(int)
   */
	@Override
  public void setFetchDirection(int o) {
		try {
			this.preparedStatement.setFetchDirection(o);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.PreparedStatement#setFetchSize(int)
   */
	@Override
  public void setFetchSize(int o) {
		try {
			this.preparedStatement.setFetchSize(o);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.PreparedStatement#setFloat(int, float)
   */
	@Override
  public void setFloat(int idx, float o) {
		try {
			this.preparedStatement.setFloat(idx, o);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.PreparedStatement#setInt(int, int)
   */
	@Override
  public void setInt(int idx, int o) {
		try {
			this.preparedStatement.setInt(idx, o);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.PreparedStatement#setLong(int, long)
   */
	@Override
  public void setLong(int idx, long o) {
		try {
			this.preparedStatement.setLong(idx, o);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.PreparedStatement#setMaxFieldSize(int)
   */
	@Override
  public void setMaxFieldSize(int o) {
		try {
			this.preparedStatement.setMaxFieldSize(o);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.PreparedStatement#setMaxRows(int)
   */
	@Override
  public void setMaxRows(int o) {
		try {
			this.preparedStatement.setMaxRows(o);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.PreparedStatement#setNCharacterStream(int, java.io.Reader)
   */
	@Override
  public void setNCharacterStream(int idx, Reader o) {
		try {
			this.preparedStatement.setNCharacterStream(idx, o);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.PreparedStatement#setNCharacterStream(int, java.io.Reader, long)
   */
	@Override
  public void setNCharacterStream(int idx, Reader r, long o) {
		try {
			this.preparedStatement.setNCharacterStream(idx, r, o);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.PreparedStatement#setNClob(int, java.io.Reader)
   */
	@Override
  public void setNClob(int idx, Reader o) {
		try {
			this.preparedStatement.setNClob(idx, o);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.PreparedStatement#setNClob(int, java.sql.NClob)
   */
	@Override
  public void setNClob(int idx, NClob o) {
		try {
			this.preparedStatement.setNClob(idx, o);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.PreparedStatement#setNClob(int, java.io.Reader, long)
   */
	@Override
  public void setNClob(int idx, Reader r, long o) {
		try {
			this.preparedStatement.setNClob(idx, r, o);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.PreparedStatement#setNString(int, java.lang.String)
   */
	@Override
  public void setNString(int idx, String o) {
		try {
			this.preparedStatement.setNString(idx, o);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.PreparedStatement#setNull(int, int)
   */
	@Override
  public void setNull(int idx, int o) {
		try {
			this.preparedStatement.setNull(idx, o);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.PreparedStatement#setNull(int, int, java.lang.String)
   */
	@Override
  public void setNull(int idx, int i, String o) {
		try {
			this.preparedStatement.setNull(idx, i, o);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.PreparedStatement#setObject(int, java.lang.Object)
   */
	@Override
  public void setObject(int idx, Object o) {
		try {
			this.preparedStatement.setObject(idx, o);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.PreparedStatement#setObject(int, java.lang.Object, int)
   */
	@Override
  public void setObject(int idx, Object ob, int o) {
		try {
			this.preparedStatement.setObject(idx, ob, o);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.PreparedStatement#setObject(int, java.lang.Object, int, int)
   */
	@Override
  public void setObject(int idx, Object ob, int i, int o) {
		try {
			this.preparedStatement.setObject(idx, ob, i, o);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.PreparedStatement#setPoolable(boolean)
   */
	@Override
  public void setPoolable(boolean o) {
		try {
			this.preparedStatement.setPoolable(o);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.PreparedStatement#setQueryTimeout(int)
   */
	@Override
  public void setQueryTimeout(int o) {
		try {
			this.preparedStatement.setQueryTimeout(o);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.PreparedStatement#setRef(int, java.sql.Ref)
   */
	@Override
  public void setRef(int idx, Ref o) {
		try {
			this.preparedStatement.setRef(idx, o);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.PreparedStatement#setRowId(int, java.sql.RowId)
   */
	@Override
  public void setRowId(int idx, RowId o) {
		try {
			this.preparedStatement.setRowId(idx, o);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.PreparedStatement#setShort(int, short)
   */
	@Override
  public void setShort(int idx, short o) {
		try {
			this.preparedStatement.setShort(idx, o);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.PreparedStatement#setSQLXML(int, java.sql.SQLXML)
   */
	@Override
  public void setSQLXML(int idx, SQLXML o) {
		try {
			this.preparedStatement.setSQLXML(idx, o);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.PreparedStatement#setString(int, java.lang.String)
   */
	@Override
  public void setString(int idx, String o) {
		try {
			this.preparedStatement.setString(idx, o);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.PreparedStatement#setTime(int, java.sql.Time)
   */
	@Override
  public void setTime(int idx, Time o) {
		try {
			this.preparedStatement.setTime(idx, o);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.PreparedStatement#setTime(int, java.sql.Time, java.util.Calendar)
   */
	@Override
  public void setTime(int idx, Time t, Calendar o) {
		try {
			this.preparedStatement.setTime(idx, t, o);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.PreparedStatement#setTimestamp(int, java.sql.Timestamp)
   */
	@Override
  public void setTimestamp(int idx, Timestamp o) {
		try {
			this.preparedStatement.setTimestamp(idx, o);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.PreparedStatement#setTimestamp(int, java.sql.Timestamp, java.util.Calendar)
   */
	@Override
  public void setTimestamp(int idx, Timestamp ts, Calendar o) {
		try {
			this.preparedStatement.setTimestamp(idx, ts, o);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.PreparedStatement#setUnicodeStream(int, java.io.InputStream, int)
   */
	@Override
  @SuppressWarnings("deprecation")
	public void setUnicodeStream(int idx, InputStream is, int o) {
		try {
			this.preparedStatement.setUnicodeStream(idx, is, o);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.PreparedStatement#setURL(int, java.net.URL)
   */
	@Override
  public void setURL(int idx, URL o) {
		try {
			this.preparedStatement.setURL(idx, o);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

}
