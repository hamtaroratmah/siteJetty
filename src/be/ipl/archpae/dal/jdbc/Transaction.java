package be.ipl.archpae.dal.jdbc;

import java.sql.Connection;


public interface Transaction extends AutoCloseable {

  @Override
  void close();

  void commit();

  void rollback();

  Connection getConnection();

}
