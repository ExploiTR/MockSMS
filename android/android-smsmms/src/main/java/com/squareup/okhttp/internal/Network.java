package com.squareup.okhttp.internal;
import java.net.InetAddress;
import java.net.UnknownHostException;
/**
 * Services specific to the host device's network interface. Prefer this over {@link
 * InetAddress#getAllByName} to make code more testable.
 */
public interface Network {
	Network DEFAULT = new Network() {
		@Override public InetAddress[] resolveInetAddresses(String host) throws UnknownHostException {
			if (host == null) throw new UnknownHostException("host == null");
			return InetAddress.getAllByName(host);
		}
	};
	InetAddress[] resolveInetAddresses(String host) throws UnknownHostException;
}