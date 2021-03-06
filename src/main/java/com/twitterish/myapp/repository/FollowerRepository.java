package com.twitterish.myapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.twitterish.myapp.model.Followers;
import com.twitterish.myapp.model.Session;

@Repository("followerRepository")
public interface FollowerRepository extends JpaRepository<Followers, Long>{
	List<Followers> findByFollower(String follower);
}
