package com.teamViewer.userServer.repository;

import java.nio.file.OpenOption;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teamViewer.userServer.model.UserModel;

/*JPA 에서는 단순히 Repository 인터페이스를 생성한후
JpaRepository<Entity, 기본키 타입> 을 extends하면 기본적인 Create, Read, Update, Delete가 자동으로 생성된다.*/
@Repository
public interface UserRepositoy extends JpaRepository<UserModel, String> {
	public Optional<UserModel> findById(String id);
	public Optional<UserModel> findByName(String name);
}
