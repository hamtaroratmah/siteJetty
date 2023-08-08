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
import java.util.Map;

@SuppressWarnings("rawtypes")
public interface ResultSet extends AutoCloseable {

  @Override
  void close();

  boolean isClosed();

  boolean next();

  Array getArray(String col);

  Array getArray(int idx);

  InputStream getAsciiStream(int idx);

  InputStream getAsciiStream(String col);

  BigDecimal getBigDecimal(String col);

  BigDecimal getBigDecimal(int idx);

  BigDecimal getBigDecimal(int idx, int b);

  BigDecimal getBigDecimal(String col, int b);

  InputStream getBinaryStream(int idx);

  InputStream getBinaryStream(String col);

  Blob getBlob(int idx);

  Blob getBlob(String col);

  boolean getBoolean(String col);

  boolean getBoolean(int idx);

  byte getByte(String col);

  byte getByte(int idx);

  byte[] getBytes(String col);

  byte[] getBytes(int idx);

  Reader getCharacterStream(String col);

  Reader getCharacterStream(int idx);

  Clob getClob(String col);

  Clob getClob(int idx);

  int getConcurrency();

  String getCursorName();

  Date getDate(int idx);

  Date getDate(String col);

  Date getDate(int idx, Calendar c);

  Date getDate(String col, Calendar c);

  double getDouble(String col);

  double getDouble(int idx);

  int getFetchDirection();

  int getFetchSize();

  float getFloat(String col);

  float getFloat(int idx);

  int getHoldability();

  int getInt(String col);

  int getInt(int idx);

  long getLong(int idx);

  long getLong(String col);

  ResultSetMetaData getMetaData();

  Reader getNCharacterStream(int idx);

  Reader getNCharacterStream(String col);

  NClob getNClob(String col);

  NClob getNClob(int idx);

  String getNString(String col);

  String getNString(int idx);

  Object getObject(String col);

  Object getObject(int idx);

  Object getObject(String col, Class c);

  Object getObject(String col, Map m);

  Object getObject(int idx, Class c);

  Object getObject(int idx, Map m);

  Ref getRef(int idx);

  Ref getRef(String col);

  int getRow();

  RowId getRowId(int idx);

  RowId getRowId(String col);

  short getShort(int idx);

  short getShort(String col);

  SQLXML getSQLXML(String col);

  SQLXML getSQLXML(int idx);

  String getString(String col);

  String getString(int idx);

  Time getTime(String col);

  Time getTime(int idx);

  Time getTime(int idx, Calendar c);

  Time getTime(String col, Calendar c);

  Timestamp getTimestamp(int idx);

  Timestamp getTimestamp(String col);

  Timestamp getTimestamp(String col, Calendar c);

  Timestamp getTimestamp(int idx, Calendar c);

  int getType();

  InputStream getUnicodeStream(int idx);

  InputStream getUnicodeStream(String col);

  URL getURL(String col);

  URL getURL(int idx);

}
