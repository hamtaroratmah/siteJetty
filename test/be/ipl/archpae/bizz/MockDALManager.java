package be.ipl.archpae.bizz;

import java.util.HashMap;
import java.util.Map;

import be.ipl.archpae.dal.DALManager;
import be.ipl.archpae.dal.jdbc.PreparedStatement;
import be.ipl.archpae.dal.jdbc.Transaction;

public class MockDALManager implements DALManager {

  private MockTransaction trans;
  private final Map<String,Object[][]> responses=new HashMap<>();
  
  @Override
  public Transaction startTransaction() {
    trans=new MockTransaction();
    return trans;
  }

  @Override
  public Transaction getTransaction() {
    return trans;
  }
  
  public void prepResponse(String ps, Object[][] response) {
    responses.put(ps, response);
  }

  @Override
  public PreparedStatement prepareStatement(String ps) {
    return new MockPreparedStatement(responses.get(ps));
  }

}
