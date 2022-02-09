package no.hvl.dat110.rpc;

import no.hvl.dat110.TODO;
import no.hvl.dat110.messaging.*;

public class RPCClient {

	private MessagingClient msgclient;
	private Connection connection;

	public RPCClient(String server, int port) {

		msgclient = new MessagingClient(server,port);
	}

	public void connect() {

		connection = msgclient.connect();
	}

	public void disconnect() {

		connection.close();
	}

	public byte[] call(byte rpcid, byte[] params) {

		byte[] returnval = null;

		/*
		Make a remote call on the RPC server by sending an RPC request message
		and receive an RPC reply message

		params is the marshalled parameters from the client-stub

		The rpcid, params, and return value must be encapsulated/decapsulated
		according to the RPC message format
		*/

		byte[] requestmsgBytes = RPCUtils.encapsulate(rpcid, params);
		Message requestmsg = new Message(requestmsgBytes);
		connection.send(requestmsg);

		Message replymsg = connection.receive();
		byte[] replymsgBytes = replymsg.getData();
		returnval = RPCUtils.decapsulate(replymsgBytes);

		return returnval;
	}

}
