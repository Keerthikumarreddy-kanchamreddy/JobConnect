package com.application.jobConnect.repository;

import com.application.jobConnect.entity.JobPostActivity;
import com.application.jobConnect.entity.JobSeekerApply;
import com.application.jobConnect.entity.JobSeekerProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobSeekerApplyRepository extends JpaRepository<JobSeekerApply, Integer> {

    List<JobSeekerApply> findByUserId(JobSeekerProfile userId);

    List<JobSeekerApply> findByJob(JobPostActivity job);
}
