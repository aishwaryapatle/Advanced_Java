package com.springboot.tutorial.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springboot.tutorial.model.LiveSession;
import com.springboot.tutorial.repository.LiveSessionRepository;

@Service
public class LiveSessionImpl implements LiveSessionService{

	@Autowired
	private LiveSessionRepository liveSessionRepo;
	
	@Override
	public List<LiveSession> getAllLiveSession() {
		return liveSessionRepo.findAll();
	}

	@Override
	public void saveLiveSession(LiveSession t) {
		liveSessionRepo.save(t);
	}

	@Override
	public void deleteLiveSession(LiveSession t) {
		liveSessionRepo.delete(t);
	}

	@Override
	public Optional<LiveSession> getLiveSessionById(int id) {
		return liveSessionRepo.findById(id);
	}

	@Override
	public List<LiveSession> getAllUpcomingSession() {
		// TODO Auto-generated method stub
		return liveSessionRepo.getAllUpcoming();
	}
	

}
