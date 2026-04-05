/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Contact {
    private int id;
    private String name;
    private String mail;
    private String msg;

    public Contact() {
    }

    public Contact(int id, String name, String mail, String msg) {
        this.id = id;
        this.name = name;
        this.mail = mail;
        this.msg = msg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Contact{" + "id=" + id + ", name=" + name + ", mail=" + mail + ", msg=" + msg + '}';
    }
    
}
