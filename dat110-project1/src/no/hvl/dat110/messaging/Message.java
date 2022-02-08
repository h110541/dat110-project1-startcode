package no.hvl.dat110.messaging;

import no.hvl.dat110.TODO;

public class Message {

	public static final int MAX_MESSAGE_SIZE = 127;

	private byte[] data;

	public Message(byte[] data) {

		if (data == null) {
			throw new RuntimeException("no data (data is null)");
		} else if (data.length > MAX_MESSAGE_SIZE) {
			throw new RuntimeException("data is too large");
		}

		this.data = data;
	}

	public byte[] getData() {
		return this.data;
	}

}
