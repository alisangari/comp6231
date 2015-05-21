package com.test;

import java.rmi.NoSuchObjectException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import com.interf.test.TestRemote;

public class RemoteImpl extends UnicastRemoteObject implements TestRemote {

	protected RemoteImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isLoginValid(String username) throws RemoteException {
		if (username.equals("test")) {
			return true;
		}
		return false;
	}
	
	@Override
	public void stopServer() throws NoSuchObjectException{
//		System.out.println("Stopping the server...");
//		UnicastRemoteObject.unexportObject(this, true);
//		System.out.println("Server is shut down!");
	}


}
