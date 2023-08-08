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
import java.sql.SQLXML;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;


public interface PreparedStatement extends AutoCloseable {

  ResultSet executeQuery();

  ResultSetMetaData getMetaData();

  int executeUpdate();

  void clearParameters();

  boolean isClosed();

  @Override
  void close();

  void setArray(int idx, Array o);

  void setAsciiStream(int idx, InputStream o);

  void setAsciiStream(int idx, InputStream i, long o);

  void setAsciiStream(int idx, InputStream is, int o);

  void setBigDecimal(int idx, BigDecimal o);

  void setBinaryStream(int idx, InputStream o);

  void setBinaryStream(int idx, InputStream is, long o);

  void setBinaryStream(int idx, InputStream is, int o);

  void setBlob(int idx, InputStream o);

  void setBlob(int idx, Blob o);

  void setBlob(int idx, InputStream is, long o);

  void setBoolean(int idx, boolean o);

  void setByte(int idx, byte o);

  void setBytes(int idx, byte[] o);

  void setCharacterStream(int idx, Reader o);

  void setCharacterStream(int idx, Reader r, long o);

  void setCharacterStream(int idx, Reader r, int o);

  void setClob(int idx, Clob o);

  void setClob(int idx, Reader o);

  void setClob(int idx, Reader r, long o);

  void setCursorName(String o);

  void setDate(int idx, Date o);

  void setDate(int idx, Date d, Calendar o);

  void setDouble(int idx, double o);

  void setEscapeProcessing(boolean o);

  void setFetchDirection(int o);

  void setFetchSize(int o);

  void setFloat(int idx, float o);

  void setInt(int idx, int o);

  void setLong(int idx, long o);

  void setMaxFieldSize(int o);

  void setMaxRows(int o);

  void setNCharacterStream(int idx, Reader o);

  void setNCharacterStream(int idx, Reader r, long o);

  void setNClob(int idx, Reader o);

  void setNClob(int idx, NClob o);

  void setNClob(int idx, Reader r, long o);

  void setNString(int idx, String o);

  void setNull(int idx, int o);

  void setNull(int idx, int i, String o);

  void setObject(int idx, Object o);

  void setObject(int idx, Object ob, int o);

  void setObject(int idx, Object ob, int i, int o);

  void setPoolable(boolean o);

  void setQueryTimeout(int o);

  void setRef(int idx, Ref o);

  void setRowId(int idx, RowId o);

  void setShort(int idx, short o);

  void setSQLXML(int idx, SQLXML o);

  void setString(int idx, String o);

  void setTime(int idx, Time o);

  void setTime(int idx, Time t, Calendar o);

  void setTimestamp(int idx, Timestamp o);

  void setTimestamp(int idx, Timestamp ts, Calendar o);

  void setUnicodeStream(int idx, InputStream is, int o);

  void setURL(int idx, URL o);

}
