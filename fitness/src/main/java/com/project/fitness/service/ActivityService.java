package com.project.fitness.service;

import com.project.fitness.dto.ActivityRequest;
import com.project.fitness.dto.ActivityResponse;
import com.project.fitness.model.Activity;
import com.project.fitness.model.User;
import com.project.fitness.repository.ActivityRepository;
import com.project.fitness.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ActivityService {

    private final ActivityRepository activityRepository;

    private final UserRepository userRepository;


    public ActivityResponse trackActivity(ActivityRequest request) {
        User user = userRepository.findById(request.getUserId()).orElseThrow(() -> new RuntimeException("User not found with Id : " + request.getUserId()));

        Activity activity = Activity.builder()
                .user(user)
                .type(request.getType())
                .additionalMetrics(request.getAdditionalMetrics())
                .duration(request.getDuration())
                .caloriesBurned(request.getCaloriesBurned())
                .startTime(request.getStartTime())
                .build();
        Activity savedActivity = activityRepository.save(activity);

        return mapToActivityResponse(savedActivity);
    }

    public List<ActivityResponse> getUserActivities(Long userId) {
        List<Activity> activityList = activityRepository.findByUserId(userId);
        return activityList.stream()
                .map(this::mapToActivityResponse)
                .collect(Collectors.toList());
    }


    private ActivityResponse mapToActivityResponse(Activity savedActivity) {
        return ActivityResponse.builder()
                .id(savedActivity.getId())
                .userId(savedActivity.getUser().getId())
                .type(savedActivity.getType())
                .additionalMetrics(savedActivity.getAdditionalMetrics())
                .duration(savedActivity.getDuration())
                .caloriesBurned(savedActivity.getCaloriesBurned())
                .startTime(savedActivity.getStartTime())
                .createdAt(savedActivity.getCreatedAt())
                .updatedAt(savedActivity.getUpdatedAt())
                .build();
    }

}
