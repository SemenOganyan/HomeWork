public class Staff {
    private int id;
    private String fullName;
    private String jobTitle;
    private String email;
    private String phoneNumber;
    private int selary;
    private int age;
    public Staff (int id, String fullName, String jobTitle, String email,
     String phoneNumber, int selary, int age){
         this.id = id;
         this.fullName = fullName;
         this.jobTitle = jobTitle;
         this.email = email;
         this.phoneNumber = phoneNumber;
         this.selary = selary;
         this.age = age;
    }
    public void info(){
        System.out.println("Номер: " + id + " ФИО: " + fullName + " Должность: " + jobTitle + " Почта: "
         + email + " Номер телефона: " + phoneNumber + " Зарплата: " + selary + " Возраст: " + age);
    }
}
