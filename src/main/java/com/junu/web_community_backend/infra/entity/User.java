package com.junu.web_community_backend.infra.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")

public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 36)
	private String uuid;

	@Column(length = 50)
	private String nickname;

	@Column(name = "login_id", length = 50)
	private String loginId;

	@Column(name = "user_pw", length = 255)
	private String userPW;

	//TO DO: board 외래키

	//TO DO: post 외래키

}
