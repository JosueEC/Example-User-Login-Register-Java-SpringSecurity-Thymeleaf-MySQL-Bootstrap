package com.examplesspring.apploginregisterusers.models;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
@Table (name = "user", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class User {
	@Id
	@SequenceGenerator(
			name = "user_sequence",
			sequenceName = "user_sequence",
			allocationSize = 1,
			initialValue = 1
	)
	@GeneratedValue (
			strategy = GenerationType.SEQUENCE,
			generator = "user_sequence"
	)
	private Long id;
	@Column (name = "name")
	private String name;
	@Column (name = "last_name")
	private String last_name;
	@Column (name = "email")
	private String email;
	@Column (name = "password")
	private String password;
	
	@ManyToMany (
			fetch = FetchType.EAGER,
			cascade = CascadeType.ALL
	)
	@JoinTable (
			name = "users_roles",
			joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(name = "rol_id", referencedColumnName = "id")
	)
	private Collection<Rol> roles;
	
	public User() {}
	
	public User(Long id, String name, String last_name, String email, String password, Collection<Rol> roles) {
		this.id = id;
		this.name = name;
		this.last_name = last_name;
		this.email = email;
		this.password = password;
		this.roles = roles;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLast_name() {
		return last_name;
	}
	
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Collection<Rol> getRoles() {
		return roles;
	}
	
	public void setRoles(Collection<Rol> roles) {
		this.roles = roles;
	}
	
	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", name='" + name + '\'' +
				", last_name='" + last_name + '\'' +
				", email='" + email + '\'' +
				", password='" + password + '\'' +
				", roles=" + roles +
				'}';
	}
}
