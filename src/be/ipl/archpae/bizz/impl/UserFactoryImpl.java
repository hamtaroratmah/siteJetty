package be.ipl.archpae.bizz.impl;

import be.ipl.archpae.bizz.dto.UserDTO;
import be.ipl.archpae.bizz.factories.UserFactory;
import be.ipl.archpae.bizz.impl.BizUserImpl;

public class UserFactoryImpl implements UserFactory {

	@Override
	public UserDTO createUser() {
		return new BizUserImpl();
	}
	
}
