package no.hvl.dat110.rpc;

import java.nio.ByteBuffer;
import java.util.Arrays;
import no.hvl.dat110.TODO;
import java.nio.charset.StandardCharsets;

public class RPCUtils {

	public static byte[] encapsulate(byte rpcid, byte[] payload) {

		byte[] rpcmsg = null;

		rpcmsg = new byte[payload.length + 1];
		rpcmsg[0] = rpcid;
		System.arraycopy(payload, 0, rpcmsg, 1, payload.length);

		return rpcmsg;
	}

	public static byte[] decapsulate(byte[] rpcmsg) {

		byte[] payload = null;

		payload = Arrays.copyOfRange(rpcmsg, 1, rpcmsg.length);

		return payload;

	}

	public static byte[] marshallString(String str) {

		byte[] encoded = null;

		encoded = str.getBytes(StandardCharsets.UTF_8);

		return encoded;
	}

	public static String unmarshallString(byte[] data) {

		String decoded = null;

		decoded = new String(data, StandardCharsets.UTF_8);

		return decoded;
	}

	public static byte[] marshallVoid() {

		byte[] encoded = null;

		// TODO - START

		if (true)
			throw new UnsupportedOperationException(TODO.method());

		// TODO - END

		return encoded;

	}

	public static void unmarshallVoid(byte[] data) {

		// TODO

		if (true)
			throw new UnsupportedOperationException(TODO.method());

	}

	public static byte[] marshallBoolean(boolean b) {

		byte[] encoded = new byte[1];

		if (b) {
			encoded[0] = 1;
		} else
		{
			encoded[0] = 0;
		}

		return encoded;
	}

	public static boolean unmarshallBoolean(byte[] data) {

		return (data[0] > 0);

	}

	public static byte[] marshallInteger(int x) {

		byte[] encoded = null;

		// TODO - START

		if (true)
			throw new UnsupportedOperationException(TODO.method());

		// TODO - END

		return encoded;
	}


	public static int unmarshallInteger(byte[] data) {

		int decoded = 0;

		// TODO - START

		if (true)
			throw new UnsupportedOperationException(TODO.method());

		// TODO - END

		return decoded;

	}
}
