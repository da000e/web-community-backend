package com.junu.web_community_backend.infra.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@EnableJpaAuditing
@EntityListeners(AuditingEntityListener.class)
@Entity
@Table(name = "post")

public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 255, nullable = false)
	private String title;

	@Column(columnDefinition = "TEXT", nullable = false)
	private String content;

	@CreatedDate
	@Column(name = "created_at", updatable = false, nullable = false, columnDefinition = "TIMESTAMP")
	private LocalDateTime createdAt; //TO DO: 자동 생성일 기록

	@LastModifiedDate
	@Column(name = "updated_at", nullable = false, columnDefinition = "TIMESTAMP")
	private LocalDateTime updatedAt; //첫 수정일 = 생성일

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "board_id", nullable = false)
	private Board board; //소속 게시판

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = false)
	private User user; //작성자
}
