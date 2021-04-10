package com.mini.mbti.repository;


import com.mini.mbti.model.Mbti_type;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Mbti_typeRepository extends JpaRepository<Mbti_type,Long> {
Mbti_type findByType(String want);
}
