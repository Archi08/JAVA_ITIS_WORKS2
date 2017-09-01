package DAO;


public class UserService {
    private UserDao  userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

   
    public boolean isRegistredPerson(String name){
       ArrayList<User> users=  this.userDao.findAll();
       for(int i =0;i<users.getCount();i++){
           if(users.getElementById(i).getName().equals(name)){
               return true;
           }
       }
       return false;
    }
}
