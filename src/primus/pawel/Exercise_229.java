package primus.pawel;
// FIXME: Get Full Name
// 7kyu
// https://www.codewars.com/kata/597c684822bc9388f600010f/train/java
// 2021-09-20 T:22:20:46
class Exercise_229 {

    public class Dinglemouse {

        private String firstName;
        private String lastName;

        public Dinglemouse(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFullName() {
            return (firstName + " " + lastName).trim();
        }

    }
}
