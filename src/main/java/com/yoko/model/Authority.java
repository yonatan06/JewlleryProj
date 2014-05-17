package com.yoko.model;

public class Authority {


	private String username;
	private Role role;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}

	
	
	
	public enum Role {
		ADMIN("ROLE_ADMIN"),USER("ROLE_USER");
		
		private String role;

		private Role(String role){
			this.role = role;
		}
		
		public String toString(){
			return this.role;
		}

		
	}
	
	
	
	
	
}
