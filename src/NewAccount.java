/* Encapsulation */
public class NewAccount {
        String name;
        String AcctNum;
        String RoutNum;
        int age;

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        public String getAcctNum() {
            return AcctNum;
        }
        public String getRoutNum() {
            return RoutNum;
        }

        public void setAge( int newAge) {
            age = newAge;
        }

        public void setName(String newName) {
            name = newName;
        }

        public void setAcctNum(String newAcctNum) {
            AcctNum = newAcctNum;
        }
        public void setRoutNum(String newRoutNum) {
            RoutNum = newRoutNum;
        }

   public static void exampleAcct(){
            NewAccount encap = new NewAccount();
            encap.setName("First Name, Last Name");
            encap.setAge(24);
            encap.setAcctNum("12345 12312 098123");
            encap.setRoutNum("00000 00000 000000");

            System.out.print("Name : " + encap.getName() + "\nAccount Number : " + encap.getAcctNum() + "\nRouting Number: " + encap.getRoutNum() + "\nAge : " + encap.getAge());
   }
}


