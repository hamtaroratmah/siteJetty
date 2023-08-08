package be.ipl.archpae.dal;

import be.ipl.archpae.dal.jdbc.PreparedStatement;
import be.ipl.archpae.dal.jdbc.Transaction;

public interface DALManager {

  Transaction startTransaction();

  Transaction getTransaction();

  PreparedStatement prepareStatement(String ps);

}
