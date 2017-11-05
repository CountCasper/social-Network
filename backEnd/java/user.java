
class user{
  private String userName;
  private String firstName;
  private String lastName;
  private Date birthday;
  private Date joinDate;
  private Pasword uPassword;
  //TODO:Make a date class / find out about in built ones.
  private EmailAdress email;

  public user(String userName, EmailAdress email,String firstName, String lastName, Date birthday, Password uPassword){
    this.userName = userName;
    this.firstName = firstName;
    this.lastName = lastName;
    this.birthday = birthday;
    this.uPassword = uPassword;

  }
}
