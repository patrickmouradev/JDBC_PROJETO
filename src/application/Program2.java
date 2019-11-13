package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		System.out.println("===Teste Department Find By Id: ");
		Department department = departmentDao.findById(1);
		System.out.println(department);

		System.out.println("\n ===Teste Department findAll: ");
		List<Department> listDepartments = departmentDao.findAll();

		for (Department depart : listDepartments) {
			System.out.println(depart);
		}

		System.out.println("\n ===Teste Department insertDepartment: ");
		Department newDepartment = new Department(null, "TimeSheets");

		departmentDao.insert(newDepartment);
		System.out.println("Inserido novo ID: " + newDepartment.getId());

		System.out.println("\n ===Teste Department update: ");
		department = departmentDao.findById(1);
		department.setName("Propina");
		departmentDao.update(department);
		System.out.println("Atualizado");
	
		System.out.println("\n ===Teste Department delete by ID: ");
		departmentDao.deleteById(5);
		System.out.println("Deletado");
	}
	

}
