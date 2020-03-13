package rest.core.enumlist;

public enum EmployementTypeEnum {
	
	PKWT("PKWT", "Employee Type for PKWT"),
	PKWTT("PKWTT", "Employee Type for PKWTT");
	
	public final Object defaultValue;
	public final String description;
	
	private EmployementTypeEnum(Object defaultValue, String description) {
		this.defaultValue = defaultValue;
		this.description = description;
	}

}
