package com.junu.web_community_backend.infra.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "post")

public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 255)
	private String title;

	@Column(columnDefinition = "TEXT")
	private String content;

	@Column(name = "created_at")
	private LocalDateTime createdAt; //TO DO: 자동 생성일 기록

	@Column(name = "updated_at")
	private LocalDateTime updatedAt; //TO DO: 자동 수정일 기록

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "board_id", nullable = false)
	private Board board; //소속 게시판

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = false)
	private User user; //작성자
}
