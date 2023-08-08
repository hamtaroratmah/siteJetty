package be.ipl.archpae.bizz.dto;



public interface BizUser extends UserDTO {

  @Override
  String getLogin();

  int getID();

  void setID(int id);

  void setLogin(String login);

  void setBCrypt(String bcrypt);

  boolean checkPassword(String password);

}
