package com.application.jobConnect.repository;

import com.application.jobConnect.entity.JobPostActivity;
import com.application.jobConnect.entity.JobSeekerProfile;
import com.application.jobConnect.entity.JobSeekerSave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface JobSeekerSaveRepository extends JpaRepository<JobSeekerSave, Integer> {

    List<JobSeekerSave> findByUserId(JobSeekerProfile userAccountId);

    List<JobSeekerSave> findByJob(JobPostActivity job);
}
