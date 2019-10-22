package com.mkyong.common.controller.dao;

import java.util.List;

import com.mkyong.common.controller.model.Friend;

public interface SiteDao {

	Friend getListOfSiteName();

	List<Friend> addFriend(Friend friend);
}
