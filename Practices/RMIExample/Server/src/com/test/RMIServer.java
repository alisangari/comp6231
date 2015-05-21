package com.test;

import java.rmi.AlreadyBoundException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import com.interf.test.Constants;

public class RMIServer {

	public static void main(String[] args) throws RemoteException, AlreadyBoundException, NotBoundException{
		RemoteImpl impl = new RemoteImpl();
		
		Registry registry = LocateRegistry.createRegistry(Constants.RMI_PORT);
		
		registry.bind(Constants.RMI_ID, impl);
		
		System.out.println("Server is started!");
	}
}
