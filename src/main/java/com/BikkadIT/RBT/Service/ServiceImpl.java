package com.BikkadIT.RBT.Service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.RBT.Model.Address;
import com.BikkadIT.RBT.Model.Employee;
import com.BikkadIT.RBT.Repository.AddressRepository;
import com.BikkadIT.RBT.Repository.EmployeeRepository;

@Service
public class ServiceImpl implements ServiceI{
	@Autowired
	private AddressRepository addressRepository;
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	@Transactional(rollbackOn = Exception.class)
	public void save() {
		
		Employee emp = new Employee();
		emp.setEmpId(111);
		emp.setEmpName("Rahul");
		emp.setEmpAge(30);
		
		employeeRepository.save(emp);
		
		int a = 10/0;
		
		Address add = new Address();
		add.setAddId(22);
		add.setAddArea("Oasis Chauk");
		add.setAddCity("ABAD");
		
		addressRepository.save(add);
	}

}
