package be.ipl.archpae.bizz.ucc;

import be.ipl.archpae.bizz.dto.BizUser;
import be.ipl.archpae.bizz.dto.UserDTO;
import be.ipl.archpae.dal.DALManager;
import be.ipl.archpae.dal.dao.UserDAO;
import be.ipl.archpae.dal.jdbc.Transaction;

public class UserUCC {
	
	private final UserDAO userDAO;
	private final DALManager dal;

	public UserUCC(DALManager dal,UserDAO userDAO) {
		this.dal=dal;
		this.userDAO=userDAO;
	}

	public UserDTO login(String login, String password) {
		try (Transaction transaction=dal.startTransaction()) {
			UserDTO user=userDAO.findUserByLogin(login);
			if (user==null) return null;
			if (!((BizUser)user).checkPassword(password)) {
				return null;
			}
			
			return user;			
		}
	}

	public UserDTO getUser(String login) {
		return userDAO.findUserByLogin(login);
	}

}
