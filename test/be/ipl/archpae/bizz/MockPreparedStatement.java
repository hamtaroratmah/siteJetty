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

import be.ipl.archpae.dal.jdbc.PreparedStatement;
import be.ipl.archpae.dal.jdbc.ResultSet;

public class MockPreparedStatement implements PreparedStatement {

  private Object[][] responses=null;
  
  public MockPreparedStatement(Object[][] responses) {
    this.responses=responses;
  }
  
  @Override
  public ResultSet executeQuery() {
    return new MockResultSet(responses);
  }

  @Override
  public ResultSetMetaData getMetaData() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public int executeUpdate() {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public void clearParameters() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public boolean isClosed() {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public void close() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void setArray(int idx, Array o) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void setAsciiStream(int idx, InputStream o) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void setAsciiStream(int idx, InputStream i, long o) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void setAsciiStream(int idx, InputStream is, int o) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void setBigDecimal(int idx, BigDecimal o) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void setBinaryStream(int idx, InputStream o) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void setBinaryStream(int idx, InputStream is, long o) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void setBinaryStream(int idx, InputStream is, int o) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void setBlob(int idx, InputStream o) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void setBlob(int idx, Blob o) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void setBlob(int idx, InputStream is, long o) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void setBoolean(int idx, boolean o) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void setByte(int idx, byte o) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void setBytes(int idx, byte[] o) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void setCharacterStream(int idx, Reader o) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void setCharacterStream(int idx, Reader r, long o) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void setCharacterStream(int idx, Reader r, int o) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void setClob(int idx, Clob o) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void setClob(int idx, Reader o) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void setClob(int idx, Reader r, long o) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void setCursorName(String o) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void setDate(int idx, Date o) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void setDate(int idx, Date d, Calendar o) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void setDouble(int idx, double o) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void setEscapeProcessing(boolean o) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void setFetchDirection(int o) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void setFetchSize(int o) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void setFloat(int idx, float o) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void setInt(int idx, int o) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void setLong(int idx, long o) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void setMaxFieldSize(int o) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void setMaxRows(int o) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void setNCharacterStream(int idx, Reader o) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void setNCharacterStream(int idx, Reader r, long o) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void setNClob(int idx, Reader o) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void setNClob(int idx, NClob o) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void setNClob(int idx, Reader r, long o) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void setNString(int idx, String o) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void setNull(int idx, int o) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void setNull(int idx, int i, String o) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void setObject(int idx, Object o) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void setObject(int idx, Object ob, int o) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void setObject(int idx, Object ob, int i, int o) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void setPoolable(boolean o) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void setQueryTimeout(int o) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void setRef(int idx, Ref o) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void setRowId(int idx, RowId o) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void setShort(int idx, short o) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void setSQLXML(int idx, SQLXML o) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void setString(int idx, String o) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void setTime(int idx, Time o) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void setTime(int idx, Time t, Calendar o) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void setTimestamp(int idx, Timestamp o) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void setTimestamp(int idx, Timestamp ts, Calendar o) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void setUnicodeStream(int idx, InputStream is, int o) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void setURL(int idx, URL o) {
    // TODO Auto-generated method stub
    
  }

}
