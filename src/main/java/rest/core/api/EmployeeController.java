package rest.core.api;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import rest.core.entity.Employee;
import rest.core.exception.ResourceNotFoundException;
import rest.core.model.EmployeeModel;
import rest.core.model.GetResultWrapperListModel;
import rest.core.repository.EmployeeRepository;

@Api(basePath = "/api/employee", value = "Employee", description = "Employee Endpoint")
@RestController
@RequestMapping(value = "/api/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository emplRepo;
	
	@ApiOperation(value = "View a list of available employees with filter")
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ResponseEntity<GetResultWrapperListModel<EmployeeModel>> getList(
			@RequestParam(value = "filter", defaultValue = " deleted = FALSE") String filter,
			@RequestParam(value = "offset", defaultValue = "0") Integer offset,
			@RequestParam(value = "limit", defaultValue = "10") Integer limit,
			@RequestParam(value = "orderby", defaultValue = "fullName ASC") List<String> orderBy)
	throws ResourceNotFoundException{
		Date processingTime = new Date();
//		long start = System.currentTimeMillis();
//
//		List<EmployeeModel> list = new ArrayList<>();
//		list.add(new EmployeeModel("Dhia", "Ul Haq", "Dhia Ul Haq", "PKWT", false));
//		list.add(new EmployeeModel("Diyas", "Chandra", "Diyas Chandra", "PKWT", false));
		
		List<Employee> empls = emplRepo.findAll();
		
		List<EmployeeModel> models = new ArrayList<>();
		if(empls != null && !empls.isEmpty() && empls.size() > 0) {
			for(Employee e : empls) {
				EmployeeModel m = new EmployeeModel();
				m.setDeleted(e.getDeleted());
				m.setEmployementType(e.getEmployementType());
				m.setFirstName(e.getFirstName());
				m.setFullName(e.getFullName());
				m.setLastName(e.getLastName());
				m.setId(e.getId());
			
				models.add(m);
			}
		}
		
		GetResultWrapperListModel<EmployeeModel> results = new GetResultWrapperListModel<EmployeeModel>();
		results.setTotalItems(models.size());
		results.setItems(models);
		results.setProcessingTime(processingTime);
		
		return new ResponseEntity<>(results, HttpStatus.OK);
	}
	
	

}
