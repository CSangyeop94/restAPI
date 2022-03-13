package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.restapi.model.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
