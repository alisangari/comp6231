package com.test;

import java.rmi.AlreadyBoundException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import com.interf.test.Constants;

public class StopRMIServer {

	public static void main(String[] args) throws RemoteException, AlreadyBoundException, NotBoundException{
		RemoteImpl impl = new RemoteImpl();
		
		Registry registry = LocateRegistry.createRegistry(Constants.RMI_PORT);
		
		System.out.println("Stopping the server...");
//		UnicastRemoteObject.unexportObject(this, true);
		System.out.println("Server is shut down!");
		
		registry.unbind(Constants.RMI_ID);
		
		System.out.println("Server is stopped!");
	}
}
