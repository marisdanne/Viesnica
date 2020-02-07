/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author user
 */
public class Admin extends User {
    private String role;

    public Admin(int id, String name, String surname, String password) {
        super(id, name, surname, password);
    }

    public Admin(String role, int id, String name, String surname, String password) {
        super(id, name, surname, password);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Admin{" + super.toString() + ", role=" + role + '}';
    }
}
