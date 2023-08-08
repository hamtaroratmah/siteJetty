package be.ipl.archpae.bizz;

import java.sql.Connection;

import be.ipl.archpae.dal.jdbc.Transaction;

public class MockTransaction implements Transaction {

  @Override
  public void close() {
  }

  @Override
  public void commit() {
  }

  @Override
  public void rollback() {
  }

  @Override
  public Connection getConnection() {
    return null;
  }

}
