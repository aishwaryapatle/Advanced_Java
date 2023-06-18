package com.springboot.tutorial.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.springboot.tutorial.model.LiveSession;

public interface LiveSessionService {

	List <LiveSession> getAllLiveSession();
	void saveLiveSession(LiveSession t);
	void deleteLiveSession(LiveSession t);
	Optional <LiveSession> getLiveSessionById(int id);
	List <LiveSession> getAllUpcomingSession();
}
