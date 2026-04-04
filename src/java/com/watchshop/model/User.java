/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.watchshop.model;

/**
 *
 * @author ngocd
 */
public class User {
    private int id;
    private String name;
    private String mail;
    private String user;
    private String pass;
    private int role;

    public User() {
    }

    public User(int id, String name, String mail, String user, String pass, int role) {
        this.id = id;
        this.name = name;
        this.mail = mail;
        this.user = user;
        this.pass = pass;
        this.role = role;
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

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name=" + name + ", mail=" + mail + ", user=" + user + ", pass=" + pass + ", role=" + role + '}';
    }
}
