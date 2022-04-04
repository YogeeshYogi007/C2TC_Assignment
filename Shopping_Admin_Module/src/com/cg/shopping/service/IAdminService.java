package com.cg.shopping.service;

public interface IAdminService {
	
		public boolean approveNewShop(Shop shop);
		public User updateuser(User user);
		public User login(user user);
		public boolean logout();
}
