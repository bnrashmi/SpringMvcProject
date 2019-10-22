package com.mkyong.common.controller.model;

import java.util.List;


//@Entity
public class Friend {

	//@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	//@JsonProperty("first-name")
	private String firstName;
	//@JsonProperty("last-name")
	private String lastName;
	
	/*private int age;
	@JsonIgnore
	private boolean married;
	@Embedded
	Address address;*/
	
	//@OneToMany(cascade= CascadeType.ALL)
	List<Address> addresses;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Friend(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public Friend() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the age
	 */
	/*public int getAge() {
		return age;
	}
	*//**
	 * @param age the age to set
	 *//*
	public void setAge(int age) {
		this.age = age;
	}
	*//**
	 * @return the married
	 *//*
	public boolean isMarried() {
		return married;
	}
	*//**
	 * @param married the married to set
	 *//*
	public void setMarried(boolean married) {
		this.married = married;
	}
	*//**
	 * @return the address
	 *//*
	public Address getAddress() {
		return address;
	}
	*//**
	 * @param address the address to set
	 *//*
	public void setAddress(Address address) {
		this.address = address;
	}*/
	/**
	 * @return the addresses
	 */
	public List<Address> getAddresses() {
		return addresses;
	}
	/**
	 * @param addresses the addresses to set
	 */
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	
	
}
