public class gpt {
        public static void main(String[] args) {
            // Creating an instance of the Person class
            Person person = new Person("John", 25);
            
            // Using the person object
            System.out.println(person.getName() + " is " + person.getAge() + " years old.");
        }
    }
    
    class Person {
        private String name;
        private int age;
        
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
        
        public String getName() {
            return name;
        }
        
        public int getAge() {
            return age;
        }
    }
    

