import Loginv.LoginV;
import pakzin.user.data.DeveloperDetails;
import pakzin.user.data.task


import javax.swing.*;
import java.util.Scanner;

public class ST10231545Task2 {

 public static Scanner sn = new Scanner(System.in);
 public static login login = new Login();
public static Task task =  new Task();
public static final string errorMessage = "Username or password incorrect,please try again";
public static final string signupErrorMessage = "Password captured successfully "

public static void main(String[] args) {
     programLoop();
}

public static boolean tryToLogin(){
boolean tryToLogin = true;
boolean loginStatus = false;

while(tryToLogin){

if (!loginStatus){
    String username = getInput("Enter your username:\n");
     String password = getInput("Enter your password:\n");
     String message = login.returnLoginStatus(Username, Password);
     if (!message.equals(errorMessage)){
         loginStatus = true;
        System.out.printIn("welcome to EasyKanban");

public static void addTask(){
     int numberOfTasks = Integer.parseInt(getInput("Enter the number of tasks:"));
  
    int i = 0;
    while(i < numberOfTasks){
    String taskName = getinput("Enter the task name");
    String taskDescription = getinput("Enter the task description");
    String FirstName = getinput("Enter first name");
    String LastName = getinput("Enter last name");
    DeveloperDetails developerDetails = new DeveloperDetails(FirstName,LastName);
    int duration = Integer.parseInt(getInput("Enter the duration of the task:"));
    String response = task.createTask(taskName,i,taskDescription,developerDetails,duration,"To Do");
    if (response.equals("The task is successfully captured")){
       System.out.printIn(response);
      
       Jframe frame = new Jframe();
       String taskId = task.createTaskID(taskName, i++, FirstName);
       JOptionPane.showMessageDualog(frame, task.printTaskDetails(taskId));
} else {
        System.out.printIn(response)
       }
    }
{
    System.out.printIn("Total duration: " + task.returnTotalHours() + "Hrs");
    }
public static void showReport(){
    System.out.printIn("Coming soon");
}

public static void tryToSignup(){
    boolean tryToSignup = true;
    while(tryToSignup){
    String username = getInput("Enter username: ");
    String password = getInput("Enter password: ");
    String FirstName = getInput("Enter first name: ");
    String FirstName = getInput("Enter last name: ");
    String message = login.registerUser(Username,Password,FirstName,LastName);
    if (meesage.equals(signupErrorMessage))
       trySignup = false;
    System.out.printIn(message);
}

public static void programLoop(){
  boolean loop = true;
  while(loop){
      try {
           int selected = integer.parseInt(getInput("1.Login \n2.Signup \n3.exit"));
           switch (selected) {
                case 1:
                      loop = tryToLogin();
                      break;

                case 2:
                      tryToSignup();
                      break;
                case 3:
                      loop = false:
                      break;
                default:
                    System.out.print("Input should be between 1 - 3");
      }
}
      catch(NumberFormatExeption c) {
           System.out.printIn("Please input only numbers");
           }
     }
}
  public static String getInput(String input){
           System.out.printIn(input);
           return String.valueOf(sn.nextLine());
  }




}
