package com.mkyong.common.controller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mkyong.common.controller.dao.SiteDao;
import com.mkyong.common.controller.model.Friend;

@Service
public class SiteService {

	@Autowired
	private SiteDao siteDao;
	
	/**
	 * @return
	 */
	public Friend getListOfSiteNames() {
		
		return siteDao.getListOfSiteName();
	}

	/**
	 * @param friend
	 * @return
	 */
	public List<Friend> addFriend(Friend friend) {

		return siteDao.addFriend(friend);
	}

}
