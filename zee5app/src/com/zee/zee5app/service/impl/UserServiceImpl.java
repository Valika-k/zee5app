package com.zee.zee5app.service.impl;

import com.zee.zee5app.dto.Register;
import com.zee.zee5app.repository.UserRepository;
import com.zee.zee5app.service.UserService2;

public class UserServiceImpl implements UserService2 {
	private Register[] registers=new Register[10];
	private static int count=-1;
	private UserServiceImpl() {
		
	}
	private static UserService2 service;
	
	public static UserService2 getInstance() {
		if(service==null) {
			service=new UserServiceImpl();
		}
		return service;
	}
	
	@Override
	public String addUser(Register register) {
		// TODO Auto-generated method stub
		if(count==registers.length-1)
		{
			Register temp[]=new Register[registers.length*2];
			//add old contents to new
			System.arraycopy(registers,0,temp,0,registers.length);
			registers=temp;
			registers[++count]=register;
			return "array is full";
		}
		registers[++count]=register;
		return "success";
		
	}

	@Override
	public String updateUser(String id, Register register) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Register getUserById(String id) {
		// TODO Auto-generated method stub
		for(Register register : registers) {
			if(register!=null && register.getId().equals(id)  ) {
				return register;
			}
		}
		return null;
	}

	@Override
	public Register[] getAllUsers() {
		// TODO Auto-generated method stub
		return registers;
	}

	@Override
	public String deleteUserById(String id) {
		// TODO Auto-generated method stub
		int counter=-1;
		for(Register register : registers) {
			
			++counter;
			if(register!=null && register.getId().equals(id)  ) {
					Register rem= register;
					for(int i=counter;i<registers.length;i++) {
						registers[i]=registers[i+1];
					}
					
			}
			return "deleted "+id ;
		}
		return null;
	}

	@Override
	public Register[] getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteUser(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
