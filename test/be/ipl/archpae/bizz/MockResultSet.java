package be.ipl.archpae.bizz;

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

import be.ipl.archpae.dal.jdbc.ResultSet;

@SuppressWarnings("rawtypes")
public class MockResultSet implements ResultSet {

  private final Object[][] responses;
  private int index=-1;
  
  public MockResultSet(Object[][] responses) {
    this.responses=responses;
  }

  @Override
  public void close() {
    // TODO Auto-generated method stub

  }

  @Override
  public boolean isClosed() {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean next() {
    index++;
    return index<responses.length;
  }

  @Override
  public Array getArray(String col) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Array getArray(int idx) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public InputStream getAsciiStream(int idx) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public InputStream getAsciiStream(String col) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public BigDecimal getBigDecimal(String col) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public BigDecimal getBigDecimal(int idx) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public BigDecimal getBigDecimal(int idx, int b) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public BigDecimal getBigDecimal(String col, int b) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public InputStream getBinaryStream(int idx) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public InputStream getBinaryStream(String col) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Blob getBlob(int idx) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Blob getBlob(String col) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public boolean getBoolean(String col) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean getBoolean(int idx) {
    return (Boolean)responses[index][idx-1];
  }

  @Override
  public byte getByte(String col) {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public byte getByte(int idx) {
    return (Byte)responses[index][idx-1];
  }

  @Override
  public byte[] getBytes(String col) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public byte[] getBytes(int idx) {
    return (byte[])responses[index][idx-1];
  }

  @Override
  public Reader getCharacterStream(String col) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Reader getCharacterStream(int idx) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Clob getClob(String col) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Clob getClob(int idx) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public int getConcurrency() {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public String getCursorName() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Date getDate(int idx) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Date getDate(String col) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Date getDate(int idx, Calendar c) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Date getDate(String col, Calendar c) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public double getDouble(String col) {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public double getDouble(int idx) {
    return (Double)responses[index][idx-1];
  }

  @Override
  public int getFetchDirection() {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public int getFetchSize() {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public float getFloat(String col) {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public float getFloat(int idx) {
    return (Float)responses[index][idx-1];
  }

  @Override
  public int getHoldability() {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public int getInt(String col) {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public int getInt(int idx) {
    return (Integer)responses[index][idx-1];
  }

  @Override
  public long getLong(int idx) {
    return (Long)responses[index][idx-1];
  }

  @Override
  public long getLong(String col) {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public ResultSetMetaData getMetaData() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Reader getNCharacterStream(int idx) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Reader getNCharacterStream(String col) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public NClob getNClob(String col) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public NClob getNClob(int idx) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getNString(String col) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getNString(int idx) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object getObject(String col) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object getObject(int idx) {
    return responses[index][idx-1];
  }

  @Override
  public Object getObject(String col, Class c) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object getObject(String col, Map m) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object getObject(int idx, Class c) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object getObject(int idx, Map m) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Ref getRef(int idx) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Ref getRef(String col) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public int getRow() {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public RowId getRowId(int idx) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public RowId getRowId(String col) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public short getShort(int idx) {
    return (Short)responses[index][idx-1];
  }

  @Override
  public short getShort(String col) {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public SQLXML getSQLXML(String col) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public SQLXML getSQLXML(int idx) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getString(String col) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getString(int idx) {
    return (String)responses[index][idx-1];
  }

  @Override
  public Time getTime(String col) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Time getTime(int idx) {
    return (Time)responses[index][idx-1];
  }

  @Override
  public Time getTime(int idx, Calendar c) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Time getTime(String col, Calendar c) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Timestamp getTimestamp(int idx) {
    return (Timestamp)responses[index][idx-1];
  }

  @Override
  public Timestamp getTimestamp(String col) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Timestamp getTimestamp(String col, Calendar c) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Timestamp getTimestamp(int idx, Calendar c) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public int getType() {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public InputStream getUnicodeStream(int idx) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public InputStream getUnicodeStream(String col) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public URL getURL(String col) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public URL getURL(int idx) {
    // TODO Auto-generated method stub
    return null;
  }

}
