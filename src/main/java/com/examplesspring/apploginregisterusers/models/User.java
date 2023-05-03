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
	
}
