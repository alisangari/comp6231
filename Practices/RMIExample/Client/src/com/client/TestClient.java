package com.client;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import com.interf.test.Constants;
import com.interf.test.TestRemote;

public class TestClient {

	public static void main(String[] args) throws RemoteException, NotBoundException {
		// TODO Auto-generated method stub
		Registry registry = LocateRegistry.getRegistry("localhost",Constants.RMI_PORT);
		TestRemote remote = (TestRemote) registry.lookup(Constants.RMI_ID);
		
		System.out.println(remote.isLoginValid("aa"));
		System.out.println(remote.isLoginValid("test"));
		
		remote.stopServer();
	}

}
