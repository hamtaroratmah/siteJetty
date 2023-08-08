package be.ipl.archpae.dal.dao;

import be.ipl.archpae.bizz.dto.UserDTO;

public interface UserDAO {

	UserDTO findUserByLogin(String login);

}
