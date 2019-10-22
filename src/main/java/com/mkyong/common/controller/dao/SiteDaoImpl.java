package com.mkyong.common.controller.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mkyong.common.controller.model.Friend;

@Repository
public class SiteDaoImpl implements SiteDao {

	@Autowired
	private DataSource datasource;
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public Friend getListOfSiteName() {
		
		String sql = "select * from friend" ;
		List<Friend> friend = jdbcTemplate.query(sql, new FriendMapper() );
		
		
		return friend.get(0);
	}

	class FriendMapper implements RowMapper<Friend> {
		  public Friend mapRow(ResultSet rs, int arg1) throws SQLException {
			  Friend friend = new Friend();
			  
			  friend.setFirstName(rs.getString("first_name"));
			  friend.setLastName(rs.getString("last_name"));
		    return friend;
		  }
	}
}
