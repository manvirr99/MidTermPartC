/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_versiona_extensioncode;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class TestUserProfile {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scan.nextLine();
        System.out.println("Choose your favorite genre from Comedy, Drama, Action and Mystery");
        String genre = scan.nextLine();
        UserProfile user = new UserProfile(name, genre);
        System.out.println(user.getUserID() + " was created");
    }
}
