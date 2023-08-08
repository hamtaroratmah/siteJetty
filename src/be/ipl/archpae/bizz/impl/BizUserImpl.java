package be.ipl.archpae.bizz.impl;

import be.ipl.archpae.bizz.dto.BizUser;
import be.ipl.archpae.bizz.dto.UserDTO;
import be.ipl.archpae.utils.BCrypt;

public class BizUserImpl implements UserDTO, BizUser {
	private int id;
	private String login;
	private String bcrypt;
	/* (non-Javadoc)
   * @see be.ipl.archpae.bizz.dto.IBizUser#getLogin()
   */
	@Override
	public String getLogin() {
		return login;
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.bizz.dto.IBizUser#getID()
   */
	@Override
  public int getID() {
		return id;
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.bizz.dto.IBizUser#setID(int)
   */
	@Override
  public void setID(int id) {
		this.id=id;
	}

	/* (non-Javadoc)
   * @see be.ipl.archpae.bizz.dto.IBizUser#setLogin(java.lang.String)
   */
	@Override
  public void setLogin(String login) {
		this.login=login;
	}
	
	/* (non-Javadoc)
   * @see be.ipl.archpae.bizz.dto.IBizUser#setBCrypt(java.lang.String)
   */
	@Override
  public void setBCrypt(String bcrypt) {
		this.bcrypt=bcrypt;
	}
	
	/* (non-Javadoc)
   * @see be.ipl.archpae.bizz.dto.IBizUser#checkPassword(java.lang.String)
   */
	@Override
  public boolean checkPassword(String password) {
		return BCrypt.checkpw(password, this.bcrypt);
	}


}
