public class Staff {
    private String fullName;
    private String jobTitle;
    private String email;
    private String phoneNumber;
    private int selary;
    private int age;
    public Staff (String fullName, String jobTitle, String email,
     String phoneNumber, int selary, int age){
         this.fullName = fullName;
         this.jobTitle = jobTitle;
         this.email = email;
         this.phoneNumber = phoneNumber;
         this.selary = selary;
         this.age = age;
    }
    public void info(){
        System.out.println("ФИО: " + fullName + " Должность: " + jobTitle + " Почта: " + email
         + " Номер телефона: " + phoneNumber + " Зарплата: " + selary + " Возраст: " + age);
    }
}
