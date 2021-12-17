package sg.com.laps.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Role {
	@Id
	@Column(name = "roleid")
	private String roleId;
	@Column(name = "name")
	private String role_name;
	@Column(name = "description")
	private String description;
	
	
   	public Role(String roleId, String role_name, String description) {

		this.roleId = roleId;
		this.role_name = role_name;
		this.description = description;
	}
	public Role(String roleId) {
		this.roleId = roleId;
	}
}
