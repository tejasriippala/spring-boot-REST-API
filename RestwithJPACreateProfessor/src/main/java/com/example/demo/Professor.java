package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Professor {
@Id	
private int ID;
private String Name;
private int Age;
public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public int getAge() {
	return Age;
}
public void setAge(int age) {
	Age = age;
}
@Override
public String toString() {
	return "Professor [ID=" + ID + ", Name=" + Name + ", Age=" + Age + "]";
}

}

