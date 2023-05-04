package com.examplesspring.apploginregisterusers.models;

import jakarta.persistence.*;

@Entity
@Table (name = "rol")
public class Rol {
	@Id
	@SequenceGenerator (
			name = "rol_sequence",
			sequenceName = "rol_sequence",
			allocationSize = 1,
			initialValue = 1
	)
	@GeneratedValue (
			strategy = GenerationType.SEQUENCE,
			generator = "rol_sequence"
	)
	private Long id;
	@Column (name = "name")
	private String name;
	
	public Rol() {}
	
	public Rol(String name) {
		this.name = name;
	}
	
	public Rol(Long id, String name) {
		this.id = id;
		this.name = name;
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
	
	@Override
	public String toString() {
		return "Rol{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}
}
