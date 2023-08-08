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
import java.util.Map;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class ResultSetImpl implements ResultSet {

	private final java.sql.ResultSet rs;

	public ResultSetImpl(java.sql.ResultSet rs) {
		this.rs = rs;
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#close()
   */
	@Override
	public void close() {
		try {
			rs.close();
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#isClosed()
   */
	@Override
  public boolean isClosed() {
		try {
			return rs.isClosed();
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#next()
   */
	@Override
  public boolean next() {
		try {
			return rs.next();
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getArray(java.lang.String)
   */
	@Override
  public Array getArray(String col) {
		try {
			return rs.getArray(col);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getArray(int)
   */
	@Override
  public Array getArray(int idx) {
		try {
			return rs.getArray(idx);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getAsciiStream(int)
   */
	@Override
  public InputStream getAsciiStream(int idx) {
		try {
			return rs.getAsciiStream(idx);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getAsciiStream(java.lang.String)
   */
	@Override
  public InputStream getAsciiStream(String col) {
		try {
			return rs.getAsciiStream(col);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getBigDecimal(java.lang.String)
   */
	@Override
  public BigDecimal getBigDecimal(String col) {
		try {
			return rs.getBigDecimal(col);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getBigDecimal(int)
   */
	@Override
  public BigDecimal getBigDecimal(int idx) {
		try {
			return rs.getBigDecimal(idx);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getBigDecimal(int, int)
   */
	@Override
  @SuppressWarnings("deprecation")
	public BigDecimal getBigDecimal(int idx, int b) {
		try {
			return rs.getBigDecimal( idx,  b) ;
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getBigDecimal(java.lang.String, int)
   */
	@Override
  @SuppressWarnings("deprecation")
	public BigDecimal getBigDecimal(String col, int b) {
		try {
			return rs.getBigDecimal( col,  b);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getBinaryStream(int)
   */
	@Override
  public InputStream getBinaryStream(int idx) {
		try {
			return rs.getBinaryStream(idx);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getBinaryStream(java.lang.String)
   */
	@Override
  public InputStream getBinaryStream(String col) {
		try {
			return rs.getBinaryStream( col);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getBlob(int)
   */
	@Override
  public Blob getBlob(int idx) {
		try {
			return rs.getBlob(idx);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getBlob(java.lang.String)
   */
	@Override
  public Blob getBlob(String col) {
		try {
			return rs.getBlob(col);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getBoolean(java.lang.String)
   */
	@Override
  public boolean getBoolean(String col) {
		try {
			return rs.getBoolean(col);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getBoolean(int)
   */
	@Override
  public boolean getBoolean(int idx) {
		try {
			return rs.getBoolean(idx);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getByte(java.lang.String)
   */
	@Override
  public byte getByte(String col) {
		try {
			return rs.getByte(col);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getByte(int)
   */
	@Override
  public byte getByte(int idx) {
		try {
			return rs.getByte(idx);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getBytes(java.lang.String)
   */
	@Override
  public byte[] getBytes(String col) {
		try {
			return rs.getBytes(col);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getBytes(int)
   */
	@Override
  public byte[] getBytes(int idx) {
		try {
			return rs.getBytes(idx);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getCharacterStream(java.lang.String)
   */
	@Override
  public Reader getCharacterStream(String col) {
		try {
			return rs.getCharacterStream(col);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getCharacterStream(int)
   */
	@Override
  public Reader getCharacterStream(int idx) {
		try {
			return rs.getCharacterStream(idx);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getClob(java.lang.String)
   */
	@Override
  public Clob getClob(String col) {
		try {
			return rs.getClob(col);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getClob(int)
   */
	@Override
  public Clob getClob(int idx) {
		try {
			return rs.getClob(idx);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getConcurrency()
   */
	@Override
  public int getConcurrency() {
		try {
			return rs.getConcurrency();
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getCursorName()
   */
	@Override
  public String getCursorName() {
		try {
			return rs.getCursorName();
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getDate(int)
   */
	@Override
  public Date getDate(int idx) {
		try {
			return rs.getDate(idx);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getDate(java.lang.String)
   */
	@Override
  public Date getDate(String col) {
		try {
			return rs.getDate(col);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getDate(int, java.util.Calendar)
   */
	@Override
  public Date getDate(int idx, Calendar c) {
		try {
			return rs.getDate( idx,  c);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getDate(java.lang.String, java.util.Calendar)
   */
	@Override
  public Date getDate(String col, Calendar c) {
		try {
			return rs.getDate( col,  c);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getDouble(java.lang.String)
   */
	@Override
  public double getDouble(String col) {
		try {
			return rs.getDouble(col);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getDouble(int)
   */
	@Override
  public double getDouble(int idx) {
		try {
			return rs.getDouble(idx);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getFetchDirection()
   */
	@Override
  public int getFetchDirection() {
		try {
			return rs.getFetchDirection();
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getFetchSize()
   */
	@Override
  public int getFetchSize() {
		try {
			return rs.getFetchSize();
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getFloat(java.lang.String)
   */
	@Override
  public float getFloat(String col) {
		try {
			return rs.getFloat(col);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getFloat(int)
   */
	@Override
  public float getFloat(int idx) {
		try {
			return rs.getFloat(idx);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getHoldability()
   */
	@Override
  public int getHoldability() {
		try {
			return rs.getHoldability();
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getInt(java.lang.String)
   */
	@Override
  public int getInt(String col) {
		try {
			return rs.getInt(col);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getInt(int)
   */
	@Override
  public int getInt(int idx) {
		try {
			return rs.getInt(idx);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getLong(int)
   */
	@Override
  public long getLong(int idx) {
		try {
			return rs.getLong(idx);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getLong(java.lang.String)
   */
	@Override
  public long getLong(String col) {
		try {
			return rs.getLong(col);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getMetaData()
   */
	@Override
  public ResultSetMetaData getMetaData() {
		try {
			return rs.getMetaData();
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getNCharacterStream(int)
   */
	@Override
  public Reader getNCharacterStream(int idx) {
		try {
			return rs.getNCharacterStream(idx);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getNCharacterStream(java.lang.String)
   */
	@Override
  public Reader getNCharacterStream(String col) {
		try {
			return rs.getNCharacterStream(col);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getNClob(java.lang.String)
   */
	@Override
  public NClob getNClob(String col) {
		try {
			return rs.getNClob(col);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getNClob(int)
   */
	@Override
  public NClob getNClob(int idx) {
		try {
			return rs.getNClob(idx);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getNString(java.lang.String)
   */
	@Override
  public String getNString(String col) {
		try {
			return rs.getNString(col);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getNString(int)
   */
	@Override
  public String getNString(int idx) {
		try {
			return rs.getNString(idx);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getObject(java.lang.String)
   */
	@Override
  public Object getObject(String col) {
		try {
			return rs.getObject(col);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getObject(int)
   */
	@Override
  public Object getObject(int idx) {
		try {
			return rs.getObject(idx);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getObject(java.lang.String, java.lang.Class)
   */
	@Override
  public Object getObject(String col, Class c) {
		try {
			return rs.getObject( col,  c);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getObject(java.lang.String, java.util.Map)
   */
	@Override
  public Object getObject(String col, Map m) {
		try {
			return rs.getObject( col,  m);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getObject(int, java.lang.Class)
   */
	@Override
  public Object getObject(int idx, Class c) {
		try {
			return rs.getObject( idx,  c);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getObject(int, java.util.Map)
   */
	@Override
  public Object getObject(int idx, Map m) {
		try {
			return rs.getObject( idx,  m);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getRef(int)
   */
	@Override
  public Ref getRef(int idx) {
		try {
			return rs.getRef(idx);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getRef(java.lang.String)
   */
	@Override
  public Ref getRef(String col) {
		try {
			return rs.getRef(col);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getRow()
   */
	@Override
  public int getRow() {
		try {
			return rs.getRow();
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getRowId(int)
   */
	@Override
  public RowId getRowId(int idx) {
		try {
			return rs.getRowId(idx);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getRowId(java.lang.String)
   */
	@Override
  public RowId getRowId(String col) {
		try {
			return rs.getRowId(col);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getShort(int)
   */
	@Override
  public short getShort(int idx) {
		try {
			return rs.getShort(idx);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getShort(java.lang.String)
   */
	@Override
  public short getShort(String col) {
		try {
			return rs.getShort(col);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getSQLXML(java.lang.String)
   */
	@Override
  public SQLXML getSQLXML(String col) {
		try {
			return rs.getSQLXML(col);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getSQLXML(int)
   */
	@Override
  public SQLXML getSQLXML(int idx) {
		try {
			return rs.getSQLXML(idx);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getString(java.lang.String)
   */
	@Override
  public String getString(String col) {
		try {
			return rs.getString(col);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getString(int)
   */
	@Override
  public String getString(int idx) {
		try {
			return rs.getString(idx);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getTime(java.lang.String)
   */
	@Override
  public Time getTime(String col) {
		try {
			return rs.getTime(col);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getTime(int)
   */
	@Override
  public Time getTime(int idx) {
		try {
			return rs.getTime(idx);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getTime(int, java.util.Calendar)
   */
	@Override
  public Time getTime(int idx, Calendar c) {
		try {
			return rs.getTime( idx,  c);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getTime(java.lang.String, java.util.Calendar)
   */
	@Override
  public Time getTime(String col, Calendar c) {
		try {
			return rs.getTime( col,  c);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getTimestamp(int)
   */
	@Override
  public Timestamp getTimestamp(int idx) {
		try {
			return rs.getTimestamp(idx);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getTimestamp(java.lang.String)
   */
	@Override
  public Timestamp getTimestamp(String col) {
		try {
			return rs.getTimestamp(col);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getTimestamp(java.lang.String, java.util.Calendar)
   */
	@Override
  public Timestamp getTimestamp(String col, Calendar c) {
		try {
			return rs.getTimestamp( col,  c);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getTimestamp(int, java.util.Calendar)
   */
	@Override
  public Timestamp getTimestamp(int idx, Calendar c) {
		try {
			return rs.getTimestamp( idx,  c);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getType()
   */
	@Override
  public int getType() {
		try {
			return rs.getType() ;
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getUnicodeStream(int)
   */
	@Override
  @SuppressWarnings("deprecation")
	public InputStream getUnicodeStream(int idx) {
		try {
			return rs.getUnicodeStream(idx);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getUnicodeStream(java.lang.String)
   */
	@Override
  @SuppressWarnings("deprecation")
	public InputStream getUnicodeStream(String col) {
		try {
			return rs.getUnicodeStream(col);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getURL(java.lang.String)
   */
	@Override
  public URL getURL(String col) {
		try {
			return rs.getURL(col);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.dal.jdbc.ResultSet#getURL(int)
   */
	@Override
  public URL getURL(int idx) {
		try {
			return rs.getURL(idx);
		} catch (SQLException e) {
			throw new SqlRuntimeException(e);
		}
	}
}
