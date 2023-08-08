package be.ipl.archpae.dal.impl;

import be.ipl.archpae.bizz.dto.UserDTO;
import be.ipl.archpae.bizz.factories.UserFactory;
import be.ipl.archpae.bizz.impl.BizUserImpl;
import be.ipl.archpae.dal.DALManager;
import be.ipl.archpae.dal.dao.UserDAO;
import be.ipl.archpae.dal.jdbc.PreparedStatement;
import be.ipl.archpae.dal.jdbc.ResultSet;

public class UserDAOImpl implements UserDAO {

	private final DALManager manager;
	private final UserFactory userFactory;

	public UserDAOImpl(DALManager manager, UserFactory userFactory) {
		this.manager=manager;
		this.userFactory=userFactory;
	}

	@Override
	public UserDTO findUserByLogin(String login) {
		PreparedStatement ps=manager.prepareStatement("SELECT id, login, password FROM pae.users WHERE login=?");
		ps.setString(1, login);
		try (ResultSet rs=ps.executeQuery()) {
			if (rs.next()) {
				BizUserImpl user=(BizUserImpl)userFactory.createUser();
				user.setID(rs.getInt(1));
				user.setLogin(rs.getString(2));
				user.setBCrypt(rs.getString(3));
				return user;
			}
		}
		return null;
	}

}
